// Lab03v100.java
// Student 100-point version of the Lab03 assignment.


public class Lab03v100
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 80 Point Version\n");
      int millisec = 10000123;
      int hours = millisec/3600000 ;
      int calculate = millisec%3600000;
      int minutes = calculate/60000;
      int seconds = (calculate%60000)/1000;
      int extraMilli = (calculate%60000)%1000;
      
      System.out.println("Starting milliseconds: " + millisec);
      System.out.println("Hours: " + hours);
      System.out.println("Minutes: " + minutes);
      System.out.println("Seconds: " + seconds);
      System.out.println("Milliseconds: " + extraMilli);
      
	}
}

