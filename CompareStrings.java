 public class CompareStrings  {
    public static void main(String[] args)  {
        String s = new String("First");
        String t = new String("first");
        String u = new String("Second");
        
        if (s.equals(t))
            System.out.println("\'" + s + "\' and \'" + t 
                                     + "\' are the same.");
        else
            System.out.println("\'" + s + "\' and \'" + t 
                                     + "\' are different.");
        
        if (s.equalsIgnoreCase(t))
            System.out.println("\'" + s + "\' and \'" + t 
                                     + "\' are almost the same.");
        else
            System.out.println("\'" + s + "\' and \'" + t
                                     + "\' are very different.");
        if (s.compareTo(u) == 0)
            System.out.println("\'" + s + "\' and \'" + u 
                                     + "\' are the same.");
        else if (s.compareTo(u) > 1)
            System.out.println("\'" + s + "\' comes after  \'"
                                     + u + "\'.");
        else
            System.out.println("\'" + s 
        + "\' comes before \'"
        + u + "\'.");
        if (s.compareTo(t) == 0)
            System.out.println("\'" + s + "\' and \'" + t
                                    + "\' are the same.");
        else if (s.compareTo(t) > 1)
            System.out.println("\'" + s + "\' comes after  \'" 
                                    + t + "\'.");
        else
            System.out.println("\'" + s + "\' comes before \'" 
                                    + t + "\'.");
    }
}
