package br.com.mrlrsx.dsvenda.resource;

import br.com.mrlrsx.dsvenda.service.SellerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sellers")
public class SellerResource {
    @Autowired
    private SellerServices sellerServices;
}
