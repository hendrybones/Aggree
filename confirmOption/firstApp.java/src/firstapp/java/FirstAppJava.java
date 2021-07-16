/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapp.java;

/**
 *
 * @author ADMIN
 */
import java.io.*;
public class FirstAppJava {

    /**
     * @param args the command line arguments
     */
    String name;
    int age;
    String designation;
    double Salary;
    
    // constructor method of the class
    public FirstAppJava(String name){
        this.name=name;
    }
    
    public void empAge(int empAge){
        age=empAge;
    }
    public void empSalary(double empSal){
        Salary =empSal;
    }
    public void printFirstAppJava(){
        System.out.println("age" + age);
        System.out.println("Name" + name);
        System.out.println("salary" +Salary);
    }
    

   
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
