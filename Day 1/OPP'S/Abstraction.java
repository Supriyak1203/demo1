abstract class ArithematicOperation{
	public abstract int addition(int num1,int num2);
	public abstract int subtraction(int num1,int num2);
	public abstract int multi(int num1,int num2);
	}
	class ArithematicImp extends ArithematicOperation{
		public int addition(int num1,int num2){
			return num1+num2;
		}
		public int subtraction(int num1,int num2){
			return num1-num2;
		}
		public int multi(int num1,int num2){
			return num1*num2;
		}
	}
	
	class Abstraction{
		public static void main(String[] args) {
		  ArithematicOperation obj=new ArithematicImp();
		  System.out.println(obj.addition(10,20));
		}
	}