package ch3_Getters_and_setters;

/**
 * Why use Getter and Setters?
 * Example: Lets consider if we want to synchronize access to modify and accessing the count.
 * <p>
 * Encapsulation is a basic concept in OOP. It is about wrapping data and code as a single unit.
 * In this case, it ia a good practice to declare the variables as private and then access them through
 * Getters and Setters to view/or modify them.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-16
 */
public class CountHolder {

    private int count = 0;

    public synchronized int getCount() {
        return count;
    }

    public synchronized void setCount(int count) {
        this.count = count;
    }
}
