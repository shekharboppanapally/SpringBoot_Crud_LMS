package com.tc.lms.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserDTO {
    @Id
    private int userId;
    private String userName;
    private String userphoneNumber;
    private String userEmail;
    private List<Integer> order = new ArrayList<Integer>();


}
