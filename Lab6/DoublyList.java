public class DoublyList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public DoublyList(Object [] a){
    head = new Node(null, null, null);
    Node tail = head;
    
    for(int i = 0; i<a.length; i++){
      Node mn = new Node(a[i], null, null);
      tail.next = mn;
      mn.prev=tail;
      tail=tail.next;
    }
    tail.next=head; // Making it circular
    head.prev=tail;
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public DoublyList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count =0;
    Node h=head.next;
    while(h!=head){
      count++;
      h=h.next;
    }
    return count; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void forwardprint(){
    Node h=head.next;
    while(h!=head){
      System.out.print(h.element+" ");
      h=h.next;
    }
    System.out.println();
  }
  
  public void backwardprint(){
    Node h=head.prev;
    while(h!=head){
      System.out.print(h.element+" ");
      h=h.prev;
    }
    System.out.println();
  }
  
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    int count =-1;
    Node h=head.next;
    while(h!=head){
      count++;
      if(count==idx)
        return h;
      h=h.next;
    }
    return null;
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int count =-1;
    Node h=head.next;
    while(h!=head){
      count++;
      if(elem==h.element)
        return count;
      h=h.next;
    }
    return -1;
  }

  
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    int count =-1;
    Node h=head.next;
    while(h!=head){
      count++;
      if(count==idx){
        Node n = new Node(elem,h,h.prev);
        h.prev=n;
        h=n.prev;
        h.next=n;
      }
      h=h.next;
    }
  }
   /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    int count =-1;
    Node h=head.next;
    while(h!=head){
      count++;
      if(count==index){
        Node remove = h;
        h.prev.next=h.next;
        h.next.prev=h.prev;
        return remove.element;
      }
      h=h.next;
    }
    return null; // please remove this line!
  }
  
  
  
}