package module1;

public class ComplexNumUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber c1 = new ComplexNumber(4,5);
		ComplexNumber c2 = new ComplexNumber(1,2);

		ComplexNumber c3 = ComplexNumber.add(c1, c2);
		ComplexNumber c4 = ComplexNumber.subtract(c1, c2);
		ComplexNumber c5 = ComplexNumber.multiply(c1, c2);
		c3.print();
		c4.print();
		c5.print();

	}

}
