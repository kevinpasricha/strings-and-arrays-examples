public class TwoDArray  {
    public static void main(String[] args) {
        int [] [] x;
        x = new int[10][10];
        
        for (int i = 0;  i < 10;  i++) {
            for (int j = 0;  j < 10;  j++) {
                x[i][j] = 5*i + j;
            }
        }
        
        for (int i = 0;  i < 10;  i++) {
            for (int j = 0;  j < 10;  j++) {
                System.out.printf("%2d   ", x[i][j]);
            }
        System.out.println();
        }
    }

}
