package br.com.mrlrsx.dsvenda.service;

import br.com.mrlrsx.dsvenda.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleServices {
    @Autowired
    private SaleRepository saleRepository;
}
