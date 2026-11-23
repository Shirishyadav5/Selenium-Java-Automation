package S3_IMP_Questions;

public class Ex10_DiffBetween_Throw_ThrowsKeyword
{
    static void main(String[] args) throws Exception {
        Thread.sleep(2000);
        checkAge(19);

    }

    public static void checkAge(int age) throws Exception {
        if (age<18)
        {
            throw new Exception("age must be 18 or older");
        }
        System.out.println(" ");
        Thread.sleep(3000);


    }
}
