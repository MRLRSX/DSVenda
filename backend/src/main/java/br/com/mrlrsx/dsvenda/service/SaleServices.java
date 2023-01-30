package br.com.mrlrsx.dsvenda.service;

import br.com.mrlrsx.dsvenda.dto.SaleDTO;
import br.com.mrlrsx.dsvenda.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleServices {
    @Autowired
    private SaleRepository saleRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        return saleRepository.findAll(pageable).map(SaleDTO::new);
    }
}
