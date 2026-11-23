package S3_IMP_Questions;

public class Ex9_diffBetween_String_StringBuilderStringBuffer
{
    static void main(String[] args) {

        String S1="abc1";
        System.out.println(S1);

        StringBuffer sf=new StringBuffer("abc2");
        System.out.println(sf);
        System.out.println(sf.reverse());

        StringBuilder sb=new StringBuilder("xyz");
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
