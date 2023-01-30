package br.com.mrlrsx.dsvenda.service;

import br.com.mrlrsx.dsvenda.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServices {
    @Autowired
    private SellerRepository sellerRepository;
}
