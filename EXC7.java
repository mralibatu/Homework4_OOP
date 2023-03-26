import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] words = {"monster","stringbuilder","current","settings","project",
                "calendar","translate","exercise","notification","queen","correct","solution","column"};
        int missed = 0;
        boolean flag = false;
        Scanner input = new Scanner(System.in);

        while (!flag){
            String word = getRandomWord(words);
            System.out.println(word);
            char[] theWord = word.toCharArray();
            char[] asteriskWord = new char[theWord.length];
            toAsterisk(asteriskWord);

            while(Arrays.toString(asteriskWord).contains("*")){
                System.out.print("(Guess) Enter a letter in word ");
                PrintCharArr(asteriskWord);
                System.out.print(" > ");
                String inputChar = input.next();
                if(isLetterInWord(theWord,inputChar)){
                    int index = getIndex(theWord,inputChar);
                    asteriskWord[index] = inputChar.charAt(0);
                    theWord[index] = '-';
                }else{
                    missed++;
                }
            }
            System.out.println("The word is " + word);
            System.out.println("You missed " + missed + " time");
            System.out.println("Do you want to guess another word?\nEnter Y or N");
            String answer = input.next();
            switch (answer.toUpperCase()){
                case "Y":
                    System.out.println("Restarting game...");
                    break;
                case "N":
                    System.out.println("Good bye!");
                    flag = true;
                    break;
                default:
                    flag = true;
            }

        }
    }

    public static void PrintCharArr(char[] arr){
        for (char a:arr
             ) {
            System.out.print(a);
        }
    }

    public static boolean isLetterInWord(char[] theWord, String letter){
        for (char c : theWord) {
            if (letter.equals(c + "")) {
                return true;
            }
        }

        return false;
    }

    public static void toAsterisk(char[] theWord){
        for (int i = 0; i < theWord.length; i++) {
            theWord[i] = '*';
        }
    }

    public static int getIndex(char[] word, String letter){
        for (int i = 0; i < word.length; i++) {
            if((word[i] + "").equals(letter)){
                return i;
            }
        }
        return -1;
    }

    public static String getRandomWord(String[] words){
        Random rnd = new Random();
        int random = rnd.nextInt(words.length);
        return words[random];
    }



}
