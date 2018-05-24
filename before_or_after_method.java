//Write a boolean method, called isOnOrAfter, which takes a date parameter and returns true if the date is on or after the parameter, and false if it is not. Note that you will also need the String constructor from the previous exercise.


public class Date
{
    private int day;
    private int month;
    private int year;
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    public Date(String date) 
    {
        String array1[]= date.split(" ");
        this.day = Integer.parseInt(array1[0]);
        this.month = Integer.parseInt(array1[1]);
        this.year = Integer.parseInt(array1[2]);
    } 
    public boolean isOnOrAfter(Date date2)
    {
      if(this.year > date2.year) {
          return true;}
      else if(this.year < date2.year){
          return false;}
      if(this.month > date2.month) {
          return true;}
      else if(this.month < date2.month){
          return false;}
       if(this.day > date2.day) {
          return true;}
      else if(this.day < date2.day){
          return false;}
        return true;
    }
}
