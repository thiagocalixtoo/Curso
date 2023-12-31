package application;
import entities.Rectangles;
import java.util.Scanner;

public class calculateRectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name;
        double height;
        double width;

        System.out.print("Enter the name of rectangle: ");
        name = sc.nextLine();
        System.out.print("Enter the height of rectangle: ");
        height = sc.nextDouble();
        System.out.print("Enter the width of rectangle: ");
        width = sc.nextDouble();
        sc.nextLine();

        Rectangles r = new Rectangles(name, height, width);
        System.out.println(r);

        System.out.print("\nEnter the updated data for the rectangle\nName: ");
        r.setNameRectangle(sc.nextLine());
        System.out.print("Height: ");
        r.setHeight(sc.nextDouble());
        System.out.print("Width: ");
        r.setWidth(sc.nextDouble());

        System.out.println("\nUpdate data:\n" + r);
        sc.close();
    }
}
