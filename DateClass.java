public class DateClass {
    
private int day;
private int month;
private int year;

public void Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
}
public int getDay() {
    return day;
}
public int getMonth() {
    return month;
}
public int getYear() {
    return year;
}
public void setDay(int day){
    this.day = day;
}
public void setMonth(int month){
    this.month = month;
}
public void setYear(int year){
    this.year = year;
}
public void setDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
}
public String toString(){
    return day + "/" + month + "/" + year;
}

public static void main(String[] args) {
    DateClass d1 = new DateClass();
    d1.Date(5, 6, 2024);
    System.out.println(d1);
    d1.setDate(20, 10, 2026);
    System.out.println(d1);
    DateClass d2 = new DateClass();
    d2.setDay(15);
    d2.setMonth(8);
    d2.setYear(2025);
    System.out.println("Date: " + d2);
}
}
