package corejavaExample;

public class Cuboid {

	int width;
	int height;
	int depth;
	
	Cuboid(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	Cuboid(int width, int height){
		this.width = width;
		this.height = height;
		this.depth = 10;
	}
	Cuboid (int dimension){
		width = dimension;
		height = dimension;
		depth = dimension;
	}
	
	Cuboid(){
		this.width = 10;
		this.height = 10;
		this.depth = 10;
	}
	
	int volume() {
		return width * height * depth;
	}
	
	public static void main(String args[]) {
		int volume;
		Cuboid stdcuboid = new Cuboid(10, 20, 15);
		volume = stdcuboid.volume();
		System.out.println("Volume of simple cuboid is: " +volume);
		
		Cuboid cuboidwithDefault = new Cuboid(10,20);
		volume = cuboidwithDefault.volume();
		System.out.println("Volume of cuboid with default depth is: " +volume);
		
		Cuboid cube = new Cuboid(10);
		volume = cube.volume();
		System.out.println("Volume of cube is: " +volume);
		
	 Cuboid defaultcuboid = new Cuboid();
	 volume = defaultcuboid.volume();
	 System.out.println("Volume of default cuboid is: " +volume);
	}
	}
