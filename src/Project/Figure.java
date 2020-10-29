package Project;

public class Figure
{
    public static void printFigure(int width, int height)
    {
        firstPart(width, height);
        middlePart(width);
        lastPart(width, height);
    }
    private static void firstPart(int width, int height)
    {
        for (int i = 0; i <= (height / 2) + 1; i++)
        {
            for (int j = 0; j <= (width / 2) + 1; j++)
            {
                if (i == 0)
                {
                    if (j == 0)
                    {
                        System.out.print('*');
                    }
                    if (j < width / 2 && j > 0)
                    {
                        System.out.print('-');
                    }
                    if (j == (width / 2) + 1)
                    {
                        System.out.println('*');
                    }
                }
                if (i < height / 2 && i > 0)
                {
                    if (j == 0)
                    {
                        System.out.print('|');
                    }
                    if (j < width / 2 && j > 0)
                    {
                        System.out.print(' ');
                    }
                    if (j == (width / 2) + 1)
                    {
                        System.out.println('|');
                    }
                }
            }
        }
    }

    private static void middlePart(int width)
    {
        for (int i = 0; i <= width; i++)
        {
            if (i == 0)
            {
                System.out.print('*');
            }
            if (i < width / 2 && i > 0)
            {
                System.out.print('-');
            }
            if (i == width / 2 + 1)
            {
                System.out.print('*');
            }
            if (i < width && i > width / 2 + 1)
            {
                System.out.print('-');
            }
            if (i == width)
            {
                System.out.println('*');
            }
        }
    }

    private static void lastPart(int width, int height)
    {
        for (int i = 0; i <= height; i++)
        {
            for (int j = 0; j <= width; j++)
            {
                if (i < height && i > height / 2 + 1)
                {
                    if (j < width / 2)
                    {
                        System.out.print(' ');
                    }
                    if (j == width / 2 + 1 && j > width / 2)
                    {
                        System.out.print('|');
                    }
                    if (j < width && j > width / 2 + 1)
                    {
                        System.out.print(' ');
                    }
                    if (j == width)
                    {
                        System.out.println('|');
                    }
                }
                if (i == height)
                {
                    if (j == 0)
                    {
                        System.out.print(' ');
                    }
                    if (j < width / 2 && j > 0)
                    {
                        System.out.print(' ');
                    }
                    if (j == width / 2 + 1)
                    {
                        System.out.print('*');
                    }
                    if (j < width && j > width / 2 + 1)
                    {
                        System.out.print('-');
                    }
                    if (j == width)
                    {
                        System.out.println('+');
                    }
                }
            }
        }
    }
}
