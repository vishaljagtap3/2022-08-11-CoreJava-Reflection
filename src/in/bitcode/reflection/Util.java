package in.bitcode.reflection;

public class Util {
    public static Shape duplicate(Shape s) {
        try {
            return s.getClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
