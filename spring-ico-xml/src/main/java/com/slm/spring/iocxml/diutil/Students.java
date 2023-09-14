package com.slm.spring.iocxml.diutil;

import java.util.List;

public class Students {

    private String name;
    private String Id;

    private List<Lessons> lessonsList;


    public Students() {
    }

    public Students(String name, String Id, List<Lessons> lessonsList) {
        this.name = name;
        this.Id = Id;
        this.lessonsList = lessonsList;
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
     * @return Id
     */
    public String getId() {
        return Id;
    }

    /**
     * 设置
     * @param Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取
     * @return lessonsList
     */
    public List<Lessons> getLessonsList() {
        return lessonsList;
    }

    /**
     * 设置
     * @param lessonsList
     */
    public void setLessonsList(List<Lessons> lessonsList) {
        this.lessonsList = lessonsList;
    }

    public String toString() {
        return "Students{name = " + name + ", Id = " + Id + ", lessonsList = " + lessonsList + "}";
    }
}
