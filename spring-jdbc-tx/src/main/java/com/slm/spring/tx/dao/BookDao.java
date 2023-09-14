package com.slm.spring.tx.dao;

public interface BookDao {

    public void BuyBook(Integer BookId,Integer UserId);

    public Integer GetBookPriceByBookId(Integer BookId);

    public void updatebookBalence(Integer BookId);

    public void updateUserBalence(Integer UserId,Integer price);
}
