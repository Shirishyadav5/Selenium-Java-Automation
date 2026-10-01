package Method_with_Return_Type;

public class Sample3
{
    public static String animal(String cat)
    {
        String str=cat.toUpperCase();
        return str;
    }
    static void main(String[] args)
    {
        System.out.println(animal("Mona"));

        String result = animal("beri");
        System.out.println(result);

    }
}
