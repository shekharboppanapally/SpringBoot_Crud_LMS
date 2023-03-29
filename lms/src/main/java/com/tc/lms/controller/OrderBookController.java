package com.tc.lms.controller;

import com.tc.lms.dto.OrderBookDTO;
import com.tc.lms.facade.OrderBookFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderBookController {
    @Autowired
    private OrderBookFacade orderBookFacade;
    @PutMapping("/orderBook")
    public OrderBookDTO orderBook(@RequestBody OrderBookDTO orderBookDTO){
        return orderBookFacade.orderBook(orderBookDTO);
    }
}
