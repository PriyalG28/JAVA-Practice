package module1;

public class FractionUse {

	public static void main(String[] args) throws DivideByZeroException {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(4,6);
		Fraction f2 = new Fraction(4,8);

//		f1.increment();
		Fraction f3 = Fraction.add(f1, f2);
		Fraction f4 = Fraction.subtract(f1, f2);
		Fraction f5 = Fraction.multiply(f1, f2);
		f3.print(); 
		f4.print(); 
		f5.print(); 

		
	}
	

}
