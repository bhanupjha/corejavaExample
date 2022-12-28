package corejavaExample;

 class Bicycle {
	 protected int gear;
	 protected int speed;
	 
	public Bicycle(int startSpeed, int startGear) {
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
