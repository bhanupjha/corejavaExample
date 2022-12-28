package corejavaExample;

 class MountainBike extends Bicycle{
	 public int SeatHeight;
	 
	 public MountainBike(int StartHeight,
			             int startSpeed,
			              int startGear) {
		 super(startSpeed, startGear);
		 this.SeatHeight = StartHeight;
	 }
	 
	 public void SetHeight(int newvalue) {
		 SeatHeight = newvalue;
	 }

}
