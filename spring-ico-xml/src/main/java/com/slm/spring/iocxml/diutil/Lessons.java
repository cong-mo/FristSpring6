package com.slm.spring.iocxml.diutil;

public class Lessons {

    private String name;


    public Lessons() {
    }

    public Lessons(String name) {
        this.name = name;
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

    public String toString() {
        return "Lessons{name = " + name + "}";
    }
}
