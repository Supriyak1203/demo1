class Parent{
	String str="PARENT";
}
class Child extends Parent
{
	String str="CHILD";
}
class VariableShadowing{
	public static void main(String[] args) {
		Child obj=new Child();
		System.out.println(obj.str);
		Parent obj1=new Child();
		System.out.println(obj1.str);
	}
}