package br.com.mrlrsx.dsvenda.resource;


import br.com.mrlrsx.dsvenda.dto.SellerDTO;
import br.com.mrlrsx.dsvenda.dto.SellerSucessDTO;
import br.com.mrlrsx.dsvenda.service.SellerServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerResource {
    @Autowired
    private SellerServices sellerServices;

    @GetMapping
    public ResponseEntity<Page<SellerDTO>> findAll(@PageableDefault(size = 12)Pageable pageable){
        Page<SellerDTO> sellerDTO = sellerServices.findAll(pageable);
        return ResponseEntity.ok().body(sellerDTO);
    }

    @GetMapping(value="/sucess-by-seller")
    public ResponseEntity<List<SellerSucessDTO>> amountGroupedBySeller(){
        List<SellerSucessDTO> sellerSucessDTO = sellerServices.sucessGroupedBySeller();
        return ResponseEntity.ok().body(sellerSucessDTO);
    }
}
