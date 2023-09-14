package com.slm.spring.tx.dao.controller;

import com.slm.spring.tx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void BuyBook(Integer BookId,Integer UserId){
        bookService.BuyBook(BookId,UserId);
    }
}
