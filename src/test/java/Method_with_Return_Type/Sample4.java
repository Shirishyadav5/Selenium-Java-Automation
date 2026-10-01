package Method_with_Return_Type;

public class Sample4
{
    public static int getrollnum()
    {
        int rollnum=10;
        return rollnum;
    }
    static void main(String[] args)
    {
        System.out.println(getrollnum());

        int result=getrollnum();
        System.out.println(result);
    }
}
