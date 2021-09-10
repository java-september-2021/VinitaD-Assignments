public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return("Galaxy Galaxy Galaxy lalalalaa");
    }
    @Override
    public String unlock() {
        return ("your Galxy phone is unlocked");
    }
    @Override
    public void displayInfo() {
        System.out.println("Varsion Number " + this.versionNumber+ " Battery Charged " + this.batteryPercentage + " carrier: " + this.carrier + " Ringtone: " + this.ringTone);         
    }
}

