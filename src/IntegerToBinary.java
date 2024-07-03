public class IntegerToBinary {
    public static void main(String[] args) {

        // a. 9
        int num1 = 9;

        System.out.println("String of " + num1 + " is "+  Integer.toBinaryString(num1));

        int x = num1 << 1;

        System.out.println("Decimal" + num1 + " and Binary" + Integer.toBinaryString(num1));

        // b. 17
        int num2 = 17;

        System.out.println("String of " + num2 + " is "+  Integer.toBinaryString(num2));

        int y = num2 << 1;

        System.out.println("Decimal" + num2 + " and Binary" + Integer.toBinaryString(num2));

        // c. 88
        int num3 = 88;

        System.out.println("String of " + num3 + " is "+  Integer.toBinaryString(num3));

        int z = num3 << 1;

        System.out.println("Decimal" + num3 + " and Binary" + Integer.toBinaryString(num3));

    }
}