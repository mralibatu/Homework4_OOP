public class Main {
    public static void main(String[] args) {

        int temp = 3;
        for (int i = 3; i <= 1200; i++) {
            if(isPrime(i)){
                if(i - temp == 2){
                    System.out.println("(" + temp + ", " + i + ")");
                }
                temp = i;
            }
        }
    }

    public static boolean isPrime(int number){
        if(number == 0 || number == 1){
            return false;
        }else{
            for (int i = 2; i < number ; i++) {
                if(number % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
