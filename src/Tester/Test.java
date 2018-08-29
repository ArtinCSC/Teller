package Tester;

public class Test {

	public static void main(String[] args) {
		
		int x = 250100;
		int y = 340200;
		
	 if(multiplyExact(x, y) == true)
		System.out.println("integer overflow");
	}
	
	 public static boolean multiplyExact(int x, int y) {
		 try {
		        Math.multiplyExact(x, y);{
		        	return false;
		        }
		    } catch (ArithmeticException e) {
		        return true;
		    }
		    }
	 /**
	public static boolean willAdditionOverflow(int left, int right) {
	    try {
	        Math.addExact(left, right);
	        return false;
	    } catch (ArithmeticException e) {
	        return true;
	    }
	}

	public static boolean willSubtractionOverflow(int left, int right) {
	    try {
	        Math.subtractExact(left, right);
	        return false;
	    } catch (ArithmeticException e) {
	        return true;
	    }
	}
	*/
	/**
		static boolean multiply(int x, int y) { int z = 0;
		System.out.println("x: " + x + " and y: " + y);
		if (x*y>=Integer.MIN_VALUE && x*y<=Integer.MAX_VALUE) {
		z = x*y;
		System.out.println("x * y = "+z); return true;
		}
		else {
		System.out.println("Integer overflow occurred!");
		return false; }
		}
	*/

}
