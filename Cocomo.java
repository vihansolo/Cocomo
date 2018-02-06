import java.util.*;

class Basic {

	int ORGANIC = 0;
	int SEMI_DETACHED = 1;
	int EMBEDDED =2;

	double[] a = new double[];
	double[] b = new double[];
	double[] c = new double[];
	double[] d = new double[];

	a[ORGANIC] = 2.4;
	a[SEMI_DETACHED] = 3;
	a[EMBEDDED] = 3.6;

	b[ORGANIC] = 1.05;
	b[SEMI_DETACHED] = 1.12;
	b[EMBEDDED] = 1.20;

	c[ORGANIC] = 2.5;
	c[SEMI_DETACHED] = 2.5;
	c[EMBEDDED] = 2.5;

	d[ORGANIC] = 0.38;
	d[SEMI_DETACHED] = 0.36;
	d[EMBEDDED] = 0.32;

}

class Intermediate {

	int ORGANIC = 0;
	int SEMI_DETACHED = 1;
	int EMBEDDED =2;

	double[] a = new double[];
	double[] b = new double[];

	a[ORGANIC] = 3.8;
	a[SEMI_DETACHED] = 3.0;
	a[EMBEDDED] = 2.8;

	b[ORGANIC] = 1.05;
	b[SEMI_DETACHED] = 1.12;
	b[EMBEDDED] = 1.2;

}


class Cocomo {

	int INTERMEDIATE = 1;
	int BASIC = 0;

	int ORGANIC = 0;
	int SEMI_DETACHED = 1;
	int EMBEDDED =2;

	static int getTypeOfSystem() {
		Scanner sc = new Scanner(System.in);

		int typeOfSystem;

		System.out.println();
		System.out.println("Enter  1. Basic System");
		System.out.println("	   2. Intermediate System");
		System.out.println();

		typeOfSystem = sc.nextInt();

		return typeOfSystem;

	}

	static int getClassOfSystem() {

		Scanner sc = new Scanner(System.in);

		int classOfSystem;

		System.out.println();
		System.out.println("Enter  1. Organic System");
		System.out.println("	   2. Semi-detached System");
		System.out.println("	   3. Embedded System");
		System.out.println();

		System.out.print("Enter value : ");
		classOfSystem = sc.nextInt();

		return classOfSystem;

	}

	static int getKLOC() {

		Scanner sc = new Scanner(System.in);

		int KLOC;

		System.out.println();
		System.out.print("Enter number of lines of code in 1000");
		System.out.println();


	}

	static double calculateEffort(int typeOfSystem, int classOfSystem, int KLOC, int EAF){
		int INTERMEDIATE = 1;
		int BASIC = 0;
		int a = -1, b = -1;

		if(typeOfSystem == INTERMEDIATE){
			Intermediate i = new Intermediate();
			a = i.a[classOfSystem];
			b = i.b[classOfSystem];
		}else if(typeOfSystem == BASIC){
			Intermediate i = new Basic();
			a = i.a[classOfSystem];
			b = i.b[classOfSystem];
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tos;
		int classOfSystem;
		int typeOfSystem;
		int KLOC;
		double EAF = 1;

		typeOfSystem = getTypeOfSystem();
		classOfSystem = getClassOfSystem();
		kLOC = getKLOC();

		switch () {
			case BASIC:

				break;
			case INTERMEDIATE:
				EAF = getEAF();
				break;
		}

		//calculations based on TOS
		//Dispplay results
	}
}
