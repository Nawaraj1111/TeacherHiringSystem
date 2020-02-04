/**
 * Lecturer is subclass of Teacher which contains attributes (salary,startingForm, academicBlockNumber, dailyWorkingHour, advanceSalary,Joined, Terminated)
 * This class contains all the method for lecturer addition and Lecturer hiring and lecturer termination
 * @author Mr.Nawaraj Luitel
 * @Date 2019-8-4
 */
public class Lecturer extends Teacher
{
    //instance variables are salary,startingForm, academicBlockNumber,dailyWorkingHour,advanceSalary,joined, terminated
    private double salary;
    private String startingForm;
    private String academicBlockNumber;
    private int dailyWorkingHour;
    private double advanceSalary;
    private boolean joined;
    private boolean terminated;
    
    public Lecturer(String subject,String interviewerName,int classPerDay,double salary,int dailyWorkingHour)
    {
        //It is the constructor of Class Lecturer
        super(subject,interviewerName,classPerDay);
        this.salary = salary;
        this.dailyWorkingHour = dailyWorkingHour;
        this.startingForm ="";
        this.academicBlockNumber ="";
        this.advanceSalary =0.0;
        this.joined = false;
        this.terminated = false;
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
     * Getter for {@link # startingForm}
     * @return String {@link #startingForm}
     */
    public String getStartingForm()
    {
        return startingForm;
    }
    
    /**
     * Getter for {@link # academicBlockNumber}
     * @return String {@link #academicBlockNumber}
     */
    public String getAcademicBlockNumber()
    {
        return academicBlockNumber;
    }
    
    /**
     * Getter for {@link # dailyWorkingHour}
     * @return int {@link #dialyWorkingHour}
     */
    public int getDailyWorkingHour()
    {
        return dailyWorkingHour;
    }
    
    /**
     * Getter for {@link # advanceSalary}
     * @return {@link #advanceSalary}
     */
    public double getAdvanceSalary()
    {
        return advanceSalary;
    }
    
    /**
     * Getter for {@link # joined}
     * @return boolean {@link #joined}
     */
    public boolean getJoined()
    {
        return joined;
    }
    
    /**
     * Getter for {@link # terminated}
     * @return {@link #terminated}
     */
    public boolean getTerminated()
    {
        return terminated;
    }
    
    /**
     * setter for {@link # subject}
     * @param auto_key the{@link #salary} to set
     */
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    /**
     * setter for {@link # dailyWorkingHour}
     * @param dailyWorkingHour the {@link #dailyWorkingHour} to set
     */
    public void setDailyWorkingHour(int dailyWorkingHour)
    {
        this.dailyWorkingHour = dailyWorkingHour;
    }
    /**
     * This method is used for appointing lecturer which contains parameter like lecturerName,startingForm, advanceSalary and academicBlockNumber
     * if joined == true then print lecturer and academic blockNumber
     * otherwise all the parameter are printed
     */
    public void appointlecturer(String lecturerName, String startingFrom, double advanceSalary, String academicBlockNumber)
    {
        if(joined==true)
        {
            System.out.println("Lecturer Name is "+lecturerName+" and academic number is "+academicBlockNumber);
        }
        else
        {
            super.setTeacherName(lecturerName);
            this.startingForm = startingFrom;
            this.academicBlockNumber = academicBlockNumber;
            this.advanceSalary = advanceSalary;
            this.joined = true;
            this.terminated = false;            
        }
    }
    
    /**
     * This method is used for terminationg Lecturer is equal to true then lecturer is terminated printed 
     * otherwise the fields are set to empty or 0.0 or boolean
     */
    public void lecturerTermination()
    {
        if(terminated == true)
        {
            System.out.println("lecturer is terminated");
        }
        else
        {
            super.setTeacherName("");
            this.startingForm = startingForm;
            this.advanceSalary=0.0;
            this.joined = false;
            this.terminated= true;
        }
    }
    
    /**
     * This method is used for this method is used for displaying subject , teacher and salary
     */
    public void allDisplay()
    {
        System.out.println("SubjectName:"+getSubject());
        System.out.println("Lecturer Name:"+getTeacherName());
        System.out.println("Salary:"+getSalary());
    }
    
    /**
     * This method is used for displaying display method of Teacher class  
     * if joined is true,then termiation Status, starting Form, advance Salary, teacher name
     */
    public void display()
    {
        super.display();
        if(joined==true)
        {
            System.out.println("Termination Status:"+getTerminated());
            System.out.println("Starting From:"+getStartingForm());
            System.out.println("Advance Salary:"+getAdvanceSalary());
            System.out.println("Teacher Name:"+getTeacherName());
        }
    }
}
