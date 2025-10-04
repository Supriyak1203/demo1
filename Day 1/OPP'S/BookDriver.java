class Book{
	double price;
	Book(double price){
		super();
		this.price=price;
	}
	Book(){


	}
}
class HarryPottar extends Book
{
	String author;
	HarryPottar(double price,String author){
		super(price);
		this.author=author;



	}
}
class Java extends Book
{
	String author;
	Java(double price,String author){
		super(price);
		this.author=author;
	}
}
class Python extends Book
{
	String author;
	Python(double price,String author){
		super(price);
		this.author=author;

	}
}
class BookDriver{
	public static void main(String[] args) {
		Book b;
		b=new HarryPottar(123.56,"JsRowling");
		HarryPottar hp=(HarryPottar)b;
		System.out.println("Harry Pottar's Price:" +hp.price);
		System.out.println("Harry Pottar's Author:" +hp.author);

		b=new Java(156.9,"gemes gosling");
		Java jj=(Java)b;
		System.out.println("Java Price:" +jj.price);
		System.out.println("Java Author:" +jj.author);

		b=new Python(567.9,"xyzdf");
		Python pp=(Python)b;
		System.out.println("Python Price:" +pp.price);
		System.out.println("Python Author:" +pp.author);
	}
}