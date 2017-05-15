
public class Employee extends Employed{
  
  public Employee(){
  super(first,last,id,pay);
  }
  
  public double getWeeklyWage(){
  return super.getWeeklyWage(hoursWorked);
  }
  
  
}
