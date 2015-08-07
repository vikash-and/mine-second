package org.reglogin.persistence.service;

import org.reglogin.persistence.model.User;
import org.reglogin.persistence.model.VerificationToken;
import org.reglogin.validation.service.EmailExistsException;

public interface IUserService {

    User registerNewUserAccount(UserDto accountDto) throws EmailExistsException;

    User getUser(String verificationToken);

    void saveRegisteredUser(User user);

    void deleteUser(User user);

    void createVerificationTokenForUser(User user, String token);

    VerificationToken getVerificationToken(String VerificationToken);

}
