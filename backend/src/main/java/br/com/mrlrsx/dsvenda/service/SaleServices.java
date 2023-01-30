package br.com.mrlrsx.dsvenda.service;

import br.com.mrlrsx.dsvenda.dto.SaleDTO;
import br.com.mrlrsx.dsvenda.dto.SaleSumDTO;
import br.com.mrlrsx.dsvenda.dto.SalesSucessDTO;
import br.com.mrlrsx.dsvenda.repository.SaleRepository;
import br.com.mrlrsx.dsvenda.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleServices {
    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        return saleRepository.findAll(pageable).map(SaleDTO::new);
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
         List<SaleSumDTO> saleSumDTO = saleRepository.amountGroupedBySeller();
        return saleSumDTO;
    }

    @Transactional(readOnly = true)
    public List<SalesSucessDTO> sucessGroupedBySeller(){
        List<SalesSucessDTO> salesSucessDTO =  saleRepository.sucessGroupedBySeller();
        return salesSucessDTO;
    }
}
