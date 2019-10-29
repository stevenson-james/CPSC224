//********************************************************************
//Commission.java
//
//Represents an hourly employee that gets paid commission
//********************************************************************

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber,
                      double rate, double comRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        commissionRate = comRate;
        totalSales = 0;
    }

    public void addSales (double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay () {
        double payment = super.pay() + commissionRate * totalSales;

        totalSales = 0;

        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();

        result += "\nTotal sales: " + totalSales;

        return result;
    }
}
