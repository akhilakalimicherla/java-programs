import java.util.Scanner;

class Solution {

    public static String AlternateCombine(String a, String b) {
        StringBuilder result = new StringBuilder();

        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }    
            if (a.length()>minLength) {
                result.append(a.substring(minLength));
            }
            else if (b.length()>minLength) {
                 result.append(b.substring(minLength));
            }
        

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        String output = AlternateCombine(a,b);

        System.out.println("Combined String: " + output);

        sc.close();
    }
}
