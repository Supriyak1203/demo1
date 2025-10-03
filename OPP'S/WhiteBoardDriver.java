class WhiteBoard{
	String brand="GURJAN";
	String dim="15*4";
	double price=10000;
	Marker marker;
	Duster duster;

	void displayBoard(){
		System.out.println("WhiteBoard:  "+this.brand+", dimension: "+this.dim+", Price:"+this.price+"rs.");

	}
	void addMarker(){
		marker=new Marker();
	}
	void addDuster(){
		duster=new Duster();
	}
}
class Marker{
	String brand="Camlin";
	String type="White borad Marker";
	String color="Black";
	double price=40;
	void displayMarker(){
		System.out.println("Marker:"+this.brand+","+this.type+","+this.color+","+this.price+" rs");
	}
}
class Duster{
	String brand="Polo";
	String material="Plastic";
	
	double price=40;
	void displayDuster(){
		System.out.println("Duster :" + this.brand +" ,"+this.material+","+this.price+" rs");
	}
}
class WhiteBoardDriver{
	public static void main(String[] args) {
		WhiteBoard obj=new WhiteBoard();
		obj.displayBoard();
		obj.addMarker();
		obj.marker.displayMarker();
		obj.addDuster();
		obj.duster.displayDuster();
	}
}