/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author maukhan.bscs13seecs
 */
import java.util.Scanner;
public class NewClass {

    public static int[][] iterative1(int[][] first,int[][] second)
    {
        int n = first.length;
        int m = first[0].length;
        int p = second[0].length;
        int ans[][] = new int[n][p];
 
int sum=0;
       for (int i = 0 ; i < n ; i++ )
         {
            for (int j = 0 ; j < p ; j++ )
            {   
               for (int k = 0 ; k < m ; k++ )
               {
                  sum = sum + first[i][k]*second[k][j];
               }
 
               ans[i][j] = sum;
               sum = 0;
            }
         }
 System.out.println("product is:");
 
 for (int i=0;i<n;i++)
 {
     for (int j=0;j<p;j++)
     {
         System.out.print(ans[i][i]+" ");
         
     }
     System.out.print("\n");
 }
    
        return ans;
    }
    /**
     * @param args the command line arguments
     */
   
    
}
