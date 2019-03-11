package co.villalabs.backend.financing.domain.buyer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.villalabs.backend.financing.domain.buyer.Buyer;

@Repository
public interface BuyerRepository extends CrudRepository<Buyer, Long> {
	
}
