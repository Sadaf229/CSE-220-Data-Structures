import java.util.Scanner;
public class Task9{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int i =0 ; i<a.length;i++)
      a[i]=sc.nextInt();
    display(a,a.length);
    squares(a,a.length);
    display(a,a.length);
  }
  public static void display(int b[], int size){
    for(int i=0;i<size;i++)
      System.out.println(b[i]);
  }
  public static void squares(int b[], int size){
    for(int i=0;i<size;i++)
      b[i]=b[i]*b[i];
  }
}