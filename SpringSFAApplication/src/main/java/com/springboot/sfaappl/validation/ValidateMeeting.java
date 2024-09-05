package com.springboot.sfaappl.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = MeetingValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateMeeting {

	String message() default "The same salesperson already met the doctor for the day";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
