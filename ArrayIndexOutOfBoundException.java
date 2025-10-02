package demo1;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        try{
            int [] arr={1,2,3,4,5};
            System.out.println(arr[8]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occured"   +e.getMessage());
        }
    }
    
}
