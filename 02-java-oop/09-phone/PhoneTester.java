public class PhoneTester {
    public static void main (String[] args) {
        Iphone iphone10 = new Iphone("x", 100, "atnt", "zing");
        Galaxy g10 = new Galaxy("g10", 90, "sprint", "ting");

        g10.displayInfo();
        System.out.println(g10.ring());
        System.out.println(g10.unlock());

        iphone10.displayInfo();
        System.out.println(iphone10.ring());
        System.out.println(iphone10.unlock());
    }
}