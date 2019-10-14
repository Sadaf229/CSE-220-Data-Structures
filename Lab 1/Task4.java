import java.util.Scanner;
public class Task4{
  public static void main (String[]args){
    Scanner sc =new Scanner(System.in);
    int a[] = new int[10];
    a[0]=sc.nextInt();
    for(int i =1; i<a.length;i++){
      a[i]=sc.nextInt();
      for(int j=0;j<i;j++)
        if(a[i]==a[j]){
        System.out.println(a[i] +" is already among the entered numbers \n Please enter a new number.");
        i--;
      }
      
    }
  }
}