class Student {
    String name;
    String email;

    Student(String name, String email){
        super();
        this.name=name;
        this.email=email;

    }

    void displayStudent(){
        System.out.println("Name:"   +this.name);
        System.out.println("Email:"  +this.email);
    }

    
}

class Department extends Student{
    int Deptno;
    String Dname;

    Department(int Deptno,String Dname,String name,String email){
        super(name,email);
        this.Deptno=Deptno;
        this.Dname=Dname;
    }

    void displayDepartment(){
        System.out.println("Department No:"     +this.Deptno);
         System.out.println("Department Name:"   +this.Dname);

    }

}

class College extends Student{
    int C_id;
    String cname;

    College(int C_id,String cname,String name,String email){
        super(name,email);
        this.C_id=C_id;
        this.cname=cname;
    }

    void displayCollege(){
        System.out.println("Collge Id:"     +this.C_id);
         System.out.println("Department Name:"   +this.cname);

    }

}





public class InheritanceExample  {
   public static void main(String[] args) {
    
   
    Department dept=new Department(101, "Computer","Supriya Kale" , "supriyakale643@gmail.com");
    dept.displayStudent();
    dept.displayDepartment();

    College clg = new College(4110, "APCOER", "Pratik", "pratik@gmail.com");
    clg.displayCollege();
    clg.displayStudent();
}
}

