package com.tc.lms.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class SaveUserDTO {
    @Id
    private int userId;
    private String userName;
    private String userPassword;
    private String userphoneNumber;
    private String userEmail;
}
