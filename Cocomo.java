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
	static double getEAF() {

        Scanner sc = new Scanner(System.in);

        double sum = 0;
        double eaf[] = new double[4];

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
            eaf[i] = sc.nextInt();

            if ((eaf[i] < 0.9) || (eaf[i] > 1.4)) {

                System.out.println("Enter values between 0.9 - 1.4 !!!!");
                System.exit(0);
            }

            sum = sum + eaf[i];
        }

        return sum;
    }

	int INTERMEDIATE = 1;
	int BASIC = 0;

	int ORGANIC = 0;
	int SEMI_DETACHED = 1;
	int EMBEDDED =2;

	static double calculateEffort(int classOfSystem, int KLOC, int EAF){

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tos;
		int classOfSystem;
		int typeOfSystem;
		int kLOC;
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
