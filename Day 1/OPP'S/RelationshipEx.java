class Engine{

    void start(){
        System.out.println("Engine is started");
    }
}

class car{
private Engine engine;
 
car(){
    engine=new Engine();
}

    void carStart(){
        engine.start();
        System.out.println("Car is started");
    }
}


public class RelationshipEx {
public static void main(String[] args) {
    car c=new car();
   
    c.carStart();
    
}
}
