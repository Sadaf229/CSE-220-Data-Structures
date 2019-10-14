import java.util.Scanner;
public class Task3{
  public static void main (String[]args){
    Scanner sc =new Scanner(System.in);
    int a[] = new int[5];
    int evens = 0;
    for(int i =0; i<a.length;i++)
      a[i]=sc.nextInt();
    for(int i =0; i<a.length;i++)
      for(int j=i+1;j<a.length;j++)
      if(a[i]<a[j]){
      a[i]=a[j]+a[i];
      a[j]=a[i]-a[j];
      a[i]=a[i]-a[j];
    }
    for(int i =0; i<a.length;i++){
      System.out.print(a[i]+", ");
      if(a[i]%2==0)
        evens++;
    }
    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
        if(evens==1)
          System.out.print(a[i]+".");
        else
          System.out.print(a[i]+", ");
        
        evens--;
      }
    }
  }
}
