public class Exercises{
    public static void ex1(){
        int num=1;
        while(num<=10){
            System.out.println(num);
            num++;
        }

    }

    public static void ex2(){
        int num1=0;
        do{
            System.out.println(num1);
            num1++;
        }while(num1<=10);

    }
    public static int evenNumberSum(int limit){
        int sum=0;
        for(int num=0;num<=limit;num++){
            sum+=num;
        }
        return sum;
    }

    public static int averageOfArr(int arr[]){
        int sum=0;
        int count=0;
        for(int i : arr){
            sum+=i;
        }
        return sum/arr.length;
    }

    public static void minorOrNot(int age){
        if(age<18){
            System.out.println("Minor");
        }
        else if(age>=18 && age<=65){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior Citizen");
        }
    }
    public static void findNumber(int myArr[], int toSearch){
        for(int i=0;i<myArr.length;i++){

            if(myArr[i]==toSearch){
                System.out.println("The number: %d was Found at index: %d ",toSearch, i);
                return;
            }


        }
        System.out.println("The number was not found");
    }
    public static void dayOfTheWeek(int day){
        switch(day){
            default:
                System.out.println("Error");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

        }
    }

    public static void main(String [] args){
    //        ex1();
        ex2();
        System.out.println(evenNumberSum(20));
        int myArr[]={2,4,57,88,11};
        System.out.println(averageOfArr(myArr));
        minorOrNot(34);
        dayOfTheWeek(3);
    }




}