package org.oredev.example.evo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomGeneratorFoo {

//    public static void main(String[] args) throws Exception{
//        Random rand = new Random();
//        for(int i=0; i<10; i++){
//            int x = rand.nextInt(), y = rand.nextInt();
//            double res = Foo.divide(x,y);
//            System.out.println("@Test public void test"+i+"(){");
//            System.out.println("  assertEquals("+res+", Foo.divide("+x+", "+y+");}");
//        }
//    }

    public static void main(String[] args) throws Exception{

        for(int i=0; i<10; i++){
            List<Integer> pool = Arrays.asList(0);
            int x = getRand(pool), y = getRand(pool);
            Exception exception = null;
            Double res = null;
            try{res = Foo.divide(x,y);} catch (Exception e){
                exception = e;}
            System.out.println("@Test public void test"+i+"(){");
            if(exception != null){
                System.out.println("  try{Foo.divide("+x+", "+y+"); fail();} catch(Exception e){}}");
            } else
                System.out.println("  assertEquals("+res+", Foo.divide("+x+", "+y+");}");
        }
    }

    public static int getRand(List<Integer> pool){
        Random rand = new Random();
        if(rand.nextBoolean()){
            return rand.nextInt();
        }
        else {
            return pool.get(rand.nextInt(pool.size()));
        }
    }


    public static boolean isOk(String value){
        switch (value){
            case "sameString":
            case "sameOtherString":
                return true;
            default:
                return false;
        }
    }

}


/*
@Test
    public void test0()  throws Throwable  {
        double double0 = Foo.divide(3, 2);
        assertEquals(1.0, double0, 0.01D);}
 */