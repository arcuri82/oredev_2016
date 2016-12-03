package org.oredev.example.evo;

public class Foo {

    public static double divide(int x, int y){
        if(y==0) throw new  IllegalArgumentException();
        return x / y;
    }


    public static boolean isOk(int value){
        if(value * 2 == 42){
            return true;
        } else {
            return false;
        }
    }
}
