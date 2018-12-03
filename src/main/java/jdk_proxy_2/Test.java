package jdk_proxy_2;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        Person ym = new YM();
        Person person = (Person)new GPMeipo().getInstance(ym);
        person.findLove();
    }
}
