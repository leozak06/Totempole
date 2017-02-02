/* 	
*	FirstAssignment V00840048 Leoza Kabir
*	CSC 110
*	Printing out a totem pole and creating the code, in three separate static methods, printPig, printFrog and printTotemPole.
*	Writing a code to calculate the surface area of a closed cylinder that has a given height and diameter. 
*	Input: height, diameter  Output: surafaceArea of cylinder
*/


public class FirstAssignment {
	public static void main (String[]args){
		System.out.println("Welcome!");
		System.out.println();
		printTotempole();
		calcSurfaceArea();
		
	}
	public static void printPig() {
		System.out.println("  ^--^");
		System.out.println(" (0  0)");
		System.out.println("  (oo)");
		System.out.println(" (\")_(\")@");
		
	}
	public static void printFrog(){
		System.out.println("  @..@");
		System.out.println(" (----)");
		System.out.println("( >___< )" );
		System.out.println("\"\"     \"\"");
		
	}
	public static void printSpace(){
		System.out.println("/~~~~~~\\");
		
	}
	public static void printTotempole() {
		printSpace();
		printFrog();
		printSpace();
		printPig();
		printSpace();
		printFrog();
		printSpace();
		printPig();
		printSpace();
		printSpace();
		System.out.println();
		System.out.println();
		
	}
		
	public static void calcSurfaceArea(){
	int height=5;
	int diameter=4;
	//declare variables
	double circleArea;
	double radius;
	double circumference;
	double surfaceArea;
	double areaRectangle;
	radius=2;
	height=5;
	//print results
	circumference=2 * Math.PI * radius;
	areaRectangle=height * circumference;
	circleArea=Math.PI * radius * radius;
	surfaceArea=areaRectangle + 2 * circleArea;
	
	
	System.out.println("Total surface area is:" + surfaceArea); 


	}
}
	
	
	
	

