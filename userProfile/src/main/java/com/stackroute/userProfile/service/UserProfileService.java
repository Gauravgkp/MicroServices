package com.stackroute.userProfile.service;

import com.stackroute.userProfile.domain.UserProfile;
import com.stackroute.userProfile.exception.UserContactNotFoundException;
import com.stackroute.userProfile.exception.UserMailNotFoundException;
import com.stackroute.userProfile.exception.UserMailNotFoundException;
import com.stackroute.userProfile.exception.UserProfileAlreadyExistsException;
import com.stackroute.userProfile.exception.UserProfileNotFoundException;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserProfileService {

    public UserProfile saveTheUser(UserProfile userProfile) throws UserProfileAlreadyExistsException;
    public UserProfile getUserByMail(String mail) throws UserMailNotFoundException;
    public UserProfile getUserByContact(int contact) throws UserContactNotFoundException;
    public List<UserProfile> getAllUser() throws UserProfileNotFoundException;
    // public UserProfile updateUser(String mail,int contact) throws UserProfileNotFoundException;
    public List<UserProfile> deleteUserbyContact(int userContact) throws UserContactNotFoundException;
    public List<UserProfile> deleteUserbyMail(String userMail) throws UserMailNotFoundException;
//    public UserProfile findByUserContact(int contact);
//    public UserProfile findByUserId(int id);
}
