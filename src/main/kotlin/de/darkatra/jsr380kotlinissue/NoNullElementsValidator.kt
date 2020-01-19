package de.darkatra.jsr380kotlinissue

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class NoNullElementsValidator : ConstraintValidator<NoNullElements, Collection<Any>> {

	override fun isValid(value: Collection<Any>?, context: ConstraintValidatorContext): Boolean {

		// null values are valid
		if (value == null) {
			return true
		}

		return value.stream().noneMatch { it == null }
	}
}
