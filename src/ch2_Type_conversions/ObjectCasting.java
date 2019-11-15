package ch2_Type_conversions;

/**
 * As with primitives, objects can be cast both explicitly and implicitly.
 * Implicit cast happen when the source type extends or implements the target type.
 * Explicit casting has to be done when the source type is extended or implemented by the target type.
 * This can produce a runtime exception{@link ClassCastException} when the object being cast is not of
 * the target type(or the target's subtype)
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-15
 */
public class ObjectCasting {

    public static void main(String[] args) {
        Float floatVal1 = 42.0f;
        Number number = floatVal1; // Implicit (Float extends Number)
        Float floatVal2 = (Float) number; // Explicit (number is extended by Float)
        try {
            Double doubleVar = (Double) number; // Throws Exception
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }

    }
}
