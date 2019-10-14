public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    Node n =new Node(a[0],null);
    Node pre = n;
    head = pre;
    for(int i=1;i<a.length;i++){
      Node n1 = new Node(a[i],null);
      pre.next = n1;
      pre=n1;
    }
    head = n;
    
  }
  
  
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count=0;
    Node n=head;
    while(n!=null){
      count++;
      n=n.next;
    }
    return count;
  }
  
  /* prints the elements in the list */
  public void printList(){
    Node n=head;
    while(n!=null){
      System.out.print(n.element +" ");
      n=n.next;
    }
    System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    Node n=head;
    while(n!=null){
      if(idx==0)
        return n;
      idx--;
      n=n.next;
    }
    return null; // please remove this line!
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    Node n=head;
    while(n!=null){
      if(idx==0)
        return n.element;
      idx--;
      n=n.next;
    }
    return null; // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    Node n=head;
    while(n!=null){
      if(idx==0){
        Object c =n.element;
        n.element=elem;
        return c;
      }
      idx--;
      n=n.next;
    }
    return null; // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    Node n=head;
    int idx=0;
    while(n!=null){
      if(n.element==elem){
        return idx;
      }
      idx++;
      n=n.next;
    }
    return -1; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    Node n=head;
    while(n!=null){
      if(n.element==elem)
        return true;
      n=n.next;
    }
    return false; // please remove this line!
  }
  
  public LinkedList(Node h){
    head =h;
  }
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    return head;
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node n = head.next;
    head.next = null;
    Node temp = n.next;
    n.next=head;
    while(temp.next!=null){
      Node prev =n;
      n=temp;
      temp=temp.next;
      n.next=prev;
    }
    temp.next=n;
    head = temp;
    return head;
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    Node n=head;
    int c=1;
    while(n.next!=null){
      c++;
      n=n.next;
    } 
    if(idx==0){
      Node n1=new Node(elem,head);
      head = n1;
    }
    else if(idx==c){
      Node n1=new Node(elem,null);
      n.next=n1;
    }
    else if(idx<c){
      Node n1=new Node(elem,null);
      n=head;
      while(n!=null){
        if(idx==1){
          Node use = n.next;
          n.next=n1;
          n1.next = use;
        }
        idx--;
        n=n.next;
      }
    }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int idx){
    Node n=head;
    int c=1;
    while(n.next!=null){
      c++;
      n=n.next;
    } 
    if(idx==0){
      Object k = head.element;
      head = head.next;
      return k;
    }
    else if(idx==c){
      n=head;
      while(n!=null){
        if(idx==1){
          Object k=n.next.element;
          n.next=null;
          return k;
        }
        idx--;
        n=n.next;
      }
    }
    else if(idx<c){
      n=head;
      while(n!=null){
        if(idx==1){
          Object k = n.next.element;
          n.next=n.next.next;
          return k;
        }
        idx--;
        n=n.next;
      }
    }
    return null; // please remove this line!
  }
  
// Rotates the list to the left by 1 position.
  public void rotateLeft(){
    Node n=head;
    Node n1=head;
    head = n.next;
    while(n.next!=null){
      n=n.next;
    }
    n.next = n1;
    n1.next=null;
  }
  
// Rotates the list to the right by 1 position.
  public void rotateRight(){
    //if(head.next!=null){
      Node temp = head;
      Node n = temp.next;
      while(n.next!=null){
        temp=n;
        n=n.next;
      }
      temp.next=null;
      n.next=head;
      head = n;
    //}
  }
}