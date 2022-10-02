import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        float length = 0;
        float breadth = 0;
        float area = 0;
        float perimeter = 0;
        float diagonal = 0;
        double diagonal_2;

        String trash = "";

        System.out.println("enter the length of the rectangle - ");

        if (in.hasNextFloat())
        {
            length = in.nextFloat();


        }

        System.out.println("enter the breadth of the rectangle - ");

        if (in.hasNextFloat())
        {
            breadth = in.nextFloat();
        }

        else
        {
            trash = in.nextLine();
            System.out.println(trash + " you have entered an incorrect input");
        }

        area = length * breadth;
        System.out.println("area of the rectangle is - " + area);

        perimeter = 2 * (length + breadth);
        System.out.println("perimeter of rectangle is - " + perimeter);

        diagonal = (length * length) + (breadth * breadth);
        diagonal_2 = Math.sqrt(diagonal);
        System.out.println("diagonal of rectangle is " + diagonal_2);






    }
}