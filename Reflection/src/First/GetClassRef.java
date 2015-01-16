package First;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by Squall on 15/01/2015.
 */
public class GetClassRef {

    public static void main(String[] args)
    {
        try {
            testReflections();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void testReflections() throws Exception
    {
        System.out.println("Amg");
        Class c1 = Class.forName("First.Persona");
        Class c2 = Class.forName("First.Move");
        Constructor moveCons = c2.getConstructor(java.lang.String.class);
        Constructor constructor = c1.getConstructor(java.lang.String.class, First.Move.class);
        Move move = (Move) moveCons.newInstance("Agidyne");
        Persona pers = (Persona) constructor.newInstance("John", move);
        pers.moveAndShout("Bufudyne", "Rawwwr");
        pers.recursiveFight(0, 20);
        Method[] methods = c1.getDeclaredMethods();
        for (Method m : methods)
        {
            System.out.println(m);
            Parameter[] pmObj = m.getParameters();
            System.out.println("LIST SIZE: ");
            int count = 1;
            for (Parameter pm : pmObj)
            {
                System.out.println("Param " + count + " is called: " + pm.getName());
                System.out.println("Param " + count + " is of type: " + pm.getType());
                count++;
            }
            Class rt = m.getReturnType();
            System.out.println("Return Type of Method is: " + rt.getName());
        }
    }
}
