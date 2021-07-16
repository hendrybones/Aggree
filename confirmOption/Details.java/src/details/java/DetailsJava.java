
package details.java;
import java.util.Scanner;

public class DetailsJava {

    
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("enter name, age, and salary");
        
        String name=d.nextLine();
        int age=d.nextInt();
        double salary=d.nextDouble();
        
        System.out.println("name" + name);
        System.out.println("age" + age);
        System.out.println("Salary" +salary);
       
    }
    
}
