public class Classwork
{
  public static String DelEnd(String msg, int n) {
   String msg1 = new String(msg);
   int len = msg1.length();
   String ez = msg1.substring(0, len - n);
   return ez;
  }
  public static String FirstLastN(String msg, int n) {
      String msg1 = new String(msg);
      String first = msg1.substring(0, n);
      int len = msg1.length();
      String last = msg1.substring(len - n);
      String concatted = first + last;
      return concatted;
  }
  public static void main(String[] args)
  {
    String firstLast = FirstLastN("dictionary", 1);
    String firstLast2 = FirstLastN("apple", 2);
    System.out.println(firstLast);
    System.out.println(firstLast2);
    String secondQuestion = DelEnd("library", 5);
    System.out.println(secondQuestion);
    // test your code here
  }

  // write solutions to problems below

}
