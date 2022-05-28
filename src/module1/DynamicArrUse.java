package module1;

public class DynamicArrUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray d = new DynamicArray();
		
		for(int i = 1; i < 10; i++) {
			d.add((100+i));
		}
		
		System.out.println(d.size());
		System.out.println(d.get(8));
		
		while(!d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println("Size: "+d.size());
			
		}
		
	}

}
