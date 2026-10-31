package S3_IMP_Questions;

public class Ex3_RunTimeXpath
{
    static void main(String[] args) {

        String s1="GM";
        System.out.println("hi "+s1+" hello");

        String day="20";

        String xpath="//div[text()='"+day+"']";      //div[text()='"++"']
        System.out.println(xpath);
    }
}
