package corejavaExample;

 class MountainBicycle extends Bike{
	 public int SeatHeight;
	 
	 public MountainBicycle(int StartHeight,
			             int startSpeed,
			              int startGear) {
		 super(startSpeed, startGear);
		 this.SeatHeight = StartHeight;
	 }
	 
	 public void SetHeight(int newvalue) {
		 SeatHeight = newvalue;
	 }

 }