package br.com.mrlrsx.dsvenda.resource;

import br.com.mrlrsx.dsvenda.dto.SaleDTO;
import br.com.mrlrsx.dsvenda.dto.SaleSumDTO;
import br.com.mrlrsx.dsvenda.service.SaleServices;
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
@RequestMapping("/sales")
public class SaleResource {

    @Autowired
    private SaleServices saleServices;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(@PageableDefault(size = 12) Pageable pageable){
        Page<SaleDTO> saleDTO = saleServices.findAll(pageable);
        return ResponseEntity.ok().body(saleDTO);
    }

    @GetMapping(value="/sum-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
        List<SaleSumDTO> saleSumDTO = saleServices.amountGroupedBySeller();
        return ResponseEntity.ok().body(saleSumDTO);
    }
}
