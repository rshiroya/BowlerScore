 
/**
 * Write a description of class Bowler here.
 *
 * @author Shiroya R.
 * @version (a version number or a date)
 */
public class Bowler
{
    //fields
    private String fullName;
    private double age;
    private double score1;
    private double score2;
    private double score3;
    private double avg;
    //default constructor
    public Bowler()
    {
        fullName = "";
        score1 = 0;
        score2 = 0;
        score3 = 0;
        
    }
    //constructor
    public Bowler(String fName, double s1, double s2, double s3)
    {
         fName = "";
         s1 = 0;
         s2 = 0;
         s3 = 0;
    }
    
    //calcAverage() method
    public double calcAverage(double ascore1, double ascore2, double ascore3)
    {
        ascore1 = score1;
        ascore2 = score2;
        ascore3 = score3;
        avg = (ascore1 + ascore2 + ascore3) / 3 ;
        return avg;
    }
    
    //set()methods
    public void setScore1(double inScore1)
    {
        score1 = inScore1;
        if(inScore1 > 0 && inScore1 <=300)
        {
            inScore1 = score1;
        }
        else
        {
            score1 = score1;
        }
    }
    public void setScore2(double inScore2)
    {
        score2 = inScore2;
        if(inScore2 > 0 && inScore2 <=300)
        {
            inScore2 = score2;
        }
        else
        {
            score2 = score2;
        }
    }
    public void setScore3(double inScore3)
    {
        score3 = inScore3;
        if(inScore3 > 0 && inScore3 <=300)
        {
            inScore3 = score3;
        }
        else
        {
            score3 = score3;
        }
    }
    //get() methods
    public String getFullName()
    {
        return fullName;
    }
    public double getScore1()
    {
        return score1;
    }
    public double getScore2()
    {
        return score2;
    }
    public double getScore3()
    {
        return score3;
    }
    
}
