package co.villalabs.backend.financing.domain.financing;

import org.springframework.data.jpa.repository.JpaRepository;

import co.villalabs.backend.financing.domain.financing.Financing;

public interface FinancingRepository extends JpaRepository<Financing, Long> {
}