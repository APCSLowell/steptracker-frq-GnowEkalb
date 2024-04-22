import java.util.ArrayList;
public class StepTracker
{
  private int minSteps, totalSteps;
  private int activeDays, totalDays;
  
  public StepTracker(int min){
    minSteps = min;
    totalSteps = 0;
    activeDays = 0;
    totalDays = 0;
  }
  
  public void addDailySteps(int steps){
    totalSteps+=steps;
    totalDays++;
    if (steps >= minSteps)
      activeDays++;
  }
  
  public int activeDays(){
    return activeDays;
  }
  
  public double averageSteps(){
    if (totalDays == 0)
      return 0;
    else return (double)totalSteps/totalDays;
  }
} 
