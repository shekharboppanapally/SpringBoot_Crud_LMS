package com.tc.lms.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
public class OrderBookDTO {
    @Id
    private int userId;
    private List<Integer> order = new ArrayList<Integer>();

}
