class Vegetable{
	int quantity=2;
	public void m1(){
		System.out.println(quantity);
	}
}
class Brinjal extends Vegetable{
	double price=60.00;
	public void m2(){
		System.out.println(price);
		System.out.println("m2 method execution");
	}
}
class Carrort extends Vegetable{
	double price1=80.00;
	public void m3(){
		System.out.println(price1);
		System.out.println("m3 method execution");
	}
}
class VegetableDriver{
	public static void main(String[] args) {
		Vegetable v=new Carrort();
		v.m1();
		Carrort c=(Carrort)v;
		c.m1();
		c.m3();
	}
}