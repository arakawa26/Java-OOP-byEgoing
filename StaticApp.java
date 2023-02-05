class foo {
    public static String classVar = "i class var";
    public String instanceVar = "i instance var";
    public static void classMethod(){
        System.out.println(classVar); //OK
        // System.out.println(instanceVar); // Erroe
    }
    public void instanceMethod(){
        System.out.println(classVar); //OK
        System.out.println(instanceVar); // OK
    }
}
public class StaticApp {
    public static void main(String[] args) {
        System.out.println(foo.classVar); // OK
        // System.out.println(foo.instaceVar); // Error

        foo.classMethod(); // OK
        // foo.instanceMethod(); // Error

        foo a = new foo();
        foo b = new foo();

        System.out.println(a.classVar); // OK -> i class var
        System.out.println(a.instanceVar); // OK -> i instance var

        a.classMethod(); // i class var
        a.instanceMethod(); // i class var && i instance var

        a.classVar = "changed by a";
        System.out.println(foo.classVar); // changed by a
        System.out.println(b.classVar); // changed by a

        a.classMethod(); // changed by a
        a.instanceMethod(); // changed by a && i instance bar

        b.classMethod(); // changed by a
        b.instanceMethod(); // changed by a && i instance bar

        a.instanceVar = "changed by a";
        System.out.println(a.instanceVar); // changed by a
        System.out.println(b.instanceVar); // i instance var

        a.instanceMethod(); // changed by a && changed by a
        b.instanceMethod(); // changed by a && i instance bar
    }
}
