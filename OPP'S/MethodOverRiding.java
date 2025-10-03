class RBI
{
	public void roi(){
		System.out.println("Rate Of Intrest" +7.0+"%");
	}
}
class SBI extends RBI{
	public void roi(){
		System.out.println("Rate Of Intrest" +7.5+"%");
	}

}
class HDFC extends RBI{
	public void roi(){
		System.out.println("Rate Of Intrest" +6.8+"%");
	}

}
class ICICI extends RBI{
	public void roi(){
		System.out.println("Rate Of Intrest" +7.8+"%");
	}

}
class KM extends RBI{
	
}
class MethodOverRiding{
	public static void main(String[] args) {
		RBI obj=new SBI();
		obj.roi();
	}
}