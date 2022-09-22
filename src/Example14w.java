import java.util.Scanner;
public class Example14w {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter first number");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        a = inputValue.nextInt();

        System.out.println("Enter second number");
        inputValue = new Scanner(System.in);
        b = inputValue.nextInt();

        System.out.println("Enter third number");
        inputValue = new Scanner(System.in);
        c = inputValue.nextInt();


        if ((a < b) && (b < c)) {
            System.out.println(a + " " + b + " " + c);
        }
        if ((a < b) && (b > c) && (a > c)) {
            System.out.println(c + " " + a + " " + b);
        } else if ((a < b) && (b > c) && (a < c)) {
            System.out.println(a + " " + c + " " + b);
        }
        if ((a > b) && (b > c)) {
            System.out.println(c + " " + b + " " + a);
        }
        if ((a > b) && (b < c) && (c < a)) {
            System.out.println(b + " " + c + " " + a);
        }
        if ((a > b) && (b < c) && (c > a)) {
            System.out.println(b + " " + a + " " + c);
        }

    }
}

