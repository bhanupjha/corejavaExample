package corejavaExample;

 class MountainBikeInheritance extends TwoWheelersInheritance implements BicycleInheritance, VechileInheritance{
	 
	 private int SeatHeight;
	 private int gear;
	 private int speed;
	 
	 public MountainBikeInheritance(int StartHeight,
			             int startSpeed,
			              int startGear) {
		
		 setSeatHeight(StartHeight);
		 setSpeed(startSpeed);
		 setGear(startGear);
	 }

	@Override
	public void applyBrake(int decrement) {
	        setSpeed(getSpeed() - decrement);
	}

	@Override
	public void speedup(int increment) {
		 setSpeed(getSpeed() + increment);
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSeatHeight() {
		return SeatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		SeatHeight = seatHeight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void canDrive() {
		System.out.println("Mountain bike can be driven");
		
		
		
	}
	 
	
}


	 

