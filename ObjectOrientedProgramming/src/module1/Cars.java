package module1;

public class Cars extends Vehicle{
	
		int doors;
		
		public Cars(int doors, int maxSpeed) {
			super(maxSpeed);
			this.doors = doors;
			System.out.println("Car's constructor doors "+this.doors);
		}
	}

