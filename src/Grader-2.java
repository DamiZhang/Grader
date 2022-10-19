/*
Assignment 3
[Name:Zihao Zhang]
[Student ID: 002656320]
[Section:8]
[https://github.com/DamiZhang/Grader]
 */
import java.util.Scanner;

public class Grader {
    //Set the variables in private attributes
    private double[]Points;
    private double[] Percentage;
    private double[]TotalPoints;

    private double[]TotalWeighted;
    private double Total;

    //Setter method to assign private variables a new name or change their values ("this" is the object)
    public void setPoints(double[] points) {this.Points = points;}
    public void setPercentage(double[] percentage){this.Percentage = percentage;}
    public void setTotalPoints(double[] totalPoints){this.TotalPoints= totalPoints;}

    public void setTotalWeighted(double[] totalWeighted){this.TotalWeighted= totalWeighted;}
    public void setTotal(double total){this.Total=total;}

    //Getter method to return the value of variables
    public double[] getPoints( ){return Points;}
    public double[] getPercentage( ){return Percentage;}
    public double[] getTotalPoints( ){return TotalPoints;}
    public double[] getTotalWeighted(){return TotalWeighted;}
    //Use this method to calculate the value
    public double getTotal() {
        for (int i = 0; i < 8; i++) {
            TotalWeighted[i] = (Points[i]/ TotalPoints[i]) *100* Percentage[i] * 0.01;
            //public void setTotalWeighted(){
            //        this.TotalWeighted = (EarnedPoints/PointTotal)*100*(Percentage * 0.01);
            //    }
        }
        for (int j = 0; j < 8; j++) {
            Total += TotalWeighted[j];
        }
        return Total;
    }
    //Write a judgemental method to return the right grade
    public String compute(){
        if (Total >= 90) {
            return "A";
        } else if (Total >= 80 & Total < 90) {
            return "B";
        } else if (Total >= 70 & Total < 80) {
            return "C";
        } else if (Total >= 60 & Total < 70) {
            return "D";
        } else {return "F";}
    }

    public static void main (String args[])
    {   //create an object has the attributes of Grader
        Grader s = new Grader();


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter each EarnedPoint:");
                //Numeric input
        //create several variables and recall the method to run them
        double[] Points = new double[8];
        double[] Percentage =new double[8];
        double[] TotalPoints = new double[8];
        double[] TotalWeighted = new double[8];
        double Total = 0;
        //use the loop to inout the numbers
        for(int i=0;i<8; i++)
        {
            Points[i]=myObj.nextInt();
        }
        System.out.println("Enter each percentage:");
        for(int i=0;i<8;i++)
        {
            Percentage[i] = myObj.nextInt();
        }
        System.out.println("Enter each Total Point:");
        for(int i=0;i<8;i++)
        {
            TotalPoints[i] = myObj.nextInt();
        }
    s.setPoints(Points);
    s.setPercentage(Percentage);
    s.setTotalPoints(TotalPoints);
    s.setTotalWeighted(TotalWeighted);
    s.setTotal(Total);
        System.out.println(s.getTotal());

        System.out.println("The Total Weighted grade is "+s.compute());

    }


}

