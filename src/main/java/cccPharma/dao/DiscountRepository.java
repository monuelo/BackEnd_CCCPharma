package cccPharma.dao;

import java.util.List;
import cccPharma.model.Discount;
import org.springframework.data.repository.CrudRepository;

public interface DiscountRepository extends CrudRepository<Discount, Long> {

    List<Discount> findByDescription(String description);
}