import java.util.Scanner;
public class Task5{
  public static void main (String[]args){
    Scanner sc =new Scanner(System.in);
    int a[] = new int[10];
    for(int i =0; i<15;i++){
      int j=sc.nextInt();
      if(j>=0 && j<=9)
        a[j]++;
      else
        i--;
    } 
    for(int i =0; i<10;i++)
      System.out.println(i+" was found "+a[i]+" times");
    
  }
}