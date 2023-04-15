package com.driver;

public class Main {
    //Create a class A
    public static class A{
        //Create a method name meth having return type String
       public String meth(){
            return "Invoking method from class A";
        }
    }
    //Create a class name B which extends class B
    public static class B extends A{
        @Override
       public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }

    //create object of class B and call method meth of class A with it
    public static void main(String args[]){
        B b1= new B();
        b1.meth();
    }
}