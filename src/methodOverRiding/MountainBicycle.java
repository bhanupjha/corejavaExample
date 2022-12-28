package methodOverRiding;

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
		 public void setGear(int newvalue) {
			 gear = newvalue +2;
	}
		 public void applyBrake(int decrement) {
			 speed = speed - decrement - 10;
		 }
		 public void speedup(int increment) {
			 speed = speed + increment + 10;
		 }

}
