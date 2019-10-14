public class A{
  public static Node create(int [] array){
    Node head1= new Node(array[0]);
    head1.size=array.length;
    Node something=head1;
    for(int i=1;i<array.length;i++){
      Node x=new Node(array[i]);
      something.next=x;
      something=x;
    }
    return head1;
  }
  
  public static void print(Node h){
    while(h.next!=null){
      System.out.print(h.elem+", ");
      h=h.next;
    }
    System.out.println(h.elem);
  }
  
  public static void insert(Node a,Node b,int index)throws error{
    if(index<a.size && index>=0){
      if(index==0){
        while(b.next!=null)
          b=b.next;
        b.next=a;
      }
      else{ 
        for(;index>1;index--)
          a=a.next;
        Node temp=a.next;
        a.next=b;
        while(b.next!=null)
          b=b.next;
        b.next=temp;
      }
    }
    else
      throw new error();
  }
  
  public static void main(String[]args){
    int a[]={10,20,30};
    int b[]={400,50,70};
    Node head1=create(a);
    Node head2=create(b);
    try{
      insert(head1,head2,1);
    }
    catch(Exception e){
      
    }
    print(head1);
  }
}