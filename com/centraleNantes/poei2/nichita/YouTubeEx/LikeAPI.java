package com.centraleNantes.poei2.nichita.YouTubeEx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LikeAPI {

    Map<Video,List<Like>> likes = new HashMap<>();

    default void dislike(Video video, User user){
        for (Like like:likes.get(video)){
            if(like.getRelatedUser().getUsername().equals(user.getUsername())){
                if(like.getPositive()){
                    like.setPositive(false);
                    return;
                }
                likes.get(video).remove(like);
                return;
            }
        }
        likes.get(video).add(new Like(video, user,false));
    }
    default void like(Video video, User user) {
        for (Like like:likes.get(video)){
            if(like.getRelatedUser().getUsername().equals(user.getUsername())){
                if(!like.getPositive()){
                    like.setPositive(true);
                }
                likes.get(video).remove(like);
                return;
            }
        }
        likes.get(video).add(new Like(video, user, true));
    }
    default List<Like> list(Video video){
        return likes.get(video);
    }
}
