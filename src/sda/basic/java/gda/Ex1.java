package sda.basic.java.gda;

public class Ex1 {

    public static void main(String[] args) {

        displayWordInHexFormat();


    }

    private static void displayWordInHexFormat() {
        char s = 0b01010011;
        char d = 0b01000100;
        char a = 0b01000001;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);


    }
}
