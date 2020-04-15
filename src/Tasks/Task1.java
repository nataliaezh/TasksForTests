package Tasks;

public class Task1 {

    public void numbers(int number) {
         if(number<1 || number > 100){
             System.out.println("Введите целое число от 1 до 100");
        }
         else if (number % 2 != 0 && number % 7 != 0) {
             System.out.println("Данное число не кратно ни 2, ни 7");
         }
         else if (number % 2 == 0 && number % 7 == 0) {
             System.out.println("TwoSeven");
         }
        else if (number % 2 ==0){
            System.out.println("Two");
        }
        else if (number % 7 ==0){
            System.out.println("Seven");
        }


    }
}
