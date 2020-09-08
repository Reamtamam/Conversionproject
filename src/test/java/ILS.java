import java.io.Serializable;
//Return the value of the value of the set ILS rate
public class ILS extends COIN implements Serializable {
final double value = 0.28;
    double getValue() {
        return value;
    }
    //Calculate the amount with the ILS rate and the amount let the customer asked to convert the money
    public double calculate(double money) {
        return money *getValue();
    }


    }


