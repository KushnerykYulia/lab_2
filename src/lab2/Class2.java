package lab2;
/**
 * The {@code Class2} class implements the {@link Interface2} interface
 * and provides an implementation for the {@link Interface2#method2()} method.
 * <p>
 */
public class Class2 implements Interface2{
    /**
     * The {@code class1} field is a reference to an object of {@link Class1}.
     * This field can be used to store and interact with an instance of {@link Class1}.
     */
    Class1 class1;
    /**
     * Implementation of the {@link Interface1#method1()} method.
     * <p>
     * This method prints a message to the console indicating its execution.
     * </p>
     */
    @Override
    public void method2() {
        System.out.println("Class2 method2");
    }
}
