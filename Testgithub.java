 public class Testgithub {
    private int day;
    private int month;
    private int year;    

    public Testgithub(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
public int getDay(){
     return day;
}

public int getMonth(){
    return month;
}
    
 public int getYear(){
     return year;
 }   

    public int setDay(){
        this.day = day;
        return day;
    }

    public int setMonth(){
        this.month = month;
        return month;
    }
    public int setYear(){
        this.year = year;
        return year;
    }
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return day + "/" + month + "/" + year;
    }
    public static void main(String[] args){
        Date d1 = new Date(15, 8, 2025);
        System.out.println("Date: " + d1);
        Date d2 = new Date(22, 02, 2007);
        System.out.println("Date: " + d2);//Test String

        //Test setter and getter
        d1.setDay(22);
        d1.setMonth(02);
        d1.setYear(2007);
        System.out.println(d1);
        System.out.println("Day: " + d1.getDay());
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Year: " + d1.getYear());
        
         //Test setdate

        d1.setDate(01, 02, 2025);
        System.out.println(d1);
        
    }

    
}
