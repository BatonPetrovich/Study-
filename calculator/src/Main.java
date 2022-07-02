import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int b, c;
        int d, f;
        Scanner a = new Scanner(System.in);
        System.out.print("Enter num 1 ");
        b = a.nextInt();
        System.out.print("Enter num 2 ");
        c = a.nextInt();
        System.out.print("Enter your action \n 1 = multiplication \n 2 = addition \n 3 = subtraction \n 4 = division \n ");
        f = a.nextInt();
        switch (f) {
            case 1:
                if (f == 1) {
                    d = b * c;
                    System.out.print(b + "*" + c + " = " + d);
                }
                break;
            case 2:
                if (f == 2) {
                    d = b + c;
                    System.out.print(b + "+" + c + " = " + d);
                }
                break;
            case 3:
                if (f == 3) {
                    d = b - c;
                    System.out.print(b + "-" + c + " = " + d);
                }
                break;
            case 4:
                if (f == 4) {
                    d = b / c;
                    System.out.print(b + "/" + c + " = " + d);
                }
                break;
        }
    }
}