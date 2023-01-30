package br.com.mrlrsx.dsvenda.service;

import br.com.mrlrsx.dsvenda.dto.SellerDTO;
import br.com.mrlrsx.dsvenda.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SellerServices {
    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SellerDTO> findAll(Pageable pageable){
        return sellerRepository.findAll(pageable).map(SellerDTO::new);
    }


}
