package co.villalabs.backend.financing.domain.financing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class FinancingValidator implements Validator {
	
	@Autowired
	public FinancingValidator() {
		
	}
	
	@Override
	public boolean supports(Class clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		
	}
}
