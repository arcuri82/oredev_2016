package org.oredev.example;

public class Propagation {

    public static boolean exe(int x, int y){

        int z = 0;

        if(x > 0)
            z--; //mutated from "z++;"

        if(y > 0)
            z++;

        return z == 2;
    }


    public static boolean infection(boolean a, boolean b){

        int c = 0;

        if(a || b){
            /*
                if mutating "a" into "!a",
                and test is (true,true), then:
                - executed (!a is evaluated)
                - NO infection (still block is executed)
             */
            c = 1;
        }

        return c!=0;
    }
}
