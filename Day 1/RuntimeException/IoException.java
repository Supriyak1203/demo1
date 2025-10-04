
import java.io.FileReader;
import java.io.IOException;

class IOExceptionEx {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.txt");
        } catch (IOException e) {
            System.out.println("IO Exception Occur: " + e.getMessage());
        }
    }
}


