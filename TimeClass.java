//bai 1.8
public class TimeClass {
    private int hour;   // [0, 23]
    private int minute; // [0, 59]
    private int second; // [0, 59]

    public int Time(int hour, int minute, int second) {
        return Time(hour, minute, second);
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    
    
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString(){
        return hour + ":" + minute + ":" + second;
    }
    
    public TimeClass nextSecond(){
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;

    }
    public TimeClass  previousSecond(){
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public static void main(String[] args) {
        TimeClass t1 = new TimeClass();
        t1.setTime(10, 20, 25);
        System.out.println(t1);
        t1.nextSecond();
        System.out.println("Next second: " + t1);
        t1.previousSecond();
        System.out.println("Previous second: " + t1);
        
    }

}
