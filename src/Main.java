import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {



            try {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter a number in the parallelepiped");
                    float height = Float.parseFloat(scanner.nextLine());
                    float length = Float.parseFloat(scanner.nextLine());
                    float width = Float.parseFloat(scanner.nextLine());
                    Parallelepiped p= new Parallelepiped(height, length, width);
                    System.out.println(p);

                    System.out.println("Area of parallelepiped: " + p.area());
                    System.out.println("Volume of parallelepiped: " + p.volume());

            }catch (ArithmeticException e){
                    throw new NumberFormatException();
            }


    }
}
