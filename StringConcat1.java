public class StringConcat1 {
    public static void main(String[] args) {
        String s = new String("John"),
        t = new String("Smith"), u;
        u = s.concat(t);
        System.out.println("My String is \'" + u + "\'");
    }

}
