package corejavaExample.Datatypeconversion;

public class ExplicitTypeConversion {

	public static void main(String[] args) {
		double a = 23.94;
		System.out.println("Double Representation: " +a);
		float b = (float)a;
		System.out.println("Float Represntation: " +b);
		long c = (long)b;
		System.out.println("Long Representation: " +c);
		int d = (int)c;
		System.out.println("Int Representation: " +d);
		short e = (short)d;
		System.out.println("short Representation: " +e);
		byte f = (byte)e;
		System.out.println("Byte Representation: " +f);
	}
}
