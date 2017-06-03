package com.leminh.validator;

import com.leminh.model.SmartphoneInfo;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;
import org.springframework.stereotype.Component;

@Component
public class SmartphoneValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz == SmartphoneInfo.class;
	}

	@Override
	public void validate(Object target, Errors errors) {
		SmartphoneInfo smartphoneInfo = (SmartphoneInfo) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty.smartphoneForm.name");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "brand", "NotEmpty.smartphoneForm.brand");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "NotEmpty.smartphoneForm.price");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "year", "NotEmpty.smartphoneForm.year");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "detail", "NotEmpty.smartphoneForm.detail");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "image", "NotEmpty.smartphoneForm.image");
	}
}
