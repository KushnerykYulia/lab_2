package lab2;
/**
 * Main class
 * Creates instances of Class1, Class2, and Class3, and calls their methods.
 * @author Kushneryk Yulia
 */
public class Main {
    public static void main(String[] args){
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();

        class1.method1();
        class1.method2();

        class2.method2();

        class3.method2();
        class3.method3();
    }
}
