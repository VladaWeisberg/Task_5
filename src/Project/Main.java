package Project;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int width = readInt("width");
        int height = readInt("height");

        Figure figure = new Figure();
        figure.printFigure(width, height);
    }

    private static int readInt(String name)
    {
        System.out.printf("Input an odd %s value ", name);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
