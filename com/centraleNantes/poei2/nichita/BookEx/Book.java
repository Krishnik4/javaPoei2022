package com.centraleNantes.poei2.nichita.BookEx;

import java.util.List;

public class Book {
    String name;
    List<Chapter> chapters;

    public Book(String name, List<Chapter> chapters) {
        this.name = name;
        this.chapters = chapters;
    }

    public String getChapterName(int page){
        for (Chapter chapter:this.chapters) {
            if(page>=chapter.startPageNb && page<=chapter.endPageNb){
                return chapter.name;
            }
        }
        return "No such page";
    }
}
