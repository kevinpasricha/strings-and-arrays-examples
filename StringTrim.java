public class StringTrim {
    
    public static void main(String[] args) {
        String s = new String("   This Is The First   ");
        s = s.trim();
        System.out.println("My String is \'" + s + "\'");
        System.out.println("It has " + s.length() + " characters.");
    }
}
