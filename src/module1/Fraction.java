package module1;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) throws DivideByZeroException {
		if(denominator == 0) {
			throw new DivideByZeroException();
		}
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	public void setNumerator(int num) {
		this.numerator = num;
		simplify();
	}
	
	public void setDenominator(int num) throws DivideByZeroException{
		if(num == 0) {
			throw new DivideByZeroException();
		}
		this.denominator = num;
		simplify();
	}
	
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}
	
	
	
	private void simplify() {
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for(int i = 2; i <= smaller; i++) {
			if(numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
			
		}
		numerator /= gcd;
		denominator /= gcd;
	}
	
	
	public void print() {
		System.out.println(numerator+"/"+denominator);
	}
	
	public void increment() {
		// TODO Auto-generated method stub
		numerator = numerator + denominator; 
		simplify();
	}
	
	public static Fraction add(Fraction f1, Fraction f2) throws DivideByZeroException {
		int newNumerator = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
		int newDenominator = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNumerator, newDenominator);
		return f3; 
	}
	
	public static Fraction subtract(Fraction f1, Fraction f2) throws DivideByZeroException {
		int newNumerator = (f1.numerator * f2.denominator) - (f2.numerator * f1.denominator);
		int newDenominator = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNumerator, newDenominator);
		return f3; 
	}
	
	public static Fraction multiply(Fraction f1, Fraction f2) throws DivideByZeroException {
		int newNumerator = f1.numerator * f2.numerator;
		int newDenominator = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNumerator, newDenominator);
		return f3; 
	}

}
