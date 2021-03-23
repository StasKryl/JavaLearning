package lesson1;

public class L1ex3 {
    public static void main(String[] args){
        int s = 1000000000;
        int sec = s%60;
        int  min = (s-sec)/60;
        System.out.println(min + " минут " + sec + " секунд ");
        int m = min%60;
        int h = (min-m)/60;
        System.out.println(h + " час " + m + " минут " + sec + " секунд ");
        int d1 = h%24;
        int d = (h-d1)/24;
        System.out.println(d+" дней "+d1+" час "+m+" минут "+sec+" секунд ");
        int w1 = d%7;
        int w = (d-w1)/7;
        System.out.println(w+" недель "+w1+" дней "+d1+" час "+m+" минут "+sec+" секунд ");
        int m1 = w%4;
        int month = (w-m1)/4;
        System.out.println(month+ " месяцев "+w+" недель "+w1+" дней "+d1+" час "+m+" минут "+sec+" секунд ");
        int year1 = month%12;
        int year = (month-year1)/12;
        System.out.println(year+" лет "+month+ " месяцев "+w+" недель "+w1+" дней "+d1+" час "+m+" минут "+sec+" секунд ");
    }
}
