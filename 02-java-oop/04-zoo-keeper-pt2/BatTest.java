public class BatTest {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.fly();
        bat.fly();
        bat.fly();
        bat.eatHumans();
        System.out.println(bat.displayEnergy());
        bat.eatHumans();
        System.out.println(bat.displayEnergy());
        bat.attackTown();
        System.out.println(bat.displayEnergy());
        bat.attackTown();
        System.out.println(bat.displayEnergy());
    }
}