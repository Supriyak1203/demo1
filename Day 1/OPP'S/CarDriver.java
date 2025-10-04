class Car{
	String brand;
	String model;
	String type;
	double mil;
	int seatingCap;
	double price;
	Engine engine;
	Car(String brand,String model,String type,double mil,int seatingCap,double price,String etype,double bhp,int noPistons,int gears)
	{
	super();
	this.brand=brand;
	this.model=model;
	this.type=type;
	this.mil=mil;
	this.seatingCap=seatingCap;
	this.price=price;
	this.engine=new Engine(etype,bhp,noPistons,gears);
	System.out.println("Car Object Created");
	}
	void displayCar(){
		System.out.println("**********Car Details***********");
		System.out.println("brand:" +this.brand);
		System.out.println("Model:" +this.model);
		System.out.println("Type:" +this.type);
		System.out.println("Mileage:"+this.mil+" km");
		System.out.println("SeatingCap:" +this.seatingCap);
		System.out.println("price:"+this.price);
		
	}

}
class Engine{
	String type;
	double bhp;
	int noPistons;
	int gears;
	Engine(String type,double bhp,int noPistons,int gears){
	this.type=type;
	this.bhp=bhp;
	this.noPistons=noPistons;
	this.gears=gears;
	}
	void displayEngine(){
		System.out.println();
		System.out.println("Type:" +this.type);
		System.out.println("Bhp:" +this.bhp);
		System.out.println("no of piston:" +this.noPistons);
		System.out.println("Gears:" +this.gears);
	}
}
class CarDriver{
	public static void main(String[] args) {
		Car obj=new Car("TATA","NEXON","HATCHBACK",17,5,850000,"CI",300,4,5);
		obj.displayCar();
		
	}
}