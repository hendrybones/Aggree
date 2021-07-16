package com.pluralsight.abb;

public class Main {

    public static void main(String[] args) {
	final int MaxStudent=300;
	final int MiniStudents;
	int MiniAllStudent=100;
	MiniStudents=MiniAllStudent;

	//prefix operator
        int someValue=15;
        System.out.println(++someValue);
        System.out.println(someValue);

        int otherSomeValue=5;
        System.out.println(otherSomeValue++);
        System.out.println(otherSomeValue);

        int value =50;
        value -=5;
        System.out.println(value);

        int otherValue=100;
        int val1=50;
        int val2=10;

        otherValue /=val1 *val2;
        System.out.println(otherValue);


    }
}
