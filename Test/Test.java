
package Test;
//java.lang.Math.E;
public class Test {
    public static void main(String[] args) {

        Controller item;
        int value;
        double weight = 0;
        String scale = null;

        item = new Controller();

        System.out.println("enter the value:");
        System.out.println("enter w to change weight :");
        System.out.print("enter the new weight:");
        System.out.print("enter value:");
        item.setCalculateWeightedAverage(weight, null);


        System.out.println(item.toString());
        System.out.println("goodbye");
    }
}