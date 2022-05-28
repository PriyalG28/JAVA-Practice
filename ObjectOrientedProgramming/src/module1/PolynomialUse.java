package module1;

public class PolynomialUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polynomial p1 = new Polynomial();
		Polynomial p2 = new Polynomial();
		for(int i = 0; i < 9; i++){
			p1.setCoefficient(i, 100+i);
		}
		
		p1.print();
		System.out.println();
		for(int i = 0; i < 8; i++){
			p2.setCoefficient(i, 101+i);
		}
		p2.print();
		System.out.println();
		
		Polynomial p3 = p1.add(p2);
		p3.print();

	}

}
