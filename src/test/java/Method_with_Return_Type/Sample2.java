package Method_with_Return_Type;

public class Sample2
{
    public int multi(int num1, int num2)
    {
        int num3=num1*num2;
        return num3;
    }


    static void main(String[] args)
    {
        Sample2 s2=new Sample2();
        int output=s2.multi(2,2);

        System.out.println(output);

        System.out.println(s2.multi(3,3));

    }
}
