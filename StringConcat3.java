public class StringConcat3 {
    public static void main(String[] args) {
        String s = new String("John"),
               t = new String("Smith"), u;
           
        u = (s.concat(" ")).concat(t);
        System.out.println("My String is \'" + u + "\'");
    }
}
