package SecondPackage;
import java.time.LocalDate;

public class Date {
    private int year;
    private int month;
    private int day;
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Date() {
        this.year = LocalDate.now().getYear();
        this.month = LocalDate.now().getMonthValue();
        this.day = LocalDate.now().getDayOfMonth();
    }
    public Date(String date) {
        int k = 0;
        int minus1 = 0;
        for(; date.charAt(k) != '-'; k++) {
            minus1++;
        }
        k++;
        int minus2 = k;
        for(; date.charAt(k) != '-';k++) {
            minus2++;
        }
        for(int i = 0; i < minus1; i++) {
            int num = date.charAt(i) - 48;
            this.year += num  * Math.pow(10, minus1 - 1 - i);
        }
        k = 0;
        for(int i = minus1 + 1; i < minus2; i++) {
            int num = date.charAt(i) - 48;
            this.month += num * Math.pow(10,minus2 - minus1 - 2 - k);
            k++;
        }
        k = 0;
        int daysSIZE = date.length() - minus2 ;
        for(int i = minus2 + 1; i < date.length(); i++) {
            int num = date.charAt(i) - 48;
            this.day += num * Math.pow(10,daysSIZE - 2 - k);
            k++;
        }
    }
    private int days(){
        int[] N;
        if(this.year % 4 == 0) N = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};
        else N = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        int general_days = (int)(this.year * 365.25)  + this.day;
        for (int i = 0; i < this.month - 1; i++) {
            general_days += N[i];
        }
        return general_days;
    }

    private void reverse_days(int general_days) {
        this.year = (int)(general_days / 365.25);
        general_days -= (int)(this.year * 365.25);
        int[] N;
        if(year % 4 == 0)  N = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};
        else N = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        int n = 1;
        for (int i = 0; ; i++) {
            if(general_days >= N[i]) {
                general_days -= N[i];
                n++;
            }
            else break;
        }
        this.month = n;
        this.day = general_days;
    }

    public void add(int days) {
        int general_days = this.days() + days;
        this.reverse_days(general_days);
    }
    public void delete(int days) {
        int general_days = this.days() - days;
        this.reverse_days(general_days);
    }
    public boolean compare(Date other) {
        return (this.year == other.year && this.month == other.month && this.day == other.day);
    }

    public int range(Date other) {
        int days = this.days() - other.days();;
        if(days < 0) days *=(-1);
        return days;
    }

    @Override
    public String toString() {
        return  "0" + "\b" + this.year + '-' +
                this.month + '-' +
                this.day;
    }
}
