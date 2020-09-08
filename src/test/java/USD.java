import java.io.Serializable;

////Return the value of the value of the set dollar rate
public class USD extends COIN implements Serializable {
    final double value = 3.52;
    double getValue() {
        return value;
    }
    //Calculate the amount with the dollar rate and the amount let the customer asked to convert the money
    public double calculate(double money) {
        return money *getValue();
    }


}
