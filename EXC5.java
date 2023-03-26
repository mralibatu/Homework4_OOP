public class Main {
    public static void main(String[] args) {

        System.out.println(count("Welcome",'e'));
        System.out.println(count("Batuhan",'a'));
        System.out.println(count("Elma armut ankara",'a'));
        System.out.println(count("Homework",'d'));
        
    }

    public static int count(String str, char a){
        int result = 0;
        char[] strArr = str.toCharArray();

        for (char c : strArr) {
            if (c == a) {
                result++;
            }
        }

        return result;
    }
}
