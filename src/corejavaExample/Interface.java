package corejavaExample;

public class Interface {

	public static void main(String[] args) {
		
				MountainBikeInterface mountainBikeInterface = new MountainBikeInterface(20,10,1);
				
				System.out.println("Gear is: " +mountainBikeInterface. getGear());
				System.out.println("Seat height is: " +mountainBikeInterface.getSeatHeight());
				System.out.println("Bike speed is:" +mountainBikeInterface.getSpeed());
				
				mountainBikeInterface.applyBrake(2);
				System.out.println("Bike speed after applying break: " +mountainBikeInterface.getSpeed());
				mountainBikeInterface.speedup(10);
				System.out.println("Bike's new speed after increment  : " +mountainBikeInterface.getSpeed());
			}

		}

	


