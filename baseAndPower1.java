import java.util.Scanner;
public class baseAndPower1{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    //taking length of an array
    int n = sc.nextInt();
    int []a=new int[n];
    //filling up the array
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    
    //arrays for storing base and pwoer
    int base[]=new int[n];
    int power[]=new int[n];
    
    //Taking each element
    for(int j=0;j<a.length;j++){
      if(a[j]==1){
        base[j] = 1;
        power [j] = 1;
        continue;
      }
      else{
        boolean flag = false;
        for(int i=2 ; i<=a[j]; i++){
          int temp=i;
          int count=1;
          while(temp<a[j]){
            temp*=i;
            count++;
          }
          if(temp==a[j]){
            flag = true;
            base [j] = i;
            power [j] = count;
            break;
          }
        }
        if(flag == true){
          continue;
        }
      }
    }
    for(int i=0;i<a.length;i++){
      System.out.println("Element "+i+1+" has the base of "+base[i]+" and power "+power[i]);
    }
    
  }
}