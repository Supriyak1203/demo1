abstract class Parent{
	abstract void m1();
	abstract void m2();
}
 abstract class Child extends Parent{
	abstract void m3();
	
}
class Subchild extends child {
	public void m1(){
		System.out.println("Hello from Parent m1()");
	}
	public void m2(){
		System.out.println("Hello from Parent m2()");
	}
	 public void m3(){
		System.out.println("hello from child m3()");
	}

}

class Grandchild extends subchild {
	public void m1(){
		System.out.println("Hello from subchild m1()");
	}
	public void m2(){
		System.out.println("Hello from subchild m1()");
	}

}
class Abstraction1 {
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}