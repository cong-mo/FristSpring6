package com.slm.spring.iocxml.DIobj;

import java.util.Arrays;

public class Emp {
    private String name;
    private Integer age;

    private String[] loves;
    private Dept dept;

    public Emp() {
    }

    public Emp(String name, Integer age, Dept dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public Emp(String name, Integer age, String[] loves, Dept dept) {
        this.name = name;
        this.age = age;
        this.loves = loves;
        this.dept = dept;
    }


    public void work(){
        dept.dept_info();
        System.out.println("Emp"+name+".Word()");
        System.out.println(Arrays.toString(loves));
    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return loves
     */
    public String[] getLoves() {
        return loves;
    }

    /**
     * 设置
     * @param loves
     */
    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    /**
     * 获取
     * @return dept
     */
    public Dept getDept() {
        return dept;
    }

    /**
     * 设置
     * @param dept
     */
    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String toString() {
        return "Emp{name = " + name + ", age = " + age + ", loves = " + loves + ", dept = " + dept + "}";
    }
}
