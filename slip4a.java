import java.util.Scanner;

class slip4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Alternate characters: ");
        for (int i = 0; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }

        sc.close();
    }
}
