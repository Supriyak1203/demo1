class Laptop{
	String brand;
	String model;
	int ram;
	int rom;
	double price;
	String processor;
	Laptop(String brand,String model,int ram,int rom,double price,String processor)
	{
		super();
		this.brand=brand;
		this.model=model;
		this.ram=ram;
		this.rom=rom;
		this.price=price;
		this.processor=processor;
	}
	void displayLaptop(){
		System.out.println("Brand:" +this.brand);
		System.out.println("Model:" +this.model);
		System.out.println("Ram:" +this.ram);
		System.out.println("Rom:" +this.rom);
		System.out.println("Price:" +this.price);
		System.out.println("Processor:" +this.processor);

	}

}
class GamingLaptop extends Laptop
{
	String graphicCard;
	boolean coolingSys;
	String keyborad;
	GamingLaptop(String graphicCard,boolean coolingSys,String keyborad,String brand,String model,int ram,int rom,double price,String processor)
	{
		super(brand,model,ram,rom,price,processor);
		this.graphicCard=graphicCard;
		this.coolingSys=coolingSys;
		this.keyborad=keyborad;
	}
	void displayGamingLaptop(){
		System.out.println("GraphicCard:"+this.graphicCard);
		System.out.println("cooling System:" +this.coolingSys);
		System.out.println("Keyborad type:" +this.keyborad);
	}
}
class LaptopDriver1{
	public static void main(String[] args) 
	{
		GamingLaptop obj=new GamingLaptop("rtx 3090",true,"rgb light","MSI","msi123",16,512,70000,"i7");
		obj.displayLaptop();
		obj.displayGamingLaptop();
	}
}