package com.company;

public class Students {
    private String id;
    private String name;
    private String grade;
    private int feePaid;
    private int feeTotal;

    public Students(String id, String name, String grade) {
        feeTotal=10000;
        feePaid=0;
        this.id = id;
        this.name = name;
        this.grade=grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getFeePaid() {
        return feePaid;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private void setFeePaid(int feePaid) {
        int total=this.feePaid+feePaid;
        if (total>feeTotal){
            System.out.println("transaction failed! fees paid cant be more than fees due. \n" +
                    "u need to pay exactly: " + (feeTotal-feePaid));
        }else {
            this.feePaid += feePaid;
            System.out.println("fees left: " + (feeTotal-this.feePaid));
        }
    }

    public void dues(){
        System.out.println(this.name + "paid " + feePaid +". amount due: " + (feeTotal-feePaid));
    }

    public void payFee(int amount){
        setFeePaid(amount);
    }
}
