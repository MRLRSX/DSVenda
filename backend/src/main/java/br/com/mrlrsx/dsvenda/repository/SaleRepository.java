package br.com.mrlrsx.dsvenda.repository;

import br.com.mrlrsx.dsvenda.dto.SaleSumDTO;
import br.com.mrlrsx.dsvenda.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new br.com.mrlrsx.dsvenda.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) FROM Sale obj GROUP BY obj.seller ")
    List<SaleSumDTO> amountGroupedBySeller();
}
