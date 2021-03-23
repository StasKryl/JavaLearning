package lesson1;

public class L1ex4 {
    public static void main (String[] args){
        int q = 5874;
        int a = (q%10);
        int b = ((q%100)-a)/10;
        int c =(((q%1000)-a)-b)/100;
        int d =((((q%10000)-a)-b)-c)/1000;

       System.out.println(a+b+c+d);
    }
}
