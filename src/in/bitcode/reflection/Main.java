package in.bitcode.reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Circle c1 = new Circle(100, 100, 100);
        Rect r1 = new Rect(200, 200, 200, 200);

        Util.duplicate(c1).draw();
        System.out.println();
        Util.duplicate(r1).draw();

        Method m = c1.getClass().getMethod("setR", new Class[] { int.class } );
        m.invoke(c1, new Object[] {333} );

         m = c1.getClass().getMethod("draw");
        m.invoke(c1);

        /*Class c = c1.getClass();
        printClassInfo(c);
        c = r1.getClass();
        printClassInfo(c);*/

    }

    public static void printClassInfo(Class c) {
        System.out.println("Class Name: " + c.getName());
        System.out.println("Is Interface: " + c.isInterface());
        System.out.println("Package: " + c.getPackage().getName());

        Class sc = c.getSuperclass();
        System.out.println("Super class: " + sc.getName());

        System.out.println("Methods: ");
        Method [] methods = c.getMethods();
        for(Method m : methods) {

            Class rt = m.getReturnType();
            System.out.print(rt.getName() + " ");
            System.out.print(m.getName() + "(");

            Parameter [] parameters = m.getParameters();
            for (Parameter p : parameters) {
                System.out.print(p.getType().getName() + " " + p.getName() + ", ");
            }
            System.out.println(")");
        }

        System.out.println("Constructors: ");
        Constructor [] constructors = c.getConstructors();
        for(Constructor cons : constructors) {
            System.out.print(c.getName() + "(");
            for(Parameter p : cons.getParameters()) {
                System.out.print(p.getType().getName() + " " + p.getName() + ", ");
            }
            System.out.println(")");
        }


        System.out.println("---------------------------------------------------");
    }
}
