public class IndexOf  {
    public static void main(String[] args) {
        String s = new String("John Francis Xavier Smith"),
               t = new String();
        int    i = s.indexOf("Fran");
        
        t = s.substring(i, i+7);
        System.out.println("My String is \'" + t + "\'");
    }

}
