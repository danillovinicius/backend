package co.villalabs.backend.financing.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.villalabs.backend.financing.domain.financing.FinancingRepository;
import co.villalabs.backend.financing.application.financing.impl.FinancingRepositoryImpl;
import co.villalabs.backend.financing.domain.financing.Financing;


@RestController
@RequestMapping("/financing")
public class FinancingRestController {
	
	private FinancingRepository repository;
	
	@Autowired
	public FinancingRestController() {
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Financing> all() {
		repository = new FinancingRepositoryImpl();
		return repository.findAll();
	}
}
