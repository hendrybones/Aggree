package com.pluralsight.Constractor;

public class Main {
    private  String name="hendry";
    public Main(){
        name="bones";

    }
    public Main(String name){
        this.name=name;
    }

    public static void main(String[] args){
        Main main=new Main("cutie");
        System.out.println(main.name);
    }


}
