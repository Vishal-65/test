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
    public boolean inSameMonth(Holiday Object1){
        return this.month.equals(Object1.month);
    }
    public static double avgDate(Holiday[] Object1){
        int res=0;
        for(int i=0;i<Object1.length;i++){
            res+=Object1[i].day;
        }
        return ((double)res)/Object1.length;
    }


}
public class HolidayMain {
    public static void main(String[] args) {
        Holiday[] Object1 =new Holiday[2];
        Object1[0]=new Holiday("Independance Day",4,"July");
        Object1[1]=new Holiday("Republic Day",4,"January");

    }
}
