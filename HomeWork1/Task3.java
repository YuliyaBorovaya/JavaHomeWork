// Реализовать простой калькулятор

import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.print("Введите математичексое действие: ");
        sc.nextLine();
        String action = sc.nextLine();
        sc.close();
        if (action.equals("+")) {
            System.out.println(num1 + num2);
        }
        else if (action.equals("-")) {
            System.out.println(num1 - num2);
        }
        else if (action.equals("*")) {
            System.out.println(num1 * num2);
        }
        else if (action.equals("/") && num2 != 0) {
            System.out.println(num1 / num2);
        }
        else{
            System.out.print("Это какой-то неправильный знак, введите верный");
        }
    }
}


// // import java.util.Scanner;

// // Реализовать простой калькулятор
// public class App3 {
//     public static void main(String[] args) {
//         System.out.print("Введите первое число: ");
//         Scanner sc=new Scanner(System.in);
//         int numb_1=sc.nextInt();   
//         System.out.print("Введите второе число: ");
//         int numb_2=sc.nextInt();
//         System.out.print("Введите математическое действие: ");
//         sc.nextLine();
//         String action=sc.nextLine();                     
//         sc.close();
//         if (action.equals("+")) {
//             System.out.print(numb_1+numb_2);
//         }
//         else if(action.equals("-")){
//             System.out.print(numb_1-numb_2);
//         }
//         else if(action.equals("*")){
//             System.out.print(numb_1*numb_2);
//         }
//         else if(action.equals("/") && numb_2 != 0){
//             System.out.print(numb_1/numb_2);
//         }else{
//             System.out.print("Не знаю, что от меня хотите");
//         }
//     }
// }