package jdK_proxy_test;

public class Lutt implements Person {
    private int id;
    private String name;
    private  int age;
    private String requirements;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public void findLove() {
        System.out.println("我的名字是"+this.name+" 年纪是 "+this.age+" 要求是："+this.requirements);

    }
}
