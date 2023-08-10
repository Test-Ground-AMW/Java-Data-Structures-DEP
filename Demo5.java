public class Demo5 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        int[] num1 = new int[3];
        num1[0] = x;
        num1[1] = y;

        int[] num2 = new int[5];
        num2[num1.length] = x;
        num2[num2.length - 1] = y;

        int[] num3 = num1;
        num1 = num2;
        num2 = num3;
        num3 = null;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num1[num1.length - 1]);
        System.out.println(num1[num1.length - 2]);
        System.out.println(num2[num2.length - 1]);
        System.out.println(num2[num2.length - 2]);
    }
}