public class differenceInArrays{
  public static void main (String[]args){
    int []a={1,3,5,7};
    int []b={2,2,1};
    int aNumber=0;
    int bNumber=0;
    int A=1;
    int B=1;
    for(int i=a.length-1;i>=0;i--){
      aNumber+=a[i]*A;
      A*=10;
    }
    for(int i=b.length-1;i>=0;i--){
      bNumber+=b[i]*B;
      B*=10;
    }
    if(aNumber>bNumber)
      System.out.println(aNumber-bNumber);
    else
      System.out.println(bNumber-aNumber);
  }
}