package corejavaExample;

public abstract class GraphicObject {
	int x,y;
	void moveTo(int newx, int newy) {
		System.out.println("move to x: "+x +" and y: " +y);
	}
 abstract void draw();
 abstract void resize();
}
