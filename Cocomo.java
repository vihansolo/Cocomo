import java.util.*;
import java.lang.Math;

class Basic {

	final int ORGANIC = 0;
	final int SEMI_DETACHED = 1;
	final int EMBEDDED =2;

	double[] a;
	double[] b;
	double[] c;
	double[] d;

	Basic(){
		a = new double[3];
		b = new double[3];
		c = new double[3];
		d = new double[3];

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
}

class Intermediate {

	final int ORGANIC = 0;
	final int SEMI_DETACHED = 1;
	final int EMBEDDED =2;

	double[] a;
	double[] b;

	Intermediate(){
		a = new double[3];
		b = new double[3];

		a[ORGANIC] = 3.8;
		a[SEMI_DETACHED] = 3.0;
		a[EMBEDDED] = 2.8;

		b[ORGANIC] = 1.05;
		b[SEMI_DETACHED] = 1.12;
		b[EMBEDDED] = 1.2;
	}
}


class Cocomo {

	final static int INTERMEDIATE = 1;
	final static int BASIC = 0;

	final int ORGANIC = 0;
	final int SEMI_DETACHED = 1;
	final int EMBEDDED =2;

	static Double getEAF() {

        Scanner sc = new Scanner(System.in);

        Double sum = 0.0;
        Double eaf[] = new Double[4];

        String ques[] = {

            "Product or cost driver which includes complexity, size of the system and database - ",
            "Hardware and Software attribute - ",
            "Personal/people attribute - ",
            "Project - "
        };

        System.out.println();
        System.out.println("Enter values between 0.9 - 1.4 :");
        System.out.println();

        for (int i=0; i<4; i++) {

            System.out.print(ques[i]);
            eaf[i] = sc.nextDouble();

            if ((eaf[i] < 0.9) || (eaf[i] > 1.4)) {

                System.out.println("Enter values between 0.9 - 1.4 !!!!");
                return 0.0;
            }

            sum = sum + eaf[i];
        }

        return (sum/4);
    }

	static int getTypeOfSystem() {
		Scanner sc = new Scanner(System.in);

		int typeOfSystem;

		System.out.println();
		System.out.println("Enter  1. Basic System");
		System.out.println("       2. Intermediate System");
		System.out.println();
		System.out.print("Enter value : ");

		typeOfSystem = sc.nextInt();

		if(typeOfSystem <= 0 || typeOfSystem >= 3) {

			System.out.println();
			System.out.println("Enter values between 1 and 2!!!!");
			System.exit(0);
		}

		return typeOfSystem;

	}

	static int getClassOfSystem() {

		Scanner sc = new Scanner(System.in);

		int classOfSystem;

		System.out.println();
		System.out.println("Enter  1. Organic System");
		System.out.println("       2. Semi-detached System");
		System.out.println("       3. Embedded System");
		System.out.println();
		System.out.print("Enter value : ");

		classOfSystem = sc.nextInt();

		if(classOfSystem <= 0 || classOfSystem >= 4) {

			System.out.println();
			System.out.println("Enter values between 1 and 3!!!!");
			System.exit(0);
		}

		return classOfSystem;
	}

	static int getKLOC() {

		Scanner sc = new Scanner(System.in);

		int KLOC;

		System.out.println();
		System.out.print("Enter number of lines of code in 1000 : ");
		KLOC = sc.nextInt();
		System.out.println();

		return KLOC;
	}

	static double calculateEffort(int typeOfSystem, int classOfSystem, int KLOC, double EAF){
		final int INTERMEDIATE = 1;
		final int BASIC = 0;
		double a = -1.0, b = -1.0;

		if(typeOfSystem == INTERMEDIATE){
			Intermediate i = new Intermediate();
			a = i.a[classOfSystem];
			b = i.b[classOfSystem];
		}else if(typeOfSystem == BASIC){
			Basic ba = new Basic();
			a = ba.a[classOfSystem];
			b = ba.b[classOfSystem];
		}

		return a*Math.pow(KLOC,b)*EAF;
	}

	static double calculateDEV(double effort, int classOfSystem){
		double c,d;

		Basic ba = new Basic();
		c = ba.c[classOfSystem];
		d = ba.d[classOfSystem];

		return c*Math.pow(effort,d);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tos;
		int classOfSystem;
		int typeOfSystem;
		int KLOC;
		double EAF = 1.0;
		double effort = 0;
		double dev = 0;

		typeOfSystem = getTypeOfSystem()-1;
		classOfSystem = getClassOfSystem()-1;
		KLOC = getKLOC();

		switch (typeOfSystem) {
			case BASIC:
				effort = calculateEffort(typeOfSystem,classOfSystem,KLOC,1);
				dev = calculateDEV(effort, classOfSystem);
				System.out.println();
				System.out.println("Effort for Basic sys : "+effort);
				System.out.println("Dev = "+dev);
				break;
			case INTERMEDIATE:
				EAF = getEAF();
				effort = calculateEffort(typeOfSystem,classOfSystem,KLOC,EAF);
				System.out.println();
				System.out.println("Effort for Intermediate sys : "+effort);
				break;
		}
	}
}
