package Method_with_Return_Type;

public class Sample1
{
    public static int add(int n1, int n2)
    {
        int addvalue=n1+n2;
        return addvalue;
    }

    static void main(String[] args)
    {

        System.out.println(add(3,4));

        int result=add(4,4);

        System.out.println(result);

    }
}


