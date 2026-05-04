package BehaviouralDesignPatterns.CommandPattern.HomeAutomationExample.GoodCode;

/**
 * Receiver: Light
 */
class Light {
    public void turnOn() { System.out.println("Light is ON"); }
    public void turnOff() { System.out.println("Light is OFF"); }
}

/**
 * Receiver: Air Conditioner
 */
class AirConditioner {
    private int temperature;
    
    public void turnOn() { 
        this.temperature = 24;
        System.out.println("AC is ON at " + temperature + " degrees"); 
    }
    public void turnOff() { System.out.println("AC is OFF"); }
    
    public void setTemperature(int temp) { 
        this.temperature = temp;
        System.out.println("AC Temperature set to " + temperature); 
    }
}
