package ch1_Getting_started;

import java.util.StringJoiner;

/**
 * Model a football team with one member.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-11-15
 */
public class Team {

    private Member member;

    /**
     * Instantiating the team with one member
     *
     * @param member the {@link Member} of the team
     */
    private Team(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Team.class.getSimpleName() + "[", "]")
                .add("member=" + member)
                .toString();
    }

    /**
     * Create a member
     * @return the created member
     */
    private static Member createMember() {
        return new Member("Player1", "football", 23, 89);
    }

    /**
     * Create a team and add a member to it.
     * @return the created team
     */
    private static Team createTeam() {
        Member football_member = createMember();
        return new Team(football_member);
    }

    /**
     * Display team members
     */
    private static void displayTeam(final Team team) {
        System.out.println(team);
    }

    /**
     * Entry method
     * @param args te arguments from the command line
     */
    public static void main(String[] args) {
        Team team = createTeam();
        displayTeam(team);
    }

}
