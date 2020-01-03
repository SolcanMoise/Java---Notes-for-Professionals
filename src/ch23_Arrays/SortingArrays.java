package ch23_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringJoiner;

/**
 * Sorting arrays can be easily done with {@link Arrays} API.
 * <p>
 * Sorting {@link String} arrays
 * {@link String} is not a numeric data, it defines it's own order which is called lexicographic order,
 * also known as alphabetic order. When you sort an array of {@link String} with sort() method, it
 * sort array into natural order defined by {@link Comparable} interface.
 * <p>
 * Sorting an {@link Object} array
 * In order to sort an {@link Object} array, all elements must implement either {@link Comparable} or
 * {@link Comparator} interface to define the order of the sorting.
 *
 * @author solcanm
 * @version 1.0
 * @since 2020-01-02
 */
public class SortingArrays {

    public static void main(String[] args) {

        // creating an array of integers
        int[] ints = {5, 6, 1, 8, 0};
        // this is the sorting part just one function ready to be used
        Arrays.sort(ints);
        // print sorted array
        Arrays.stream(ints).forEach(System.out::println);

        System.out.println();

        // create an array of String
        String[] strings = {"John", "Paul", "Anna", "Michael"};
        // increasing order sort
        Arrays.sort(strings);
        // print sorted array
        Arrays.stream(strings).forEach(System.out::println);

        System.out.println();

        // decreasing order sort
        Arrays.sort(strings, 0, strings.length, Collections.reverseOrder());
        // print array in reverse order
        Arrays.stream(strings).forEach(System.out::println);

        /*
        How to sort Object Array in Java using Comparator and Comparable
         */
        Course[] courses = new Course[5];
        courses[0] = new Course(101, "Java", 200);
        courses[1] = new Course(301, "Python", 400);
        courses[2] = new Course(201, "Ruby", 300);
        courses[3] = new Course(401, "Scala", 500);
        courses[4] = new Course(501, "C++", 100);

        System.out.println();
        System.out.println("Course(Object) array before sorting: " + Arrays.toString(courses));
        Arrays.sort(courses);
        System.out.println("Course array after sorting in natural order: " + Arrays.toString(courses));
        Arrays.sort(courses, new Course.NameComparator());
        System.out.println("Course array after sorting by name: " + Arrays.toString(courses));
        Arrays.sort(courses, new Course.PriceComparator());
        System.out.println("Course array after sorting by price: " + Arrays.toString(courses));
    }
}

/**
 * This class is used in {@link SortingArrays}.
 */
class Course implements Comparable<Course> {

    private final int number;
    private final String name;
    private final int price;

    Course(int number, String name, int price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {

        return new StringJoiner(", ", Course.class.getSimpleName() + "[", "]")
                .add("number=" + number)
                .add("name='" + name + "'")
                .add("price=" + price)
                .toString();
    }

    /**
     * Compare {@link Course}s in natural order.
     */
    @Override
    public int compareTo(Course o) {
        return Integer.compare(this.number, o.number);
    }

    /**
     * Compares {@link Course}s by name.
     */
    static class NameComparator implements Comparator<Course> {

        @Override
        public int compare(Course course1, Course course2) {
            return course1.name.compareTo(course2.name);
        }
    }

    /**
     * Compare {@link Course}s by price.
     */
    static class PriceComparator implements Comparator<Course> {

        @Override
        public int compare(Course course1, Course course2) {
            return Integer.compare(course1.price, course2.price);
        }
    }
}
