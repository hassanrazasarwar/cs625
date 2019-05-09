class Vehicle {
	int passenger;
	int fuelcap;
	int mpg;
}
class VehicleDemo {
   public static void main(String args[]) {
	Vehicle car = new Vehicle();
	int range ;
	car.passenger = 7;
	car.fuelcap = 16;
	car.mpg = 10;
	range = car.fuelcap * car.mpg ;
	System.out.println("The car carry"+car.passenger+"passengers at the range of"+range);
	}
}