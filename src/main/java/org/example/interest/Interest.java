package org.example.interest;

public class Interest {
    private double PrincipalAmount,RateOfInterest,TimePeriod,Amount;

    public Interest(double PrincipalAmount, double RateOfInterest, double TimePeriod)
    {
        this.PrincipalAmount = PrincipalAmount;
        this.RateOfInterest = RateOfInterest;
        this.TimePeriod = TimePeriod;
    }

    public double Calculate_SI()
    {
        return (PrincipalAmount*RateOfInterest*TimePeriod)/100;
    }

    public double Calculate_CI()
    {
        this.Amount = PrincipalAmount*(Math.pow(1+(RateOfInterest/100),TimePeriod));
        return this.Amount-PrincipalAmount;
    }
}
