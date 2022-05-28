package module1;

public class Vehicle {

	private String color;
    protected int maxSpeed;
    
    public Vehicle(int maxSpeed) {
    	this.maxSpeed = maxSpeed;
    	System.out.println("Vehicle's constructor maxspeed "+this.maxSpeed);
    }
    public String getColor() {
    	return color;
    }
    
    public void setColor(String color) {
    	this.color = color;
    }
    
    void print()
    {
        System.out.println("vehicle "+"color "+color+" max speed "+maxSpeed);
    }
	}



