package br.com.mrlrsx.dsvenda.resource;

import br.com.mrlrsx.dsvenda.service.SaleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")
public class SaleResource {

    @Autowired
    private SaleServices saleServices;
}
