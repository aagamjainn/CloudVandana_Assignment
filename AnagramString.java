import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Output: true (They are anagrams)");
        } else {
            System.out.println("Output: false (Not anagrams)");
        }

        scanner.close();
    }
}
