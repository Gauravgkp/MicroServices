package com.stackroute.userProfile.service;

import java.util.List;

public interface UserProfileService {

    public UserProfile saveTheUser(UserProfile userProfile) throws UserProfileAlreadyExistsException;
    public List<UserProfile> getUserByMail(String mail) throws UserMailNotFoundExeption;
    public List<UserProfile> getUserByContact(int contact) throws UserContactNotFoundExeption;
    public List<UserProfile> getAllUser(UserProfile userProfile);
    public UserProfile updateUser(String Mail,int contact) throws UserProfileNotFoundExeption;
    public List<UserProfile> deleteUserbyContact(int userContact) throws UserContactNotFoundException;
    public List<UserProfile> deleteUserbyMail(String userMail) throws UserMailNotFoundException;
}
