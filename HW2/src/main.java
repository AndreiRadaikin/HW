import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int high = 0;
        System.out.println("Input High: ");
        high = scan.nextInt();

        int width = 0;
        System.out.println("Input Width: ");
        width = scan.nextInt();

        // прямоугольник

        for (int i = 0; i < high; i++) {
            for (int j = 0; j < width; j++) {
                if(i == 0 || j == 0 || i == (high - 1) || j == (width - 1) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }


        //конверт

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if(i == 0 || j == 0 || i == (width - 1) || j == (width - 1)
                          || i == j || i == ((width - 1)-j) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }


        //в швзмотном порядке
        System.out.print("\n");

        for (int i = 0; i < high; i++) {
            for (int j = 0; j < width; j++) {
                if(i % 2 == 0)
                {
                    if(j % 2 == 0)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else
                {
                    if(j % 2 == 1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }


    }

}
