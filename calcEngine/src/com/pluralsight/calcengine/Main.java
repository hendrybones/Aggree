package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
	double value1=100d;
	double value2 =50d;
	double results=0.0d;
	char opCode ='d';

	if (opCode=='a')
	    results=value1 + value2;
	else if(opCode=='s')
	    results=value1-value1;
    else if(opCode=='m')
        results=value1*value1;
    else if(opCode=='d')
        results=value1/ value2;

    else
        results=0.0d;

    System.out.println(results);



    }
}
