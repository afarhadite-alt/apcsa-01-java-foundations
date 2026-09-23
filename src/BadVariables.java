/**
 * Exercise 9 — Fix the Declarations
 *
 * SIX of the lines below are broken. Find them, fix them,
 * and add a comment on each fixed line saying what was wrong.
 *
 * One of them compiles fine but is still a bad idea. Find that one too.
 */
public class BadVariables {
    public static void main(String[] args) {

        int secondPlace = 5; // Identifiers cannot begin with a number.

        double price = 9.99; // A double must use a numeric value, not a String.

        boolean isReady = true; // A boolean must use true or false without quotes.

        char grade = 'A'; // A char uses single quotes, not double quotes.

        int classNumber = 11; // class is a reserved Java keyword.

        String name = "Sarah"; // Variable names should use camelCase, not PascalCase.

        int studentScore = 95; // Identifiers cannot contain spaces.

        System.out.println("If this runs, you fixed them all.");
    }
}
