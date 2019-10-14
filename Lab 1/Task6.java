import java.util.Scanner;
public class Task6{
  public static void main (String[]args){
    Scanner sc =new Scanner(System.in);
    int k=sc.nextInt();
    int a[] = new int[k];
    for(int i =0; i<k;i++){
      a[i]=sc.nextInt();
    }
    boolean flag = false;
    if(k%2==0){
      flag = false;
    }
    else{
      for(int i = 0 ; i<a.length/2; i++){
        if(a[i]==a[a.length-1-i]){
          flag=true;
        }
        else{
          flag =false;
          break;
        }
      }
    }
    if(flag == false)
      System.out.println("Not Palindrome");
    else
      System.out.println("Palindrome");
  }
}