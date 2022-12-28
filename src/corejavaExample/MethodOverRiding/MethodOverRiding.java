package corejavaExample.MethodOverRiding;

public class MethodOverRiding {
	public static void main (String[] args) {
	        Bike bike = new Bike(10,1);
	        System.out.println("Bike gear is: " +bike.gear);
	        System.out.println("Bike speed is: " +bike.speed);
	        bike.applyBrake(1);
	        System.out.println("Bike speed after applying brake is: " +bike.speed);
	        
	        Bike mountainBicycle = new MountainBicycle(50,50,3);
	        System.out.println("Mountain Bicycle Gear is: " +mountainBicycle.gear);
	        System.out.println("Mountain Bicycle Speed is: " +mountainBicycle.speed);
	        mountainBicycle.applyBrake(1);
	        System.out.println("Mountain Bicycle speed after applying break is: " +mountainBicycle.speed);
	        mountainBicycle.speedup(10);
	        System.out.println("Mountain Bicycle speed after speeding up is: " +mountainBicycle.speed);
	        
	                

	}

}
