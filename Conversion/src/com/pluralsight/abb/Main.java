package com.pluralsight.abb;

public class Main {

    public static void main(String[] args) {
	int valueOne=5;
	long longValueOne=valueOne;


	int myValue=50;
	long longMyValue=(int)myValue;

	float floatVal=1.0f;
	double doubleVal=4.0d;
	byte byteVal=7;
	short shortVal=7;
	long longVal=5;

	short result1=(short) longVal;
	short result2=(short)(byteVal-longVal);
	float result3=longVal-floatVal;

	System.out.println("success");

    }
}
