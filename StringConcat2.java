public class StringConcat2 {
    public static void main(String[] args) {
        String s = new String("John"),
               t = new String("Smith"), u;

        u = s.concat(" ");
        u = u.concat(t);
        System.out.println("My String is \'" + u + "\'");
    }
    
}
