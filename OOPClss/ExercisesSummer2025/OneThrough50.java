//exercise 1
import java.util.*;


public class OneThrough50{
    byte dog;
    short alpha;
    int a;
    long b;
    float c;
    double d;
    char f;
    boolean g;
    public void printDefault(){
        System.out.println("byte default: "+dog);
        System.out.println("short default: "+alpha);
        System.out.println("int default: "+a);
        System.out.println("long default: "+b);
        System.out.println("float default: "+c);
        System.out.println("double default: "+d);
        System.out.println("char default: "+f);
        System.out.println("boolean default: "+g);
    }
    public static void intToDouble(){
        int x;
        System.out.println("What is your desired number i will convert it to a double");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        double y=(double)x;
        System.out.println("The value of x is now: "+y);
    }
    static String name="Omar Belkady";
    public static void swap(int a, int b){
        System.out.println("A is "+a+ " B is: "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("Now A is "+a+ " B is: "+b);
    }
    public static void swap2vars(int x,int y){
        System.out.println("X is "+x+" y is: "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("X is now: "+x+" and y is now: "+y);
    }
    public static int sum(int a, int b){
        return a+b;
    }

    public static double area(int radius){
        return (Math.PI)*(Math.pow(radius,2));
    }

    public static double celsiToFahrenheight(double cels){
        double toReturn = (1.8*cels)+32;
        return toReturn;
    }

    public static double secToHoursMinutesSecond(double seconds, int option){
        if(option == 1){
            System.out.println("You are trying to convert seconds to hours");
            return(seconds/(60*60));
        }
        else if(option == 2){
            System.out.println("You are trying to convert seconds to minutes");
            return(seconds/(60));
        }
        else{
            System.out.println("You are trying to convert seconds to seconds");
            return seconds;
        }

    }

    public static boolean areEqual(int num1, int num2){
        if(num1==num2){
            return true;
        }
        else{
            return false;
        }
    }

    public static int largestAmongThree(int a, int b, int c){
        int largest = a;
        if(a>b && a>c){
            largest=a;
        }
        if(b>a && b>c){
            largest=b;
        }
        else{
            largest=c;
        }
        return largest;
    }

    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }

    public static int evenOdd(int num){
        if((num%2)==0)
        {
            return 1; //even
        }
        else{
            return 2; //odd
        }
    }

    public static boolean leapYear(int year){
        if((year % 400)==0){
            return true;
        }
        else if((year % 100)==0){
            return false;
        }
        else if((year % 4)==0){
            return true;
        }
        return false;
    }

    public static void posnegzero(int num){
        if(num<0){
            System.out.println("negative");
        }
        else if(num>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Zero");
        }
    }

    public static int absofNum(int num){
        if(num<0){
            return (-1)*num;
        }
        else{
            return num;
        }
    }
    public static int minoftwonums(int a, int b){
        int toReturn = (a<b) ? a : b;
        return toReturn;
    }
    public static int divisibleOrNot(int a, int x){
        if((a%x)==0){
            return 1;
        }
        return 0;
    }

    public static void printOfrange(int start, int stop){
        for(int i=start;i<=stop;i++){
            System.out.println(i);
        }
    }
    public static void numberRange(int num){
        int count=0;
        while(num<100 && count<100){
            System.out.println(num);
            num+=1;
            count++;
        }

    }

    public static void multiplicationtab(int num){
        for(int i=1;i<=num;i++){
            if((num%i)==0) {
                System.out.println("the divisors of " +num+" are "+ i);
            }
        }
    }

    public static int fibonnacci(int x){
        if(x==0){
            return 0;
        }
        else if(x==1){
            return 1;
        }
        else if(x==2){
            return 1;
        }
        else{
            return (fibonnacci(x-2)+fibonnacci(x-1));
        }
    }

    public static int reverseNum(int j){
        int sign = j<0 ? -1:1;
        if(j<10){
            return j;
        }
        int reversed=0;
        while(j != 0){
            int digit=j%10;
            reversed = reversed *10 + digit;
            j /= 10;
        }
        return sign*reversed;
    }

    public static void myArr(){
        int [] myArr = {54,65,55,2,1,5};
        for (int value:myArr){
            System.out.println(value);
        }

    }
    public static void main(String [] args){
        OneThrough50 obj = new OneThrough50();
        obj.printDefault();
        System.out.println("My name: "+name);
        intToDouble();
        int d=5;
        int f=6;
        swap(d,f);
        swap2vars(d,f);
        System.out.println(sum(6,2));
        System.out.println(area(6));
        System.out.println(celsiToFahrenheight(32.5));
        System.out.println();
        System.out.println(secToHoursMinutesSecond(52,2));
        System.out.println(areEqual(4,6));
        System.out.println(largestAmongThree(4,5,6));
        System.out.println(factorial(6));
        System.out.println(evenOdd(7));
        System.out.println(leapYear(2000));
        posnegzero(0);
        System.out.println(absofNum(22));
        System.out.println(minoftwonums(33,25));
        System.out.println(divisibleOrNot(4,2));
        printOfrange(1,10);
        numberRange(1);
        multiplicationtab(49);
        System.out.println(fibonnacci(4));;
        myArr();
        System.out.println(reverseNum(12345));
    }

}

