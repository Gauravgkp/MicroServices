package com.stackroute.userProfile.service;

import java.util.List;
import com.stackroute.userProfile.domain.UserProfile;

public interface UserProfileService {

    public UserProfile saveTheUser(UserProfile userProfile) throws UserProfileAlreadyExistsException;
    public List<UserProfile> getAllUser() throws UserProfileNotFoundExeption;
    public List<UserProfile> getUserByMail(String mail) throws UserMailNotFoundExeption;
    public List<UserProfile> getUserByContact(int contact) throws UserContactNotFoundExeption;
    public UserProfile updateUser(String mail,int contact) throws UserProfileNotFoundExeption;
    public List<UserProfile> deleteUserbyContact(int userContact) throws UserContactNotFoundException;
    public List<UserProfile> deleteUserbyMail(String userMail) throws UserMailNotFoundException;
}
