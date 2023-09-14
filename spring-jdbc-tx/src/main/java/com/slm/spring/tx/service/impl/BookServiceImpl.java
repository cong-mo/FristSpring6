package com.slm.spring.tx.service.impl;

import com.slm.spring.tx.dao.BookDao;
import com.slm.spring.tx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Transactional
    @Override
    public void BuyBook(Integer BookId, Integer UserId) {
        Integer price = bookDao.GetBookPriceByBookId(BookId);

        bookDao.updatebookBalence(BookId);

        bookDao.updateUserBalence(UserId,price);

    }
}
