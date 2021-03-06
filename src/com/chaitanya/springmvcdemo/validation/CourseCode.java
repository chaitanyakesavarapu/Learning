package com.chaitanya.springmvcdemo.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	//define default coursecode
	public String[] value() default {"TOPS", "LUV"};
	
	//define defaults error message
	public String message() default "must start with TOPS or LUV";
	//define default groups
	public Class<?>[] groups() default {};
	
	//define default payloads
	public Class<? extends Payload> [] payload() default {};

}
