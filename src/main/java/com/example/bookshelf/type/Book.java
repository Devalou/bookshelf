package com.example.bookshelf.type;

import lombok.Getter;
import lombok.Setter;

@Getter

@Setter

public class Book {
    private long id;
    private String title;
    private String author;
    private Integer pagesSum;
    private Integer yearOfPublished;
    private String publishingHouse;


}
