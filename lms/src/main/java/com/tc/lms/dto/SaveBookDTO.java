package com.tc.lms.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
public class SaveBookDTO {
    @Id
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private int bookPages;
    private int booksAvailable;
}
