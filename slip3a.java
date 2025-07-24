import java.util.Scanner;

class slip3a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int temp = n, r, sum = 0;

        while (n > 0) {
            r = n % 10;
            sum += (r * r * r);
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println(temp + " is an Armstrong Number.");
        } else {
            System.out.println(temp + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
