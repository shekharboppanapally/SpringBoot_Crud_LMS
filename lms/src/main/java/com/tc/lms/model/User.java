package com.tc.lms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Document(collection = "Users")
public class User {
    @Id
    private int userId;
    private String userName;
    private String userPassword;
    private String userphoneNumber;
    private String userEmail;
    private List<Integer> order = new ArrayList<Integer>();
}
