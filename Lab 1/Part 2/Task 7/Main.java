public class Main{
  public static void main(String[] args){
    BankAccount acc1=new BankAccount();
    BankAccount acc2=new BankAccount();
    BankAccount acc3=new BankAccount();
    acc1.setBalance(100);
    acc2.setBalance(200);
    acc3.setBalance(300);
    acc1.setName("Acc1");
    acc2.setName("Acc2");
    acc3.setName("Acc3");
    acc1.setAccountID("Nai");
    acc2.setAccountID("Nai");
    acc3.setAccountID("Nai");
    acc1.setAddress("Dhaka");
    acc2.setAddress("Barishal");
    acc3.setAddress("Sylhet");
    acc1.addInterest();
    acc3.addInterest();
    System.out.println(acc1.getName()+" "+acc1.getBalance()+" "+acc1.getAccountID()+" "+acc1.getAddress()+" ");
    System.out.println(acc2.getName()+" "+acc2.getBalance()+" "+acc2.getAccountID()+" "+acc2.getAddress()+" ");
    System.out.println(acc3.getName()+" "+acc3.getBalance()+" "+acc3.getAccountID()+" "+acc3.getAddress()+" ");
  }
}