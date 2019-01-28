package com.stackroute.userProfile.service;

import com.stackroute.userProfile.domain.Track;
import com.stackroute.userProfile.exception.TrackAlreadyExistsException;
import com.stackroute.userProfile.exception.TrackNotFoundExeption;

import java.util.List;

/**This is the service layer where the various methods are
 * mentioned which needs to be overriden in th e implementation
 */

public interface TrackService {

    public Track saveTheTrack(Track track) throws TrackAlreadyExistsException;

    public List<Track> returnAllTracks() throws TrackNotFoundExeption;

    public Track updateTrack(int trackId, String comments) throws TrackNotFoundExeption;

    public List<Track> deletTrack(int trackid) throws TrackNotFoundExeption;

//    public List<Track> getByTrackNAme(String name) throws TrackNotFoundExeption;
}
