package br.com.mrlrsx.dsvenda.dto;

import br.com.mrlrsx.dsvenda.entities.Seller;

import java.io.Serializable;

public class SellerSucessDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long visited;
    private String sellerName;
    private Long deals;

    public SellerSucessDTO(){}

    public SellerSucessDTO(Seller seller, Long visited, Long deals){
        this.sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }
}
