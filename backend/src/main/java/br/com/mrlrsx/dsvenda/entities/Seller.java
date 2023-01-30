package br.com.mrlrsx.dsvenda.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="tb_sellers")
public class Seller implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;

    private String name;

    @OneToMany(mappedBy = "seller")
    private Set<Sale> sales = new HashSet<>();

    public Long getId() {
        return id;
    }

    public Seller(){}
    public Seller(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public Set<Sale> getSales() {
        return sales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller seller)) return false;
        return id.equals(seller.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
