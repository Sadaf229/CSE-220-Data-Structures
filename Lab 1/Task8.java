import java.util.Scanner;
public class Task8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int [] A = new int [x];
    int [] B = new int [x];
    int [] C = new int [x];
    for(int i =0 ; i<A.length;i++)
      A[i]=sc.nextInt();
    for(int i =0 ; i<A.length;i++)
      B[i]=sc.nextInt();
    for(int i =0 ; i<A.length;i++)
      C[i]=(5*A[i])-B[i];
    for(int i =0 ; i<A.length;i++)
      System.out.print(C[i]+" ");
    
  }
}