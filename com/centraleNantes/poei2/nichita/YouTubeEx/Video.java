package com.centraleNantes.poei2.nichita.YouTubeEx;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Video {
    private int length;
    private String title;
    private Date publicationDate;
    public static int instanceNumber=0;

    public Video(int length, String title, Date publicationDate) {
        this.length = length;
        this.title = title;
        this.publicationDate = publicationDate;
        ++instanceNumber;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return getTitle().equals(video.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle());
    }
}
