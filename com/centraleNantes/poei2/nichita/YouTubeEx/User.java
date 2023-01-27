package com.centraleNantes.poei2.nichita.YouTubeEx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String username;
    private String password;
    private Date birthDate;
    private List<Like> likeList;

    public User(String username, String password, Date birthDate) {
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
        likeList=new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public List<Like> getLikeList() {
        return likeList;
    }

}
