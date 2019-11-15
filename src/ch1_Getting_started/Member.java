package ch1_Getting_started;

import java.util.StringJoiner;

/**
 * Model a member of a team.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-15
 */
public class Member {
    private String name;
    private String type;
    private int level;
    private int rank;

    /**
     * Constructor of the class.
     *
     * @param name  - the name of the member
     * @param type  - the type of the member
     * @param level - the level of the member
     * @param rank  - teh rank of the member
     */
    public Member(String name, String type, int level, int rank) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }

    /**
     * Get the name of the member
     *
     * @return the name of the member
     */
    public String getName() {
        return name;
    }

    /**
     * Get the type of the member
     *
     * @return the type of type member
     */
    public String getType() {
        return type;
    }

    /**
     * Get the level of the member
     *
     * @return the level of the member
     */
    public int getLevel() {
        return level;
    }

    /**
     * Get the rank of the member
     *
     * @return the rank of the member
     */
    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Member.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("type='" + type + "'")
                .add("level=" + level)
                .add("rank=" + rank)
                .toString();
    }
}
