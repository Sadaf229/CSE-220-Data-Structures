public class ListStack implements Stack{
  int size;
  Node top;
  
  
  public ListStack(){
    size = 5;
    top = null;
  }
  public int size(){
    return size;
  }
// Returns true if the stack is empty
  public boolean isEmpty(){
    if(top==null)
      return true;
    return false;
  }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
  public void push(Object e) throws StackOverflowException{
    try{
      int count =0;
      for(Node n=top;n!=null;n=n.next){
        count++;
      }
      if(count==size)
        throw new StackOverflowException();
      else{
        Node x =new Node(e,null);
        x.next=top;
        top=x;
      }
    }
    catch (StackOverflowException except){
      
    }
  }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
  public Object pop() throws StackUnderflowException{
    try{
      if(size==0)
        throw new StackUnderflowException();
      else{
        Node x=top;
        top=top.next;
        return x.val;
      }
    }
    catch(StackUnderflowException e){
      
    }
    return 0;
  }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
  public Object peek() throws StackUnderflowException{
    try{
      if(size==0)
        throw new StackUnderflowException();
      else
        return top.val;
    }
    catch (StackUnderflowException e){
      
    }
    return 0;
  }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
  public String toString(){
    String s="[ ";
    for(Node n=top;n!=null;n=n.next)
      s+=n.val+" ";
    s+="]";
      return s;
  }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
  public int toArray(){
    Object array=new Object[size];
    Node n=top;
    for(int i=0;i<size;i++,n=n.next)
System.out.println(n.val);
//      array[i]=n.val;
  return 0;
  }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
  public int search(Object e){
    return 0;
  }
}