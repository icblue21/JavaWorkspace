package me.oop.ExtendsPractice;

public class VIPCustomer extends Customer {
    double saleRatio;
    String agentID;

    public VIPCustomer(){

        bonusRatio = 0.05;
        saleRatio = 0.1;
        customerGrade = "VIP";
    }

    public double getSaleRatio() {
        return saleRatio;
    }

    public void setSaleRatio(double saleRatio) {
        this.saleRatio = saleRatio;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
