public class BankAccount {
  String name, address, accountID ;
  double balance;
  public String getName(){
    return name;
  }
  public void setName(String n){
    name =n;
  }
  public String getAccountID(){
    return accountID;
  }
  public void setAccountID(String i){
    accountID = i;
  }
  public String getAddress(){
    return address;
  }
  public void setAddress(String a){
    address = a;
  }
  public double getBalance(){
    return balance;
  }
  public void setBalance(double c){
    balance = c;
  }
  public void addInterest(){
    balance += (balance*.07);
  }
}
      
//adds 7% of the balance
    
