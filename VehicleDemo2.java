class Vehicle {
	int passenger ;
	int fuelcap ;
	int mpg ;
}

class VehicleDemo2 {
  public static void main(String args[]) {
	Vehicle corola = new Vehicle() ;
	Vehicle honda = new Vehicle() ;

	int range1 , range2 ;
	
	corola.passenger = 4 ;
	corola.fuelcap = 20 ;
	corola.mpg = 7 ;

	honda.passenger = 6 ;
	honda.fuelcap = 22 ;
	honda.mpg = 9 ;

	range1 = corola.fuelcap * corola.mpg ;
	range2 = honda.fuelcap * honda.mpg ;

	System.out.println("corola carries"+" "+ corola.passenger + "passegers at the rate of" +" "+ range1);
	System.out.println("honda carries" +" "+ honda.passenger + "passegers at the rate of" +" "+ range2);
       }
}