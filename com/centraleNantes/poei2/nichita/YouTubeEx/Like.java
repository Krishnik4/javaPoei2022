package com.centraleNantes.poei2.nichita.YouTubeEx;

import java.util.Objects;

public class Like {
    private Video relatedVideo;
    private User relatedUser;
    private Boolean positive;

    public Like(Video relatedVideo, User relatedUser, Boolean positive) {
        this.relatedVideo = relatedVideo;
        this.relatedUser = relatedUser;
        this.positive = positive;
    }

    public Video getRelatedVideo() {
        return relatedVideo;
    }

    public void setRelatedVideo(Video relatedVideo) {
        this.relatedVideo = relatedVideo;
    }

    public User getRelatedUser() {
        return relatedUser;
    }

    public void setRelatedUser(User relatedUser) {
        this.relatedUser = relatedUser;
    }

    public Boolean getPositive() {
        return positive;
    }

    public void setPositive(Boolean positive) {
        this.positive = positive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Like like = (Like) o;
        return getRelatedVideo().equals(like.getRelatedVideo()) && getRelatedUser().equals(like.getRelatedUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRelatedVideo(), getRelatedUser());
    }
}
