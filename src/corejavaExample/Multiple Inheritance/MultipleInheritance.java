package corejavaExample;

public class MultipleInheritance {

	public static void main(String[] args) {
	
		MountainBikeInheritance mountainBikeInheritance = new MountainBikeInheritance(20,10,1);
		
		System.out.println("Gear is: " +mountainBikeInheritance. getGear());
		System.out.println("Seat height is: " +mountainBikeInheritance.getSeatHeight());
		System.out.println("Bike speed is:" +mountainBikeInheritance.getSpeed());
		
		mountainBikeInheritance.applyBrake(3);
		System.out.println("Bike speed after applying break: " +mountainBikeInheritance.getSpeed());
		mountainBikeInheritance.speedup(10);
		System.out.println("Bike's new speed after increment  : " +mountainBikeInheritance.getSpeed());
		
		mountainBikeInheritance.canRotateTwoWheelers();
		mountainBikeInheritance.canDrive();

	}

}
