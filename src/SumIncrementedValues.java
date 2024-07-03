public class SumIncrementedValues {

    public static void main(String[] args){
        int x, y;
        x = 5;
        y = 8;

        int sum = ++x + y;

        System.out.println(sum);

        //Change operator to postfix

        sum = x++ + y;

        System.out.println(sum);
    }

}
