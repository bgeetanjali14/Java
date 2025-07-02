import java.util.*;
class Functions{

    public static void printHelloWorld(){
        System.out.println("Hello World!!!!");
        return;
    }


    public static void calculateSum(){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The Sum is:" +sum);
    }
    public static void main(String[] args) {
        printHelloWorld();  //function call
        calculateSum();
        
    }
}