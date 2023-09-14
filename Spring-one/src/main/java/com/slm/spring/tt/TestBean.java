package com.slm.spring.tt;

public class TestBean {

    private String Id;
    private String name;


    public TestBean() {
        System.out.println("无参构造");
    }

    public TestBean(String Id, String name) {

        this.Id = Id;
        this.name = name;
        System.out.println("有参构造");
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
        System.out.println("ID赋值");
        this.Id = Id;
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
        System.out.println("Name赋值");
        this.name = name;
    }

    public String toString() {
        return "TestBean{Id = " + Id + ", name = " + name + "}";
    }
}
