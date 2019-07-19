
/**
 * Write a description of class findHigh here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.util.*; 


public class findHigh
{
    public static void main(String args[]){
        ArrayList<Integer> temps = new ArrayList<>(Arrays.asList(34, 32, 40, 50, 55, 70, 73, 75, 70, 65, 55, 40));
        ArrayList<String> months = new ArrayList<>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"));
        String highMonth= "";
        int highTemp = 0;
        
        for (int i = 0; i < temps.size();i++){ 
            while (i<11){
            if (highTemp<temps.get(i)){
                highTemp = temps.get(i);
                highMonth= months.get(i);
            }
            i = i+1;
   
    }
}
System.out.println("the highest month and temperature is:"+ highMonth + "-" + highTemp);
}
}
 

    