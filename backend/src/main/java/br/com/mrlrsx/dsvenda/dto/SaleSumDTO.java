package br.com.mrlrsx.dsvenda.dto;

import br.com.mrlrsx.dsvenda.entities.Sale;
import br.com.mrlrsx.dsvenda.entities.Seller;

import java.io.Serializable;

public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sellerName;
    private Double sum;


    public SaleSumDTO(){}

    public SaleSumDTO(String name, Double sum){
        this.sellerName = name;
        this.sum = sum;
    }
    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
