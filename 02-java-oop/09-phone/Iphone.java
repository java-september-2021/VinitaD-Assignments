public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return("Iphone Iphone Iphone lalalalaa");
    }
    @Override
    public String unlock() {
        return ("your Iphone is unlocked");
    }
    @Override
    public void displayInfo() {
        System.out.println("Varsion Number " + this.versionNumber+ " Battery Charged " + this.batteryPercentage + " carrier: " + this.carrier + " Ringtone: " + this.ringTone);            
    }
}

