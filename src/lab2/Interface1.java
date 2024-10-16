package lab2;
/**
 * The {@code Interface1} interface extends {@link Interface2} and adds
 * a new method {@link #method1()}.
 * <p>
 * Classes that implement this interface must provide implementations for
 * the methods {@link Interface2#method2()} and {@link #method1()},
 * as well as any additional methods defined by other extended interfaces.
 * </p>
 */
public interface Interface1 extends Interface2 {
    /**
     * Describes the {@code method1} that must be implemented by classes
     * that implement this interface.
     * <p>
     * This method can be used to perform specific actions that must be defined
     * in the implementation.
     * </p>
     */
    void method1();
}
