package lab2;
/**
 * The {@code Interface3} interface extends {@link Interface2} and adds
 * a new method {@link #method3()}.
 * <p>
 * Classes that implement this interface must provide implementations for the methods {@link Interface2#method2()}
 * and {@link Interface2#method2()}, as well as the new {@link #method3()} method.
 * </p>
 */
public interface Interface3 extends Interface2{
    /**
     * Describes the new {@code method3()} that must be implemented by classes
     * that implement this interface.
     * <p>
     * The {@code method3()} provides additional functionality specific to {@code Interface3}
     * and must be implemented along with the methods inherited from {@link Interface2}.
     * </p>
     */
    void method3();
}
