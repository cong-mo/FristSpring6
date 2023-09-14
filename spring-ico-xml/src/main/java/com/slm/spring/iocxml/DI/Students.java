package com.slm.spring.iocxml.DI;

public class Students {
    private String name;
    private Integer age;


    public Students() {
    }

    public Students(String name, Integer age) {
        System.out.println("构造函数");
        this.name = name;
        this.age = age;
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

    public String toString() {
        return "Students{name = " + name + ", age = " + age + "}";
    }
}
