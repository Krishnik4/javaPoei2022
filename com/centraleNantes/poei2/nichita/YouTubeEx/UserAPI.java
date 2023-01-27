package com.centraleNantes.poei2.nichita.YouTubeEx;

import java.util.*;

public interface UserAPI {

    Map<String,User> users = new HashMap<>();

    default User login(String username, String password) throws Exception {
        if(Objects.equals(users.get(username).getPassword(), password)) {
            return users.get(username);
        }
        else{
            throw new Exception("Wrong password");
        }
    }

    default void register(User user){
        users.put(user.getUsername(),user);
    }
}
