package com.slm.spring.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testadd(){
        String sql = "insert into t_emp values(null,?,?,?)";

        int result = jdbcTemplate.update(sql, "llj", 21, "男");
        if (result != 0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    @Test
    public void  testdel(){
        String sql = "DELETE FROM t_emp WHERE id=?";
        int update = jdbcTemplate.update(sql, 2);
        if (update != 0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }

    @Test
    public void testupdate(){
        String sql = "UPDATE t_emp SET sex=? WHERE id=?";
        int i = jdbcTemplate.update(sql, "女", 1);
        if (i != 0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    @Test
    public void testquery(){
        String sql = "SELECT * FROM t_emp WHERE id=?";
        EmpBean empBean = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(EmpBean.class), 1);
        System.out.println(empBean);
    }

    @Test
    public void testqueryList(){
        String sql = "SELECT * FROM t_emp";
        List<EmpBean> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(EmpBean.class));
        for (EmpBean e:query){
            System.out.println(e);
        }
    }

    @Test
    public void testnum(){
        String sql = "SELECT count(*) FROM t_emp";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
    }
}
