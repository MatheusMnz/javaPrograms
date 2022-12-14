package services;

public class UsaInterestService implements  InterestService{
    private double interestRate;


    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public double payment(double amount, int months) {
        return InterestService.super.payment(amount, months);
    }
}
