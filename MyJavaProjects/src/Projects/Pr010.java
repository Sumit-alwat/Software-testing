package Projects;

public class Pr010 {
	public static void main(String[] args) {
	
    int k = 3;  // Height of the pattern (half)
    
    // Upper half
    for (int i = 1; i <= k; i++) {
        for (int j = i; j < k; j++) {
            System.out.print("  "); // Print spaces
        }
        for (int j = 1; j <= (2 * i - 1); j++) {
            System.out.print("* "); // Print stars
        }
        System.out.println();
    }
    
    // Lower half
    for (int i = k - 1; i >= 1; i--) {
        for (int j = k; j > i; j--) {
            System.out.print("  "); // Print spaces
        }
        for (int j = 1; j <= (2 * i - 1); j++) {
            System.out.print("* "); // Print stars
        }
        System.out.println();
    }
	}
}



