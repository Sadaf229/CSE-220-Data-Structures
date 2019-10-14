public class Date{
  int month,day,year;
    public Date(int d,int m,int y){
    day = d;
    month = m;
    year = y;
  }
  public void setDay (int d){
    day =d;
  }
  public void setMonth (int d){
    month =d;
  }
  public void setYear (int d){
    year =d;
  }
  public int getDay (){
    return day;
  }
  public int getMonth (){
    return month;
  }
  public int getYear (){
    return year;
  }
  public void displayDate(){
    System.out.println(month+"/"+day+"/"+year);
  }
}