
public class Employed {
  private String first;
  private String last;
  private String id;
  private double pay;
    
  public Employed(String firstName, String lastName, String identification, double hourlyPay){
    first = firstName;
    last = lastName;
    id = identification;
    pay = hourlyPay;
  }
  public int getWeeklyWage(double hoursWorked){
    return pay * hoursWorked;
  }
  
  public String getFirstName(){
  return first;
  }
  
  public String getLastName(){
  return last;
  }
  
  public String getID(){
  return id;
  }
  
  public double getPay(){
  return pay;
  }
  
}
