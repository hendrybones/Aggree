package com.pluralsight.abb;

public class Main {

    public abstract class Dog{
        protected int age;
        public void eat(){

        }
        public abstract String getName();
    }
    public abstract class Swan extends Dog{
        public String getName(){
            return "Swan";
        }
    }

    public static void main(String[] args) {


    }
}
