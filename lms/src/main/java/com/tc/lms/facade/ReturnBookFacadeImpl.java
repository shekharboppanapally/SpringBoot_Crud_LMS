package com.tc.lms.facade;
import com.tc.lms.dto.ReturnBookDTO;
import com.tc.lms.model.User;
import com.tc.lms.service.ReturnBookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReturnBookFacadeImpl implements ReturnBookFacade{
    @Autowired
    private ReturnBookService returnBookService;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public ReturnBookDTO returnBook(ReturnBookDTO returnBookDTO) {
        User user=modelMapper.map(returnBookDTO, User.class);
        user=returnBookService.returnBook(user);
        returnBookDTO=modelMapper.map(user, ReturnBookDTO.class);
        return returnBookDTO;
    }
}
