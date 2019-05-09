class Vehicle {
	int passenger ;
	int fuelcap ;
	int mpg ;
void range () {
	System.out.println("Range is " + fuelcap*mpg);
       }
}

class AddMethod {
  public static void main(String args[]) {
	
        Vehicle car = new Vehicle ();
	Vehicle bus = new Vehicle ();

	int range1 , range2 ;

	car.passenger = 4;
	car.fuelcap = 10;
	car.mpg = 15 ;

	bus.passenger = 20 ;
	bus.fuelcap = 15 ;
	bus.mpg = 20 ;

	System.out.println("Car can carry" + car.passenger) ;
	car.range() ;
	System.out.println("bus can carry" + bus.passenger) ;
	bus.range() ;
      }
}
	
		