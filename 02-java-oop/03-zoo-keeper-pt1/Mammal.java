public class Mammal {
    public Integer energyLevel = 100;
    public Integer displayEnergy() {
        System.out.println("my energy level " + this.energyLevel);
        return this.energyLevel;
    }
    public Mammal(Integer energyLevel) {
        this.energyLevel = energyLevel;
    }
}