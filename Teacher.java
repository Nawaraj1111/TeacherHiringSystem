/**
 * This is the parent class of Lecturer and Tutor which contains subject, teacherName, interviewername and classPerDay as attributes
 * if teacher name is entered then, then, suject , classPerDay,interviewername is printed
 * @ Mr.Nawaraj Luitel
 * Date 2019-8-4
 */
public class Teacher
{
    //instance Variable(subject, teacherName, interviewerName,classPerDay) of class Teacher
    private String subject;
    private String teacherName;
    private String interviewerName;
    int classPerDay;
    /**
     * Constructor for objects(subject,interviewerName and classPerDay) of class Teacher
     */
    public Teacher(String subject, String interviewerName, int classPerDay)
    {
        //initializing subject,interviewerName and classPerDay
        this.subject =subject;
        this.teacherName = "";
        this.interviewerName = interviewerName;
        this.classPerDay= classPerDay;       
    }
    
    /**
     * Getter for {@link #subject}
     * @return {@link #subject}
     */
    public String getSubject()
    {
        return subject;
    }
    
    /**
     * Getter for {@link #teacherName}
     * @return {@link #teacherName}
     */
    public String getTeacherName()
    {
        return teacherName;
    }
    
    /**
     * Getter for {@link # classPerDay}
     * @return {@link #classPerDay}
     */
    public int getClassPerDay()
    {
        return classPerDay;
    }
    /**
     * Getter for {@link #interviewer}
     * @return {@link #subject}
     */
    public String getInterviewerName()
    {
        return interviewerName;
    }
    /**
     * Setter for {@link # teacherName}
     * @return {@link #teacherName}
     */
    public void setTeacherName(String teacherName)
    {
        this.teacherName= teacherName; 
    }
    /**
     * This is display method with default parameter
     * This method prints subject, getClassPerDay,getInterviewerName 
     * if teacher isnot empty then teachername is also printed
     */
    public void display()
    {
        System.out.println("Subject:"+getSubject()+"\nClass per day:"+getClassPerDay()+"\nInterviewer Name:"+getInterviewerName());
        if(!teacherName.equals(""))
        {
            System.out.println("Teacher Name:"+getTeacherName());
        }
    }
}