package demo1.RuntimeException;

public class StringIndexOutOfBoundException {
    public static void main(String[] args) {
        try{
            String str="Supriya";
            System.out.println(str.charAt(9));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception Occured" +e.getMessage());
        }
    }
}
