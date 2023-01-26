
import java.util.*;

public class findx {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row_size=sc.nextInt();
        int col_size=sc.nextInt();
        int ar[][]=new int[row_size][col_size];
        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<col_size;j++)
            {
                ar[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<col_size;j++)
            {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
        int x=sc.nextInt();
        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<col_size;j++)
            {
                if(x==ar[i][j])
                {
                  System.out.println("index at which x is found"+ar[i][j]);
                }
            }
        }
    

    }
        }
