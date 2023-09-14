package com.slm.spring.iocxml.DIobj;

import java.util.List;

public class Dept {

    private List<Emp> empList;
    private String name;

    public Dept() {
    }

    public Dept(String name) {
        this.name = name;
    }

    public Dept(List<Emp> empList, String name) {
        this.empList = empList;
        this.name = name;
    }

    public void dept_info(){
        System.out.println("Dept:" + name);
        for (Emp e:empList) {
            System.out.println(e.getName());
        }
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
        return "Dept{name = " + name + "}";
    }

    /**
     * 获取
     * @return empList
     */
    public List<Emp> getEmpList() {
        return empList;
    }

    /**
     * 设置
     * @param empList
     */
    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }
}
