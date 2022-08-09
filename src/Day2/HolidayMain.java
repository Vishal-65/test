/*The Java class called Holiday is started below. An object of class Holiday represents a holiday during the year. This class has three instance
 variables:
  name, which is a String representing the name of the holiday
  day, which is an int representing the day of the month of the holiday
  month, which is a String representing the month the holiday is in
  Write a constructor for the class Holiday, which takes a String representing the name, an int representing the day, and a String representing
  the month as its arguments, and sets the class variables to these values.

  Write a method inSameMonth, which compares two instances of the class Holiday, and returns the Boolean value true if they have the same month,
   and false if they do not.

  Write a method avgDate which takes an array of base type Holiday as its argument, and returns a double that is the average of the day variables
   in the Holiday instances in the array. You may assume that the array is full (i.e. does not have any null entries).

  Write a piece of code that creates a Holiday instance with the name “Independence Day”, with the day “4”, and with the month “July”. */


package Day2;
class Holiday{
    private String name;
    private int day;
    private String month;
    Holiday(String name,int day,String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public static boolean inSameMonth(Holiday holiday1,Holiday holiday2){
        return holiday1.month.equals(holiday2.month);
    }
    public static double avgDate(Holiday[] holiday_array){
        int res=0;
        for(int i=0;i<holiday_array.length;i++){
            res+=holiday_array[i].day;
        }
        return ((double)res)/holiday_array.length;
    }


}
public class HolidayMain {
    public static void main(String[] args) {

      Holiday holiday1=new Holiday("Independance Day",4,"July");
      Holiday holiday2=new Holiday("Republic Day",4,"July");
      System.out.println(Holiday.inSameMonth(holiday1,holiday2));
      Holiday [] holiday_array=new Holiday[2];
      holiday_array[0]=holiday1;
      holiday_array[1]=holiday2;
      System.out.println(Holiday.avgDate(holiday_array));


    }
}
