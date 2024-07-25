public class SubString1 {
    public static void main(String[] args) {
        String s = new String("The quick brown fox " 
                     + "jumped over the lazy dogs"),
                     
        t = new String();
        t = s.substring(12);
        System.out.println("My String is\n \'" + t + "\'");
    }
}
