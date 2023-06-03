package tostad.demo.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import tostad.demo.Validator.annotation.ValidUserId;
import tostad.demo.entity.User;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId,User> {
    @Override
    public boolean isValid (User user, ConstraintValidatorContext context){
        if(user== null)
            return true;
        return user.getId()!=null;

    }
}