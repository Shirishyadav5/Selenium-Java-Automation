package S3_IMP_Questions;

public class Ex1_HowToDebugCode
{
    static void main(String[] args) {

        int num1=10;
        int num2=20;
        int add=num1+num2;
        System.out.println(add);
        int multi=num1*num2;
        System.out.println(multi);

        findSquareOfNum(num1);
        System.out.println("main method ended");
    }

    public static void findSquareOfNum(int num)
    {
        int square=num*num;
        System.out.println(square);
        System.out.println("square of num method ended");
    }
}
