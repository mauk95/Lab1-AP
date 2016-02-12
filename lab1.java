/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
import lab1.NewClass;
/**
 *
 * @author maukhan.bscs13seecs
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int n, m, p=0;
       Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of first matrix");
      m = in.nextInt();
      n = in.nextInt();
      p = in.nextInt();
 
      int first[][] = new int[n][m];
      int second[][] = new int[m][p];
      
      
      System.out.println("Enter the values of rows and columns of first matrix");
      for (int i = 0 ; i < n ; i++ )
      {
         for (int j = 0 ; j < m ; j++ )
            first[i][j] = in.nextInt(); 
      }
         
      
      System.out.println("Enter the values of rows and columns of secomd matrix");
      for (int i = 0 ; i < m ; i++ )
      {
         for (int j = 0 ; j < p ; j++ )
            second[i][j] = in.nextInt(); 
      }
      
        NewClass.iterative1(first,second);
    }
    
}
