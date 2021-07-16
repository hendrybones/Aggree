
package userinpute.java;
import java.util.Scanner;


public class UserINputeJava {

   
    public static void main(String[] args) {
        Scanner nam=new Scanner(System.in);
        System.out.println("enter name");
        
        String userName=nam.nextLine();
        System.out.println("Username is:" + userName);
        
    }
    
}
