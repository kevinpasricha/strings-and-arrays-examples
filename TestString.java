public class TestString  {
    public static void main(String[] args) {
        String s = new String("This is the first");
        String t = new String();
        
        t = "This is the second";
        System.out.println("Your string is \'" + s
                                   + "\'.");
        System.out.println("Your other string is \'"
                                   + t + "\'.");
  }
}