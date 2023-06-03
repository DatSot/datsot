package tostad.demo.Validator.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import tostad.demo.Validator.ValidUsernameValidator;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidUsernameValidator.class)
public @interface ValidUsername {
    String message() default "UserName already exists";
    Class<?>[]groups()default {};
    Class<? extends Payload>[]payload()default {};
}
