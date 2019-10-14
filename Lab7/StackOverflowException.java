public class StackOverflowException extends Exception{
  public StackOverflowException(){
    System.out.println("Can't take input as the stack is already full");
  }
}