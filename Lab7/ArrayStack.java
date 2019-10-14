public class ArrayStack implements Stack{
  int size;
  Object [] data;
  
  public ArrayStack(){
    size=0;
    data = new Object[5];
  }
  
  public int size(){
    return size;
  }
// Returns true if the stack is empty
  public boolean isEmpty(){
    if(size==0)
      return true;
    else
      return false;
  }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
  public void push(Object e) throws StackOverflowException{
    try{
      if(size!=data.length){
        data[size]=e;
        size++;
      }
      else
        throw new StackOverflowException();
    }
    catch(StackOverflowException except){
    }
  }
  
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
  public Object pop() throws StackUnderflowException{
    try{
      if(size!=0){
        Object c =data[size];
        data[size]=null;
        size--;
        return c;
      }
      else
        throw new StackUnderflowException();
    }
    catch(StackUnderflowException e){
      
    }
    return 0;
  }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
  public Object peek() throws StackUnderflowException{
    try{
      if(size!=0){
        return data[size];
      }
      else
        throw new StackUnderflowException();
    }
    catch(StackUnderflowException e){
      
    }
    return 0;
  }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
  public String toString(){
    String s ="[ ";
    int i=size;
    while(i!=0){
      s+=data[i]+" ";
    }
    s+="]\n";
    return s;
  }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
  public Object[] toArray(){
    Object array[]=new Object[size];
    for(int i=0;i<size;i++){
      array[i]=data[size-i];
  }
    return array;
  }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
      int offset = 0;
      for(int l=size;l!=0;l--)
        if(data[l]==e)
        return size-l;
      return -1;
      
    }
}