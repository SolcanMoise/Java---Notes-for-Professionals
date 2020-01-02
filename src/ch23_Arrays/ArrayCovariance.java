package ch23_Arrays;

/**
 * Object arrays are covariant, that means that just as {@link Integer} is a subclass of {@link Number},
 * Integer[] is a subclass of Number[]. This may be intuitive, but can result in surprising behavior.
 * <p>
 * Although Integer[] is a subclass of Number[], it can only hold {@link Integer}s and trying to assign a
 * {@link Long} to it will throws a runtime exception. Note than this behavior is unique to arrays, and can be avoided
 * by using a generic {@link java.util.List} instead.
 *
 * @author solcanm
 * @version 1.0
 * @since 2020-01-01
 */
public class ArrayCovariance {

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3};
        Number[] numberArray = integerArray; // valid
        Number firstElem = integerArray[0]; // valid
        numberArray[0] = 4L; // throw ArrayStoreException

        /*
          It's not necessary for all the array to elements to share the same type, as long as they are
          a subclass of the array's type:
         */
        I[] array10 = new I[]{new A(), new B(), new C()}; // create an array with new operator and array initializer
        I[] array11 = {new A(), new B(), new C()}; // shortcut syntax with array initializer
        I[] array12 = new I[3]; // {null, null, null};
        I[] array13 = new A[]{new A(), new A()}; // works because A implements I
    }

}

interface I {
}

class A implements I {
}

class B implements I {
}

class C implements I {
}
