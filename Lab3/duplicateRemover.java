public class duplicateRemover{
  public static void main (String[]args){
    int []a={1,2,2,1};
    for(int i=0;i<a.length;i++){
      int temp=a[i];
      for(int j=i+1;j<a.length;j++){
        if(a[j]==temp){
          a[j]=0;
        }
      }
    }
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}