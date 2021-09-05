public class Gorilla extends Mammal {
    public Gorilla(Integer energyLevel) {
		super(energyLevel);
	}
    public void throwSomething() {
        System.out.println("Gorilla has thrown something");
        energyLevel -= 5;
    }
    public void eatBananas() {
        System.out.println("eating bananas");
		energyLevel += 10;
    }
    public void climb() {
        System.out.println("climbing stuff here");
		energyLevel -= 10;
    }
}