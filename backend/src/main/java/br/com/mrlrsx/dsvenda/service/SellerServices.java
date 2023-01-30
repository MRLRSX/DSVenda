package br.com.mrlrsx.dsvenda.service;

import br.com.mrlrsx.dsvenda.dto.SaleSumDTO;
import br.com.mrlrsx.dsvenda.dto.SellerDTO;
import br.com.mrlrsx.dsvenda.dto.SellerSucessDTO;
import br.com.mrlrsx.dsvenda.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SellerServices {
    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SellerDTO> findAll(Pageable pageable){
        return sellerRepository.findAll(pageable).map(SellerDTO::new);
    }


    @Transactional(readOnly = true)
    public List<SellerSucessDTO> sucessGroupedBySeller(){
        return sellerRepository.sucessGroupedBySeller();
    }
}
