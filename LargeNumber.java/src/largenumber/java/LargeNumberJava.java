/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largenumber.java;

/**
 *
 * @author ADMIN
 */
public class LargeNumberJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] myList={1.9,2.9,3.4,3.5};
        //print all elements in the array
        for (int i=0; i<myList.length; i++){
            System.out.println(myList[i] + "");
        }
        //summon all elements
        double total =0;
        for(int i=0; i<myList.length; i++){
            total +=myList[i];
        }
        System.out.println("sum" + total);
        //finding the largest number in the array
        
        double max=myList[0];
        for(int i=0; i<myList.length; i++){
            if(myList[i]>max) max=myList[i];
            
    }
        System.out.println("max is:" +max);
    }
        
    }
    