package sda.basic.java.gda;

public class Ex8 {

    public static void main(String[] args) {
       /* boolean result = isPrimeNumber(8);
        System.out.println("If digital is prime:" + result);*/
        printPrimeNumbersFromRange(2, 10);
    }

    private static void printPrimeNumbersFromRange (int min, int max){
        for(int i = min; i < max; i++){
            if(isPrimeNumber(i)){
                System.out.println(i);
            }


        }
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;

            }
        }
            return true;
    }
}
