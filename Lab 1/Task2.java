import java.util.Scanner;
public class Task2{
  public static void main (String[]args){
    Scanner sc =new Scanner(System.in);
    int j = sc.nextInt();
    int a[] = new int[j];
    for(int i =0; i<a.length;i++)
      a[i]=sc.nextInt();
    int max=a[0], min=a[0], maxP=0,minP=0;
    for(int i =1; i<a.length;i++){
      if(max<a[i]){
        max=a[i];
        maxP=i;
      }
      if(min>a[i]){
        min=a[i];
        minP=i;
      }
    }
    a[minP]=max;
    a[maxP]=min;
    for(int i=0;i<a.length;i++)
      if(i==a.length-1)
      System.out.print(a[i]);
    else
      System.out.print(a[i]+", ");
  }
}