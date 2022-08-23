import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year)  {
     
Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.YEAR,year);
String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase(); //Long refers to long names of the day eg-Sunday instead of SUN, Locale - Country Code
        return dayOfWeek;

}}
    
public class Sample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        System.out.println("Enter a month");
        int month = Integer.parseInt(firstMultipleInput[0]);
        System.out.println("Enter a day");

        int day = Integer.parseInt(firstMultipleInput[1]);
        System.out.println("Enter a year");

        int year = Integer.parseInt(firstMultipleInput[2]);
        System.out.println("The day is");

        String res = Result.findDay(month, day, year);

        System.out.println(res);
    }
}
