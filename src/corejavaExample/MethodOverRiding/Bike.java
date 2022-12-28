package corejavaExample.MethodOverRiding;

public class Bike {
	 protected int gear;
	 protected int speed;
	 
	public Bike(int startSpeed, int startGear) {
		gear = startGear;
		speed = startSpeed;
	}
	
	public void SetGear(int newvalue) {
		gear = newvalue;
	}
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	public void speedup(int increment) {
		speed += increment;
	}
}
