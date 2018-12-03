package cglib_proxy_test;

public class Test {
    public static void main(String[] args) {
       TY y = new TY();
        TY t = (TY)new GPMeipo().getInstance(y);
         t.setName("lutt");
        t.findLove();
    }
}
