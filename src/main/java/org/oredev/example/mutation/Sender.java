package org.oredev.example.mutation;

/**
 * Created by arcuri82 on 11/4/2016.
 */
public class Sender {

    public static boolean sendIfPositive(int x){

       if(Numbers.isPositive(x)){
           send(x);
           return true;
       } else {
           return false;
       }
    }

    private static void send(int x){
        //...
    }
}
