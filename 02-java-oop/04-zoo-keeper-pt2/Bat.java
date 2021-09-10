import com.zk1.Mammal;

public class Bat extends Mammal {
    public Bat (){
        super(300);
    }
    public void fly() {
        System.out.println(" a bat taking off ");
        this.energyLevel -= 50;
    }
    public void eatHumans() {
        System.out.println("the so- well, never mind");
        this.energyLevel += 25;
    }
    public void attackTown() {
        System.out.println(" the sound of a town on fire");
        this.energyLevel -= 100;
    }

    @Override
    public Integer displayEnergy() {
        return super.displayEnergy();
    }
}