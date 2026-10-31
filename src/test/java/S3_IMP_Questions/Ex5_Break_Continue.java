package S3_IMP_Questions;

public class Ex5_Break_Continue
{
    static void main(String[] args)
    {
        continueKeyword();
        breakKeyword();

    }

    public static void continueKeyword()
    {

        for (int i=0; i<=10; i++)
        {
            if (i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
    public static void breakKeyword()
    {
        for (int i=0; i<=10; i++)
        {
            if (i==5)
            {
                break;
            }
            System.out.println(i);

        }
    }
}
