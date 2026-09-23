/**
 * Exercise 7 — AboutMe
 *
 * TODO: Declare and initialize at least one variable of EACH type:
 *     int, double, boolean, char, String
 *
 * Then print each one with a descriptive label.
 *
 * Requirements:
 *   - Use camelCase names
 *   - Names must be descriptive (favoriteNumber, not x)
 *   - Include at least one `final` constant in ALL_CAPS
 */
public class AboutMe {
    public static void main(String[] args) {

        final int BIRTH_YEAR = 2000; // Replace with your birth year
        int favoriteNumber = 7; // Replace with your favorite number
        double favoriteDecimal = 3.14; // Replace with a decimal value you like
        boolean likesJava = true; // Replace with true or false
        char favoriteInitial = 'A'; // Replace with your favorite initial
        String name = "YOUR_NAME"; // Replace with your name

        System.out.println("Name: " + name);
        System.out.println("Birth year: " + BIRTH_YEAR);
        System.out.println("Favorite number: " + favoriteNumber);
        System.out.println("Favorite decimal: " + favoriteDecimal);
        System.out.println("Likes Java: " + likesJava);
        System.out.println("Favorite initial: " + favoriteInitial);

    }
}
