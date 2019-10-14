public class Task11{
  public boolean allDigitsOdd(int a){
    boolean flag = true;
    int temp = a;
    int digits=0;
    while(temp>0){
      temp/=10;
      digits++;
    }
    while(digits-1!=0){
      int f = a;
      f/=(Math.pow(10,digits-1));
      if(f%2==0){
        flag=false;
        break;
      }
      a%=(Math.pow(10,digits-1));
      digits--;
    }
    if(a%2==0)
      flag=false;
    return flag;
  }
}