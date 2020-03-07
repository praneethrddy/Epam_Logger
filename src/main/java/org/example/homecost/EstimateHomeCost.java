package org.example.homecost;

public class EstimateHomeCost {
    private int Typeofmaterial;
    private double HouseArea;
    private boolean isAutomated;
    private double estimatedCost;
    public EstimateHomeCost(int Typeofmaterial,double HouseArea,boolean isAutomated){
        this.Typeofmaterial = Typeofmaterial;
        this.HouseArea = HouseArea;
        this.isAutomated = isAutomated;
        switch(this.Typeofmaterial){
            case 0: this.estimatedCost = 900;
                    break;
            case 1: this.estimatedCost = 900;
                    break;
            case 2: this.estimatedCost = 1000;
                    break;
        }
        if(this.isAutomated){
            this.estimatedCost += 650;
        }
    }
    public double Estimate(){
        return this.estimatedCost * this.HouseArea;
    }
}
