/*
Assignment 2
[Name:Zihao Zhang]
[Student ID: 002656320]
[Section:8]

 */


import java.util.Scanner;

public class Student {


    //Set the variables in private attributes
    private double TotalPoints;
    private double EarnedPoints;
    private double Percentage;

    //Setter method to assign private variables a new name or change their values ("this" is the object)
    public void setTotalPoints(double totalPoints) {this.TotalPoints = totalPoints;}
    public void setEarnedPoints(double earnedPoints){this.EarnedPoints = earnedPoints;}
    public void setPercentage(double percentage){this.Percentage= percentage;}

    //Getter method to return the value of variables
    public double getTotalPoints( ){return TotalPoints;}
    public double getEarnedPoints( ){return EarnedPoints;}
    public double getPercentage( ){return Percentage;}

    //Use this method to calculate the value
    //public double TotalWeighted(){return (EarnedPoints/TotalPoints)*100*Percentage * 0.01;}
    public double TotalWeighted() {


            //This is the method to calculate the Total weighted Grade
            double totalWeighted;
            totalWeighted = EarnedPoints / TotalPoints * (Percentage / 100) * 100;
            return totalWeighted;



    }








}





