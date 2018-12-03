package jdk_proxy;

public class test {
    public static void main(String[] args) throws Exception {
        Ytt ytt = new Ytt();
        Person person = (Person)new GPMeipo().getInstance(ytt);
        person.findLove();
    }
}
