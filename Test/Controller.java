package Test;

public class Controller {
    //define variables
    private int  value;
    private double weight;
    private double sum;
    // constructor method 1

    public Controller(){
        this.value = value;
        this.weight = weight;
        this.sum = sum;
    }
    // constructor method 2

    public Controller(int inValue,String scale,double inSum,double inWeight){
        value = inValue;
        weight = inWeight;
        sum = inSum;

    }
    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getSum() {
        return sum;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
public void setCalculateWeightedAverage(double calculateWeightedAverage, String scale){
      if(calculateWeightedAverage>0) {

          if (scale.equals("c")) {
              calculateWeightedAverage = (value * weight) / (weight);
          }
          else
          {
              calculateWeightedAverage = (value * weight) / (weight);

          }
      }
}

    // (value * weight)/SUM(weight).
    public String toString()
    {
        return "item value: " + value + "\n"
                +"Weight  : "+ weight + "\n";

    }


}


