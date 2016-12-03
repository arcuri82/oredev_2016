package org.oredev.example.evo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RandomGeneratorGeneral {

    public static void generate(Class<?> klass, int n) throws Exception {
        for(Method m : klass.getDeclaredMethods()){
            for(int i=0; i<n; i++){
                List<Object> randomInputs = Arrays.asList(m.getParameterTypes())
                        .stream().map(RandomGeneratorGeneral::getAtRandom)
                        .collect(Collectors.toList());
                Object res = m.invoke(null, randomInputs.toArray());
                outputJUnitText(m, randomInputs, res);
            }
        }
    }

    private static void outputJUnitText(Method m, List<Object> randomInputs, Object res) {

    }


    public static Object getAtRandom(Type t){
        return null;
    }
}
