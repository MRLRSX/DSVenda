package br.com.mrlrsx.dsvenda.dto;

import br.com.mrlrsx.dsvenda.entities.Sale;
import br.com.mrlrsx.dsvenda.entities.Seller;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class SellerDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;

    private Set<SaleDTO> sales = new HashSet<>();

    public SellerDTO(){}
    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public SellerDTO(Seller seller){
        this(seller.getId(), seller.getName());
    }
    public SellerDTO(Seller entity, Set<Sale> sale){
        this(entity.getId(), entity.getName());
        sale.stream().map(obj -> this.sales.add(new SaleDTO(obj)));
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<SaleDTO> getSales() {
        return sales;
    }
}
