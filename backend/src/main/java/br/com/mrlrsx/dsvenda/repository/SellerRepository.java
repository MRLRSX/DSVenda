package br.com.mrlrsx.dsvenda.repository;

import br.com.mrlrsx.dsvenda.dto.SaleSumDTO;
import br.com.mrlrsx.dsvenda.dto.SellerSucessDTO;
import br.com.mrlrsx.dsvenda.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

    @Query("SELECT new br.com.mrlrsx.dsvenda.dto.SellerSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) FROM Sale obj GROUP BY obj.seller ")
    List<SellerSucessDTO> sucessGroupedBySeller();
}
