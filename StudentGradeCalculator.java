
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
class StudentGradeCalculator extends JFrame implements ActionListener {
    // Set the state JFrame,JTextField,JLabel,and JButton
    static JFrame frame;
    static JLabel total_Points_l;
    static JLabel earned_Points_l;
    static JLabel percentage_l;
    static JLabel weightedGrade_l;
    static JTextField total_Points_t;
    static JTextField earned_Points_t;
    static JTextField percentage_t;
    static JTextField Weighted_t;
    static JButton btn;




    public void GUIStudentGradeCalculator()
    {
        // create a new frame,label to store text field and button
        frame = new JFrame("SG-Calculator");
        Color color=new Color(255,0,0);
        total_Points_l = new JLabel("Total Points ：");
        earned_Points_l = new JLabel("Earned Points：");
        percentage_l = new JLabel("Percentage(No %)：");
        weightedGrade_l = new JLabel("Weighted Grade：");
        total_Points_t = new JTextField( 10);
        total_Points_t.setBackground(Color.GREEN);
        total_Points_t.setForeground(color);
        earned_Points_t = new JTextField(10);
        earned_Points_t.setBackground(Color.GREEN);
        earned_Points_t.setForeground(color);
        percentage_t = new JTextField(10);
        percentage_t.setBackground(Color.GREEN);
        percentage_t.setForeground(color);
        Weighted_t = new JTextField(10);
        btn = new JButton("Click to calculate");
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.GRAY);

        // create a object of the text class and an ActionListener to control the button
        StudentGradeCalculator studentgradecalculator = new StudentGradeCalculator();
        btn.addActionListener(studentgradecalculator);

        // set a panel and add buttons and TextField to it
        JPanel panel = new JPanel();
        panel.add(total_Points_l);
        panel.add(total_Points_t);
        panel.add(earned_Points_l);
        panel.add(earned_Points_t);
        panel.add(percentage_l);
        panel.add(percentage_t);
        panel.add(btn);
        panel.add(weightedGrade_l);
        panel.add(Weighted_t);
        frame.add(panel);
        frame.setSize(250, 250);
        frame.show();
    }
    // initialize the parameters
    StudentGradeCalculator()
    {
    }

    // set the ActionListener to control the button
    public void actionPerformed(ActionEvent e)
    {

            // receive the input
            double TotalPoints = Double.parseDouble(total_Points_t.getText());
            double EarnedPoints = Double.parseDouble(earned_Points_t.getText());
            double Percentage = Double.parseDouble(percentage_t.getText());

            // create a new Student object
            Student Te = new Student();
            Te.setTotalPoints(TotalPoints);
            Te.setEarnedPoints(EarnedPoints);
            Te.setPercentage(Percentage);
            double result =0;
            result =Te.TotalWeighted();
            String result_string = String.format("%.1f",result);
            // set the text of field to blank
            Weighted_t.setText(result_string);

    }
}