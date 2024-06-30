package Task121;
//package Task121;
import Task121.DateTask;

public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1,1,1978);
        DateTask date2 = new DateTask(9,21,1984);
        DateTask date3 = new DateTask(13,13,13);
        //DateTask date4 = new DateTask(1,1,1974);
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        DateTask.leapYears();
        System.out.println(date3.toString());
        
    }
}