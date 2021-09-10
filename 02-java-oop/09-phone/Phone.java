public abstract class Phone {
    protected String versionNumber;
    protected int batteryPercentage;
    protected String carrier;
    protected String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters and setters removed for brevity. Please implement them yourself
    //getter
    public String getVersionNumber(){
        return this.versionNumber;
    }
    public int getBatteryPercentage(){
        return this.batteryPercentage;
    }
    public String getCarrierPercentage(){
        return this.carrier;
    }
    public String getRingTone(){
        return this.ringTone;
    }
    //setter
    public void setVersionNumber(String name){
        this.versionNumber = name;
    }
    public void setBatteryPercentage(int num){
        this.batteryPercentage = num;
    }
    public void setCarrierPercentage(String name){
        this.carrier = name;
    }
    public void setRingTone(String name){
        this.ringTone = name;
    }
}

