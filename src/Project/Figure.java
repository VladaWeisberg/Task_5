package Project;

public class Figure
{
    private final int width;
    private final int height;

    public Figure(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public void firstPart()
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

    public void middlePart()
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

    public void endPart()
    {
        for (int i = (width / 2) + 2; i <= height; i++)
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
