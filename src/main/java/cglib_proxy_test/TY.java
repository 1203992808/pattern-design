package cglib_proxy_test;

public class TY {
    private String name;
    private String sex;
    private int age;
    private String requirements;
    public TY(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
    public void findLove () {
        System.out.println("我的名字是 "+name+" 年纪是 "+age+" 我的要求是 "+requirements);
    }
}
