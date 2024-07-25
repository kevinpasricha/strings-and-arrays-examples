import java.util.Scanner;

public class Matrix  {
  public final int numRows = 4, 
                   numColumns = 4;
  
  private int[][] matrix;
  
  public Matrix()  {
    matrix = new int[numRows][numColumns];
  }
  //read() - Read in a matrix
  public void read()  {
    int i, j;
    Scanner keyb = new Scanner(System.in);
    for (i = 0;  i < numRows; i++)  {
      System.out.println("Enter row #" + (i+1) 
                           + "\t?");
      for (j = 0;  j < numColumns;  j++) {
        System.out.println("Enter x[" + i
                             + "][" + j + "]");
        matrix[i][j] = keyb.nextInt();
      }
    }
  }
  // write() – Write an i x j matrix
  void write()  {
    int i, j;
    
    for (i = 0;  i < numRows;  i++) {
      for (j = 0; j < numColumns;  j++)
        System.out.print("\t" + matrix[i][j]);
      System.out.println();
    } 
  }
// multmatrix() – Multiply this x b to get c
  public Matrix mult(Matrix b)  {
    Matrix c = new Matrix();
    int i, j, k;
    for (i = 0;  i < numRows; i++)  
      for (j = 0;  j < numColumns;  j++) {
        c.matrix[i][j] = 0;
        for (k = 0;  k < numRows;  k++)
          c.matrix[i][j] 
                  += matrix[i][k]*b.matrix[k][j];
      }
    return c;
  }
}
