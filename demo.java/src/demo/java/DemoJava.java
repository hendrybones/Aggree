/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.java;

/**
 *
 * @author ADMIN
 */
public class DemoJava {

    /**
     * @param args the command line arguments
     */
    int puppyAge;
    
    public DemoJava(String name){
        System.out.println("Name:" + name);
        
    }
    public void setAge(int age){
        puppyAge=age;
    }
    public int getAge(){
        System.out.println("puppy" + puppyAge);
        return puppyAge;
    }
    
    public static void main(String[] args) {
        // TODO code application login
        
            
      DemoJava myPuppy=new DemoJava("bruno");
      myPuppy.SetAge(2);
       myPuppy.getAge();
       
      System.out.println("name" + myPuppy.name +  "age" + myPuppy.age);
        
    }
    
}
