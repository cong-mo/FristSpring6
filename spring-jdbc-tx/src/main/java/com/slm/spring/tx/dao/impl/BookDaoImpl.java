package com.slm.spring.tx.dao.impl;

import com.slm.spring.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void BuyBook(Integer BookId, Integer UserId) {

    }

    @Override
    public Integer GetBookPriceByBookId(Integer BookId) {
        String sql = "SELECT price FROM t_book WHERE book_id=?";
        Integer price = jdbcTemplate.queryForObject(sql, Integer.class, BookId);
        return price;
    }

    @Override
    public void updatebookBalence(Integer BookId) {
        String sql = "update t_book set stock=stock-1 where book_id=?";
        jdbcTemplate.update(sql,BookId);
    }

    @Override
    public void updateUserBalence(Integer UserId,Integer price) {
        String sql = "update t_user set balance=balance-? where user_id=?";
        jdbcTemplate.update(sql,price,UserId);
    }
}
