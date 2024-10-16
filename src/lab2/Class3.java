package lab2;
/**
 * The {@code Class3} class extends {@link Class2} and implements the {@link Interface3} interface.
 * <p>
 * This class provides an implementation for the {@link Interface3#method3()} method,
 * along with inherited methods from {@link Class2} and {@link Interface2}.
 * </p>
 */
public class Class3 extends Class2 implements Interface3{
    /**
     * The {@code interface1} field is a reference to an object that implements {@link Interface1}.
     * This field can be used to store and interact with an {@link Interface1} instance.
     */
    Interface1 interface1;
    /**
     * Implementation of the {@link Interface3#method3()} method.
     * <p>
     * This method prints a message to the console indicating its execution.
     * </p>
     */
    @Override
    public void method3() {
        System.out.println("Class3 method3");
    }
    /**
     * Implementation of the {@link Interface2#method2()} method.
     * <p>
     * This method prints a message to the console indicating its execution.
     * </p>
     */
    @Override
    public void method2() {
        System.out.println("Class3 method2");
    }
}
