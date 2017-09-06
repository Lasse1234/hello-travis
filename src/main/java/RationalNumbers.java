
public class RationalNumbers {
	int numberator;
	int demoniator;

	public RationalNumbers(int num, int demon) {
		numberator = num;
		demoniator = demon;
		this.reduce(num, demon);
	}

	private void reduce(int num, int demon) {
		int akk = greatestCommonDivisor(num, demon);
		this.numberator = num / akk;
		this.demoniator = demon / akk;
	}

	private static int greatestCommonDivisor(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;

	}

	public String toString() {
		return numberator + "/" + demoniator;

	}
	
	public RationalNumbers add(RationalNumbers number) {
		int zaehler = demoniator * number.demoniator;
		int nenner = numberator * number.demoniator + (number.numberator * demoniator);
		
		
		
		RationalNumbers sum = new RationalNumbers(1,1);
		sum.numberator = zaehler;
		sum.demoniator = nenner;
		sum.reduce(nenner,zaehler);
		return sum;
	}

	public RationalNumbers sub(RationalNumbers number) {
		int zaehler = demoniator * number.demoniator;
		int nenner = numberator * number.demoniator - (number.numberator * demoniator);
		RationalNumbers sum = new RationalNumbers(1,1);
		sum.numberator = zaehler;
		sum.demoniator = nenner;
		sum.reduce(nenner,zaehler);
		return sum;
	}
	
	public RationalNumbers mult(RationalNumbers number) {
		int zaehler = demoniator * number.demoniator;
		int nenner = numberator * number.numberator;
		RationalNumbers sum = new RationalNumbers(1,1);
		sum.numberator = zaehler;
		sum.demoniator = nenner;
		sum.reduce(nenner,zaehler);
		return sum;
	}
	public RationalNumbers div(RationalNumbers number) {
		int zaehler = demoniator * number.numberator;
		int nenner = numberator * number.demoniator;
		RationalNumbers sum = new RationalNumbers(1,1);
		sum.numberator = zaehler;
		sum.demoniator = nenner;
		sum.reduce(nenner,zaehler);
		return sum;
	}
	public boolean isEqual(RationalNumbers number) {
		if((sub(number).numberator == 0) && (demoniator ==0)) return true;
		else return false;
		
		
	}
	public double decimalValue() {
		double zaehler = (double) numberator;
		double nenner = (double) demoniator;
		
		return (zaehler / nenner);
		
	}
	public static void main(String[] args) {
		RationalNumbers x = new RationalNumbers(1, 4);
		
		System.out.println("1/4 = " + x.toString());
		System.out.println("1/4 + 1/8 = " + x.add(new RationalNumbers(1,8)).toString());
		System.out.println("1/4 - 1/8 = " + x.sub(new RationalNumbers(1,8)).toString());
		System.out.println("1/4 * 1/8 = " + x.mult(new RationalNumbers(1,8)).toString());
		System.out.println("1/4 : 1/8 = " + x.div(new RationalNumbers(1,8)).toString());
		System.out.println("decimal = " + x.decimalValue());
		System.out.println("equal to 1/8 = " + x.isEqual(new RationalNumbers(1,8)));
		
	}
	


}
