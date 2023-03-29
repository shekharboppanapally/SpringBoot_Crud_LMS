package com.tc.lms.facade;

import com.tc.lms.dto.OrderBookDTO;
import com.tc.lms.model.User;
import com.tc.lms.service.OrderBookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderBookFacadeImpl implements OrderBookFacade{
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private OrderBookService orderBookService;
    @Override
    public OrderBookDTO orderBook(OrderBookDTO orderBookDTO) {
        User user=modelMapper.map(orderBookDTO, User.class);
        user=orderBookService.orderBook(user);
        orderBookDTO=modelMapper.map(user,OrderBookDTO.class);
        return orderBookDTO;
    }
}
