public class Main {
    public static void main(String[] args) {
        long number = 4388576018410707L;        //valid
        //long number = 4388576018402626L;      invalid
        System.out.println(number + " is " + (isValid(number) ? "valid" : "invalid"));

    }

    public static boolean isValid(long number){
        return (getSize(number) >= 13 && getSize(number) <= 16) && (prefixMatched(number,4)
        || prefixMatched(number,5) || prefixMatched(number,6) || prefixMatched(number,37))
                && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }

    public static int sumOfDoubleEvenPlace(long number){
        String numberStr = number + "";
        int sum = 0;
        for (int i = numberStr.length() - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(numberStr.charAt(i) + "") * 2);
        }

        return sum;
    }

    public static int getDigit(int number){

        return number >= 9 ? (number / 10 + number % 10) : number;
    }

    public static int sumOfOddPlace(long number) {
        String numberStr = number + "";
        int sum = 0;
        for (int i = numberStr.length() - 1; i >= 0 ; i -= 2) {
            sum += Integer.parseInt(numberStr.charAt(i) + "");
        }

        return sum;
    }

    public static boolean prefixMatched(long number, int d){
        return getPrefix(number,getSize(d)) == d;
    }

    public static int getSize(long d){
        return (d + "").length();
    }

    public static long getPrefix(long number, int k){
        if(getSize(number) > k){
            return Long.parseLong((number + "").substring(0,k));
        }
        return number;
    }

}
