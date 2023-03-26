public class Main {
    public static void main(String[] args) {

        int count = 120;
        int[] arr = new int[120];

        for (int i = 10; true; i++) {
            if(count == 0){             //If count equal to zero, we took 120 value.
                break;
            }
            if(isPrime(i)){
                if(isPrime(ReverseNumber(i)) && (i != ReverseNumber(i))){   //If reverse number is also prime number and not equal to itself
                    arr[arr.length - count] = i;
                    count--;
                }
            }
        }

        int count2 = 0;
        for (int a:arr) {
            if(count2 % 10 == 0){
                System.out.println();
            }
            System.out.print(a + " ");
            count2++;
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

    public static int ReverseNumber(int number){
        int result = 0;
        int temp;
        while (number > 0){
            temp = number % 10;
            result = (result * 10) + temp;
            number /= 10;
        }

        return result;
    }
}
