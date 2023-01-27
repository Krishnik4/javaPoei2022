package com.centraleNantes.poei2.nichita.YouTubeEx;

import java.util.ArrayList;
import java.util.Date;

public class VideoTransformer {
    public static Video cloneVideo(Video video){
        return new Video(video.getLength(), video.getTitle(), new Date());
    }
}
