public class Task12{
  public boolean months(int month1,int day1,int month2,int day2){
    boolean flag=true;
    if(month1<month2){
      flag=true;
    }
    else if(month1==month2){
      if(day1<day2){
        flag=true;
      }
    }
    else{
      flag=false;
    }
    return flag;
  }
}