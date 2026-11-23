package S3_IMP_Questions;

public class Ex8_DiffBetween_final_finally_finalize
{
    static void main(String[] args) {

        System.out.println("final is a keyword- used as a keep constant- we cannot change");
        final int a=10;
      //  a=20;           ////can't perform re-initialze

        System.out.println(a);

        System.out.println("Finally is a block used in Exception Handling - finally block used to closing files, database connection and network resource");
        String S1="abcd";
        try
        {
            System.out.println(S1.charAt(5));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBounds Exception is Handled");
        }
        finally
        {
            System.out.println("Running Finally block");
        }

        System.out.println("Finalize- \"finalize() is a method that was used for cleanup before an object was removed from memory by the Garbage Collector. ");


//        finalize()
    }
}
