package com.tc.lms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "Books")
public class Book {
    @Id
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private int bookPages;
    private int booksAvailable;
}
