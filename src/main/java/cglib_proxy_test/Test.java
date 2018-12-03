package cglib_proxy_test;

public class Test {
    public static void main(String[] args) {
       TY y = new TY();
       y.setName("刘诗诗");
       y.setAge(23);
       y.setRequirements("找个高富帅");
        TY t = (TY)new GPMeipo().getInstance(y);
        t.findLove();
    }
}
