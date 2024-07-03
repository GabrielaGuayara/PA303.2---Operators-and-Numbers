public class ShiftRight {

    public static void main(String [] args){

        // a. 225
        int x = 150;
        System.out.println("The string version of "+ x + " is  "+Integer.toBinaryString(x));

        x = x << 2;

        System.out.println("The string version of "+ x + " is  "+Integer.toBinaryString(x));

        // b. 1555
        int y = 225;
        System.out.println("The string version of "+ y + " is  "+Integer.toBinaryString(y));

        y = y << 2;

        System.out.println("The string version of "+ y + " is  "+Integer.toBinaryString(y));


        // c. 32456
        int z = 32456;
        System.out.println("The string version of "+ z + " is  "+Integer.toBinaryString(z));

        z = z << 2;

        System.out.println("The string version of "+ z + " is  "+Integer.toBinaryString(z));
    }


}
