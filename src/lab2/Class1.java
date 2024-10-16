package lab2;
/**
 * The {@code Class1} class implements the {@link Interface1} interface
 * and provides an implementation for the {@link Interface1#method1()}
 * and {@link Interface2#method2()} methods.
 */
public class Class1 implements Interface1{
    /**
     * The {@code class1} field is a self-reference to an object of {@link Class1}.
     * This field can be used to store and interact with another instance of {@link Class1}.
     */
    Class1 class1;
    /**
     * Implementation of the {@link Interface2#method2()} method.
     * <p>
     * This method prints a message to the console indicating its execution.
     * </p>
     */
    @Override
    public void method2() {
        System.out.println("Class1 method2");
    }
    /**
     * Implementation of the {@link Interface1#method1()} method.
     * <p>
     * This method prints a message to the console indicating its execution.
     * </p>
     */
    @Override
    public void method1() {
        System.out.println("Class1 method1");
    }
}
