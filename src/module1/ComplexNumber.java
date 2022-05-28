package module1;

public class ComplexNumber {
	 private int real;
	 private int img;
	  
	 public ComplexNumber(int real, int img) {
		 this.real = real;
		 this.img = img;
	 }
	 
	 public void print() {
		 System.out.println(real+"+i"+img);
	 }
	 
	 public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		 int newReal = c1.real + c2.real;
		 int newImg = c1.img + c2.img;
		 ComplexNumber c3 = new ComplexNumber(newReal, newImg);
		 return c3;
	 }
	 
	 public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {
		 int newReal = c1.real - c2.real;
		 int newImg = c1.img - c2.img;
		 ComplexNumber c3 = new ComplexNumber(newReal, newImg);
		 return c3;
	 }
	 
	 public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
		 int newReal = (c1.real * c2.real)-(c1.img * c2.img);
		 int newImg = (c1.real * c2.img) + (c2.real * c1.img);
		 ComplexNumber c3 = new ComplexNumber(newReal, newImg);
		 return c3;
	 }
	
}
