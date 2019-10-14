public class recursion{
  public static int factorial(int fact){
    if(fact==1)
      return 1;
    else{
      return fact*factorial(fact-1);
    }
  }
  public static node create(int []a){
    node head = new node(a[0],null);
    node n=head;
    for(int i=1;i<a.length;i++){
      node x=new node(a[i],null);
      n.next=x;
      n=x;
    }
    return head;
  }
  public static int fibonacci(int fib){
    if(fib==1)return 1;
    if(fib==2)return 1;
    else{ return fibonacci(fib-1)+fibonacci(fib-2);}
  }
  public static void arrayPrint(int []a,int idx){
    System.out.print(a[idx]+" ");
    if(idx==a.length-1){
    }
    else{
      arrayPrint(a,idx+1);
    }
  }
  public static int powerFind(int num,int pow){
    if(pow==1)
      return num;
    else
      return num*powerFind(num,pow-1);
  }
  
  public static int sumOfNodes(node head){
    if(head.next==null)
      return head.elem;
    else
      return head.elem+sumOfNodes(head.next);
  }
  public static void reverseLinkedListPrint(node head){
    System.out.print(head.elem+" ");
    if(head.next==null){}
    else{
      reverseLinkedListPrint(head.next);
    }
  }
  public static int[] selectionArraySort(int []a){
    return a;
  }
  
  public static void main(String[]args){
    System.out.println(factorial(5));
    System.out.println();
    System.out.println(fibonacci(4));
    System.out.println();
    int a[]={1,2,6};
    node head=create(a);
    arrayPrint(a,0);
    System.out.println();
    System.out.println();
    System.out.println(powerFind(2,4));
    System.out.println();
    System.out.println(sumOfNodes(head));
    System.out.println();
    reverseLinkedListPrint(head);
    System.out.println();
    System.out.println();
  }
}