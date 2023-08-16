// NUmber system convertor

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimalNumber = sc.nextInt();

        String binaryNumber = Integer.toBinaryString(decimalNumber);
        String octalNumber = Integer.toOctalString(decimalNumber);
        String hexNumber = Integer.toHexString(decimalNumber);

        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binaryNumber);
        System.out.println("Octal: " + octalNumber);
        System.out.println("Hexadecimal: " + hexNumber);

        int decimalFromBinary = Integer.parseInt(binaryNumber, 2);
        int decimalFromOctal = Integer.parseInt(octalNumber, 8);
        int decimalFromHex = Integer.parseInt(hexNumber, 16);

        System.out.println("Decimal from Binary: " + decimalFromBinary);
        System.out.println("Decimal from Octal: " + decimalFromOctal);
        System.out.println("Decimal from Hexadecimal: " + decimalFromHex);
    }

}
