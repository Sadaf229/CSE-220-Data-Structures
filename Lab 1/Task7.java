import java.util.Scanner;
public class Task7{
  public static void main (String[]args){
    Scanner sc =new Scanner(System.in);
    int a[] = new int[10];
    for(int i =0; i<a.length;i++){
      a[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    for(int i=0;i<a[k];i++){
      System.out.print("*");
    }
  }
}