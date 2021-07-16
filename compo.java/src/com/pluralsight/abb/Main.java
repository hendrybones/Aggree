package com.pluralsight.abb;

public class Main {
        String carName;
        int carId;
//constructor
        Main(String name, int id) {
            this.carName = name;
            this.carId = id;
        }
    }
//driver inherits main
      class Driver extends Main{
        String driveName;

        Driver(String name, String cname, int cid) {
            super(cname, cid);
            this.driveName = name;
        }
    }

     class TransportationCompany {
        public static void main(String[] args) {
            Driver obj=new Driver("hendry","ford",9988);
            System.out.println(obj.driveName+ "is a driver of a car" +obj.carId);

        }
    }
