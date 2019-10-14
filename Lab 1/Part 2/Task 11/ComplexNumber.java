public class ComplexNumber extends RealNumber{
  private double imaginaryValue=1.0;
  public ComplexNumber(double n, double m){
    imaginaryValue = m;
    setRealValue(n);
  }
  public ComplexNumber(){
    super();
  }
  public double getImaginaryValue(){
    return imaginaryValue;
  }
  public String toString() {
    System.out.println(super.toString());
    return "ImaginaryPart: "+getImaginaryValue();
  }
  public void check(){
    System.out.println("I'm in ComplexNumber class");
    ping();
    System.out.println("Checking ended.");
  }
}
