public class linkedList{
  Node head;
  public linkedList(Node h){
    head=h;
  }
  public void insert(Node ins){
    Node n = head;
    while(n.next!=null)
      n=n.next;
    n.next=ins;
  }
  public void delete(Node del){
    if(head==del)
      head=head.next;
    else{
      Node n = head;
      while(n.next!=null){
        if(n.next==del){
          n.next=n.next.next;
        }
        n=n.next;
      }
    }
  }
  public void sort(){
    
  }
}