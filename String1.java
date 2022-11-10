import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {
        // Adding String values
        String[] colors = { "Cricket", "Basketball", "Football", "Badminton", "Tennis" };
        // Print Original values
        System.out.println("Entered Sports: " + Arrays.toString(colors));
        Arrays.sort(colors); // Sorting Elements
        // Print Sorted Values
        System.out.println("Sorted Sports: " + Arrays.toString(colors));
    }
}