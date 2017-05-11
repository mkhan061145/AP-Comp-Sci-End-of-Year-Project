
public class Employee extends Employed{
  
  public Employee(){
  super(first,last,id,pay);
  }
  
  public double getWeeklyWage(int hoursWorked){
  return pay*hoursWorked;
  }
  
  
}
