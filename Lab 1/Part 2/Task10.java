import java.util.Scanner;
public class Task10{
  public static void main(String[]args){
    int a[]={1, 4, 8, 16, 25, 36, 49, 64, 81, 100};
    int b[]={1, 4, 8, 16, 25, 36, 49, 64, 81, 100};
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      int temp = a[0];
      for(int j=1;j<a.length;j++){
        a[j-1]=a[j];
      }
      a[a.length-1]=temp;
      int temp2 = b[b.length-1];
      for(int j=b.length-2;j>=0;j--){
        b[j+1]=b[j];
      }
      b[0]=temp2;
    }
    for(int j=0;j<a.length;j++){
      if(j==a.length-1)
        System.out.print(a[j]+".");
      else
        System.out.print(a[j]+", ");
    }
    System.out.println();
    for(int j=0;j<b.length;j++){
      if(j==b.length-1)
        System.out.print(b[j]+".");
      else
        System.out.print(b[j]+", ");
    }
    System.out.println();
  }
}