/**
 * Tutor class is subclass of class Teacher which contains attributes like (salary,appointedDate, evaluationPeriod , terminationDate, qualification, appointedBy,joined)
 * This method contains all method of addition of subject for Tutor and tutor hiring
 * @author Mr.Nawaraj luitel
 * @version (2019-6-4)
 */
public class Tutor extends Teacher
{
    // instance variable of class Tutor are salary,appointedDate, evaluationPeriod, terminationDate, qualification,appointedBy, joined
    private double salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    public Tutor(String subject, String interviewerName, int classPerDay, double salary, String appointedBy, String terminationDate)
    {
        // It is the constructor of class Tutor
        super(subject, interviewerName, classPerDay);
        this.salary = salary;
        this.appointedBy = appointedBy;
        this.terminationDate = terminationDate;
        this.appointedDate ="";
        this.qualification="";
        this.joined = false;
    }
    
    /**
     * Getter for {@link # salary}
     * @return double {@link #salary}
     */
    public double getSalary()
    {
        return salary;
    }
    
    /**
     * Getter for {@link # appointedDate}
     * @return String {@link # appointedDate}
     */
    public String getAppointedDate()
    {
        return appointedDate;
    }
    
    /**
     * Getter for {@link # evaluationPeriod}
     * @return String {@link #evaluationPeriod}
     */
    public String getEvalutionPeriod()
    {
        return evaluationPeriod;
    }
    
    /**
     * Getter for {@link #terminationDate}
     * @return string {@link #terminationDate}
     */
    public String getTerminationDate()
    {
        return terminationDate;
    }
    
    /**
     * Getter for {@link # appointedBy}
     * @return String {@link #appointedBy}
     */
    public String GetAppointedBy()
    {
        return appointedBy;
    }
    
    /**
     * Getter for {@link # qualification}
     * @return qualification {@link #qualification}
     */
    public String getQualification()
    {
        return qualification;
    }
    
    /**
     * Getter for {@link #joined}
     * @return boolean {@link #joined}
     */
    public boolean getJoined()
    {
        return joined;
    }
    
    /**
     * setter for {@link # salary}
     * @param auto_key the{@link #newSalary} to set
     */
    public void setSalary(double newSalary)
    {
        if(joined==false)
        {
            this.salary = newSalary;
        }
        else if(joined==true)
        {
            System.out.println("The salary remains unchanged");
        }
    }
    /**
     * This method is used for appointing tutor which contains parameter like tutorName,appointedDate,terminationDate and qualification
     * if joined == true then print apppointedDate
     * otherwise set value of TeacherName 
     */
    public void appointTutor(String tutorName, String appointedDate, String terminationDate, String qualification)
    {
        if(joined==false)
        {
            super.setTeacherName(tutorName);
            this.joined = true;
        }
        else
        {
            System.out.println("AppointedDate: "+ appointedDate+" The tutor is already appointed");
            
        }
        this.appointedDate = appointedDate;
        this.terminationDate = terminationDate;
        this.qualification = qualification;        
    }
    
    /**
     * This method is used for displaying display method of Teacher class  
     * if joined is true,then Appointed Date , Tutor name, Evaluation Period , Termination Date, Salary, Qualification, AppointedBy is also printed
     */
    public void display()
    {
        super.display();
        if(joined==true)
        {
            System.out.println("Appointed Date: "+getAppointedDate());
            System.out.println("Tutor Name: "+getTeacherName());
            System.out.println("Evaluation period: "+getEvalutionPeriod());
            System.out.println("Termination Date: "+ getTerminationDate());
            System.out.println("Tutor Salary: "+getSalary());
            System.out.println("Tutor Qualification: "+getQualification());
            System.out.println("Tutor Appointed By: "+GetAppointedBy());
        }
    }
    
}