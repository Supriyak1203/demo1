class Exception{
	public static void main(String[] args) {
		System.out.println("Hello");
		m1();
		System.out.println("Bye");
	}
	public static void m1(){
		System.out.println("Hie");
		m2();
		System.out.println(10/0);
	}
	public static void m2(){
		System.out.println("Hello 3");
		System.out.println("Bye 3");
	}
}
