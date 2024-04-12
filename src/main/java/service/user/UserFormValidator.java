package service.user;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import controller.user.UserForm;
import domain.user.User;



@Component
public class UserFormValidator implements Validator {

    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    public void validate(Object obj, Errors errors) {
        UserForm userForm = (UserForm)obj; 
        User user = userForm.getUser();

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "account.firstName", "FIRST_NAME_REQUIRED", "First name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "account.lastName", "LAST_NAME_REQUIRED", "Last name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "account.email", "EMAIL_REQUIRED", "Email address is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "account.phone", "PHONE_REQUIRED", "Phone number is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "account.address1", "ADDRESS_REQUIRED", "Address (1) is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "account.city", "CITY_REQUIRED", "City is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "account.state", "STATE_REQUIRED", "State is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "account.zip", "ZIP_REQUIRED", "ZIP is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "account.country", "COUNTRY_REQUIRED", "Country is required.");
        
        if (userForm.isNewUser()) {
            user.setStatus("OK");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "account.username", "USER_ID_REQUIRED", "User ID is required.");
            if (user.getPassword() == null || user.getPassword().length() < 1 ||
                    !user.getPassword().equals(userForm.getRepeatedPassword())) {
                errors.reject("PASSWORD_MISMATCH",
                     "Passwords did not match or were not provided. Matching passwords are required.");
            }
        }
        else if (user.getPassword() != null && user.getPassword().length() > 0) {
            if (!user.getPassword().equals(userForm.getRepeatedPassword())) {
                errors.reject("PASSWORD_MISMATCH", "Passwords did not match. Matching passwords are required.");
            }
        }
    }
}