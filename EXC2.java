import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int roll1 = RollDice();
        int roll2 = RollDice();
        int sum = roll1 + roll2;
        int point;

        System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);
        if(sum == 2 || sum == 3 || sum == 12){
            System.out.println("You lose!");
        } else if (sum == 7 || sum == 11) {
            System.out.println("You win!");
        }else{
            point = sum;
            System.out.println("Point is " + point);
            do{
                roll1 = RollDice();
                roll2 = RollDice();
                sum = roll1 + roll2;
                if(sum == 7){
                    System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);
                    System.out.println("You lose!");
                    break;
                } else if (sum == point) {
                    System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);
                    System.out.println("You win!");
                    break;
                }
            }while (true);

        }

    }

    public static int RollDice(){
        Random rnd = new Random();
        return rnd.nextInt(6) + 1;
    }
}
