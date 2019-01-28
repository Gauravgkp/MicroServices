package com.stackroute.userProfile.service;

import com.stackroute.userProfile.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.sound.midi.Track;
import java.util.List;
import java.util.Optional;

    @Service
    public class UserProfileServiceImpl implements UserProfileService {

        //Making variable of Userrepository type
        private UserRepository userRepository;

        //This is setting the userRepository variable by constructor injection
        public UserProfileServiceImpl(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        //This method saves the Track

        @Override
        public UserProfile saveTheUser(UserProfile userProfile) throws UserProfileAlreadyExistsException {
                if (userRepository.existsById(userprofile.getUserId())) {
                    throw new UserProfileAlreadyExistsException("user already exists");
                }
                userRepository.save(userProfile);
                return userProfile;
            }



        @Override
        public List<UserProfile> getUserByMail(String mail) throws UserMailNotFoundExeption {
            return null;
        }

        @Override
        public List<UserProfile> getUserByContact(int contact) throws UserContactNotFoundExeption {
            return null;
        }

        @Override
        public List<UserProfile> getAllUser(UserProfile userProfile) {
            return null;
        }

        @Override
        public UserProfile updateUser(String Mail, int contact) throws UserProfileNotFoundExeption {
            return null;
        }

        @Override
        public List<UserProfile> deleteUserbyContact(int userContact) throws UserContactNotFoundException {
            return null;
        }

        @Override
        public List<UserProfile> deleteUserbyMail(String userMail) throws UserMailNotFoundException {
            return null;
        }


    }

