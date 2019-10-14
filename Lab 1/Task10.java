public class Task10{
  public String season(int month, int day){
    if(month>=3 && month<=6){
      if(month==3){
        if(day>=16)
          return "Spring";
      }
      if(month==6){
        if(day<=15)
          return "Spring";
      }
      else
        return "Spring";
    }
    if(month>=6 && month<=9){
      if(month==6){
        if(day>=16)
          return "Summer";
      }
      if(month==9){
        if(day<=15)
          return "Summer";
      }
      else
        return "Summer";
    }
    if(month>=9 && month<=12){
      if(month==9){
        if(day>=16)
          return "Fall";
      }
      if(month==12){
        if(day<=15)
          return "Fall";
      }
      else
        return "Fall";
    }
    if(month==12 || month>=1 && month<=3){
      if(month==12){
        if(day>=16)
          return "Winter";
      }
      if(month==3){
        if(day<=15)
          return "Winter";
      }
      else
        return "Winter";
    }
    return null;
  }
}