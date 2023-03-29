package com.tc.lms.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class ReturnBookDTO {
    private int userId;
    private List<Integer> order = new ArrayList<Integer>();
}
