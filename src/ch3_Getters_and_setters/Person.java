package ch3_Getters_and_setters;

/**
 * Getters an Setters allow for an object to contain private variables which can be accessed and changed
 * with restrictions.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-15
 */
public class Person {

    private String name;

    /**
     * Get name of the person
     *
     * @return the name if it its length less than or equal to 16, otherwise "Name is too large"
     */
    public String getName() {
        if (name.length() > 16) {
            return "Name is too large";
        } else {
            return name;
        }
    }

    /**
     * Set the name of the person if is not null and the length is larger than 2
     *
     * @param name the name of the person
     */
    public void setName(final String name) {
        if (name != null && name.length() > 2) {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
