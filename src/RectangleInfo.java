import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = 0.0, width = 0.0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("Enter the length of the rectangle: ");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a number.");

            }
        } while (!done);

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a number.");
                done = false;
            }
        } while (!done);

        double area = length * width;
        double perimeter = 2 * (length + width);
        double lengthDiagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The length of the diagonal is " + lengthDiagonal);

    }

}
