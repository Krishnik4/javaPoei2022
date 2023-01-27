package com.centraleNantes.poei2.nichita.YouTubeEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VideoAPI {

    Map<User,List<Video>> userVideos = new HashMap<>();

    default List<Video> list(User user){
        return userVideos.get(user);
    }

    default void load(Video video,User user){
        if(!userVideos.containsKey(user)) {
            userVideos.put(user,new ArrayList<>());
        }
        userVideos.get(user).add(video);
    }

}
