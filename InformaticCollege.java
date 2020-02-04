/**
*GUI design for Teacher Appointment System
*@author Mr.Nawaraj luitel
*Date 2019-8-6
*/
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;

public class InformaticCollege implements ActionListener
{
    //instance variable 
    private JFrame frame;
    
    private JPanel panelTutor,panelLecturer;
    
    private JButton displayAllBtn,clearBtn;
    private JButton addSubjectLbtn,hireLbtn,hireTbtn,terminationLbtn,addSubjectTbtn;
    
    private JTextField subjectTtf,interviewerNameTtf,classPerDayTtf,salaryTtf,appointedByTtf,terminationDateTtf,teacherNumberTtf,teacherNameTtf,appointedDateTtf,
    terminationDate0Ttf,qualificationTtf;   
    
    private JLabel subjectTlbl,interviewerNameTlbl,classPerDayTlbl,salaryTlbl,appointedByTlbl,terminationDateTlbl,teacherNumberTlbl,teacherNameTlbl,appointedDateTlbl,
    terminationDate0Tlbl,qualificationTlbl;
    
    private JTextField subjectLtf,interviewerNameLtf,classPerDayLtf,salaryLtf,dailyWorkingHourLtf,teacherNumberLtf,teacherNameLtf,startingDateLtf,
    qualificationLtf,advanceSalaryLtf,academicBlockNumberLtf;
    
    private JLabel subjectLlbl,interviewerNameLlbl,classPerDayLlbl,salaryLlbl,dailyWorkingHourLlbl,teacherNumberLlbl,teacherNameLlbl,startingDateLlbl,
    qualificationLlbl,advanceSalaryLlbl,academicBlockNumberLlbl;
    
    ArrayList<Teacher> list = new ArrayList<Teacher>();// Array list of type Teacher
    /**
     * This is the main method of class InformaticsCollege
     *
     */
    public static void main(String []args)
    {
         InformaticCollege college = new InformaticCollege();
         college.informaticCollegeGui(); //calling main method
    }
           
    /**
     * This method set the size of frame and 
     * size & position of panel,label,textFields
     */ 
    public void informaticCollegeGui()
    {
        frame= new JFrame("Teacher Appointment System");
        frame.setSize(1160,480);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false); //This is for making size of frame constant 
        
        
        panelLecturer = new JPanel();
        panelLecturer.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red),"Lecturer Appointment"));
        panelLecturer.setBounds(20,20,545,380);
        panelLecturer.setBackground(Color.green);
        panelLecturer.setLayout(null);
        frame.add(panelLecturer);
        
        panelTutor = new JPanel();        
        panelTutor.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red),"Tutor Appointment"));
        panelTutor.setBounds(585,20,545,380);
        panelTutor.setBackground(Color.yellow);
        panelTutor.setLayout(null);
        frame.add(panelTutor);
        
        displayAllBtn = new JButton("Display");
        displayAllBtn.setBackground(Color.cyan);
        displayAllBtn.setForeground(Color.blue);
        displayAllBtn.setBounds(900,410,80,30);
        frame.add(displayAllBtn);
        displayAllBtn.addActionListener(this); //add action to button display
        
        clearBtn = new JButton("Clear");
        clearBtn.setBackground(Color.cyan);
        clearBtn.setForeground(Color.blue);
        clearBtn.setBounds(1000,410,80,30);
        frame.add(clearBtn);
        clearBtn.addActionListener(this); //add action to button Clear
        
       
        subjectTlbl = new JLabel("Subject");
        subjectTlbl.setBounds(20,20,80,25);
        panelTutor.add(subjectTlbl);
        
        subjectTtf = new JTextField();
        subjectTtf.setBounds(120,20,120,25);
        panelTutor.add(subjectTtf);
        
        interviewerNameTlbl = new JLabel("Interviewer's Name");
        interviewerNameTlbl.setBounds(270,20,110,20);
        panelTutor.add(interviewerNameTlbl);
        
        interviewerNameTtf = new JTextField();
        interviewerNameTtf.setBounds(390,20,140,25);
        panelTutor.add(interviewerNameTtf);
                
        classPerDayTlbl = new JLabel("Class Per Day");
        classPerDayTlbl.setBounds(20,60,110,25);        
        panelTutor.add(classPerDayTlbl);
        
        classPerDayTtf = new JTextField();
        classPerDayTtf.setBounds(120,60,110,25);
        panelTutor.add(classPerDayTtf);
        
        salaryTlbl = new JLabel("Salary");
        salaryTlbl.setBounds(270,60,110,25);
        panelTutor.add(salaryTlbl);
        
        salaryTtf = new JTextField();
        salaryTtf.setBounds(390,60,140,25);
        panelTutor.add(salaryTtf);
        
        appointedByTlbl = new JLabel("Appointed By"); 
        appointedByTlbl.setBounds(20,100,110,25);
        panelTutor.add(appointedByTlbl);
        
        appointedByTtf = new JTextField();
        appointedByTtf.setBounds(120,100,140,25);
        panelTutor.add(appointedByTtf);
        
        terminationDateTlbl = new JLabel("Termination Date"); 
        terminationDateTlbl.setBounds(270,100,110,25);
        panelTutor.add(terminationDateTlbl);
        
        terminationDateTtf = new JTextField();
        terminationDateTtf.setBounds(390,100,110,25);
        panelTutor.add(terminationDateTtf);
                        
        teacherNumberTlbl = new JLabel("Teacher Number");
        teacherNumberTlbl.setBounds(20,190,110,25);
        panelTutor.add(teacherNumberTlbl);
        
        teacherNumberTtf = new JTextField();
        teacherNumberTtf.setBounds(120,190,110,25);
        panelTutor.add(teacherNumberTtf);
        
        teacherNameTlbl = new JLabel("Teacher Name");
        teacherNameTlbl.setBounds(240,190,110,25);
        panelTutor.add(teacherNameTlbl);
        
        teacherNameTtf = new JTextField();
        teacherNameTtf.setBounds(390,190,110,25);
        panelTutor.add(teacherNameTtf);
        
        appointedDateTlbl =new JLabel("Appointed Date");
        appointedDateTlbl.setBounds(20,230,110,25);
        panelTutor.add(appointedDateTlbl);
        
        appointedDateTtf = new JTextField();
        appointedDateTtf.setBounds(120,230,110,25);
        panelTutor.add(appointedDateTtf);
        
        terminationDate0Tlbl = new JLabel("Termination Date");
        terminationDate0Tlbl.setBounds(240,230,110,25);
        panelTutor.add(terminationDate0Tlbl);
        
        terminationDate0Ttf = new JTextField();
        terminationDate0Ttf.setBounds(390,230,110,25);
        panelTutor.add(terminationDate0Ttf);
        
        qualificationTlbl = new JLabel("Qualification");
        qualificationTlbl.setBounds(20,270,110,25);
        panelTutor.add(qualificationTlbl);
        
        qualificationTtf = new JTextField();
        qualificationTtf.setBounds(120,270,170,25);
        panelTutor.add(qualificationTtf);       
                
        subjectLlbl = new JLabel("Subject");
        subjectLlbl.setBounds(20,20,80,25);
        panelLecturer.add(subjectLlbl);
        
        subjectLtf = new JTextField();
        subjectLtf.setBounds(120,20,120,25);
        panelLecturer.add(subjectLtf);
        
        interviewerNameLlbl = new JLabel("Interviewer's Name");
        interviewerNameLlbl.setBounds(270,20,110,20);
        panelLecturer.add(interviewerNameLlbl);
        
        interviewerNameLtf = new JTextField();
        interviewerNameLtf.setBounds(390,20,140,25);
        panelLecturer.add(interviewerNameLtf);
                
        classPerDayLlbl = new JLabel("Class Per Day");
        classPerDayLlbl.setBounds(20,60,110,25);        
        panelLecturer.add(classPerDayLlbl);
        
        classPerDayLtf = new JTextField();
        classPerDayLtf.setBounds(120,60,110,25);
        panelLecturer.add(classPerDayLtf);
        
        salaryLlbl = new JLabel("Salary");
        salaryLlbl.setBounds(270,60,110,25);
        panelLecturer.add(salaryLlbl);
        
        salaryLtf = new JTextField();
        salaryLtf.setBounds(390,60,140,25);
        panelLecturer.add(salaryLtf);
        
        dailyWorkingHourLlbl = new JLabel("Daily Working Hour"); 
        dailyWorkingHourLlbl.setBounds(20,100,120,25);
        panelLecturer.add(dailyWorkingHourLlbl);
        
        dailyWorkingHourLtf = new JTextField();
        dailyWorkingHourLtf.setBounds(140,100,140,25);
        panelLecturer.add(dailyWorkingHourLtf);     
                
        teacherNumberLlbl = new JLabel("Teacher Number");
        teacherNumberLlbl.setBounds(20,190,110,25);
        panelLecturer.add(teacherNumberLlbl);
        
        teacherNumberLtf = new JTextField();
        teacherNumberLtf.setBounds(120,190,110,25);
        panelLecturer.add(teacherNumberLtf);
        
        teacherNameLlbl = new JLabel("Teacher Name");
        teacherNameLlbl.setBounds(240,190,110,25);
        panelLecturer.add(teacherNameLlbl);
        
        teacherNameLtf = new JTextField();
        teacherNameLtf.setBounds(390,190,110,25);
        panelLecturer.add(teacherNameLtf);
        
        startingDateLlbl =new JLabel("Starting Date");
        startingDateLlbl.setBounds(20,230,110,25);
        panelLecturer.add(startingDateLlbl);
        
        startingDateLtf = new JTextField();
        startingDateLtf.setBounds(120,230,110,25);
        panelLecturer.add(startingDateLtf);
        
        advanceSalaryLlbl = new JLabel("Advance Salary");
        advanceSalaryLlbl.setBounds(240,230,110,25);
        panelLecturer.add(advanceSalaryLlbl);
        
        advanceSalaryLtf = new JTextField();
        advanceSalaryLtf.setBounds(390,230,110,25);
        panelLecturer.add(advanceSalaryLtf);
        
        academicBlockNumberLlbl = new JLabel("Academic Block Number");
        academicBlockNumberLlbl.setBounds(20,270,150,25);
        panelLecturer.add(academicBlockNumberLlbl);
        
        academicBlockNumberLtf = new JTextField();
        academicBlockNumberLtf.setBounds(180,270,170,25);
        panelLecturer.add(academicBlockNumberLtf); 
        
        addSubjectTbtn= new JButton("Add Tutor Subject");
        addSubjectTbtn.setBounds(350,140,160,30);
        addSubjectTbtn.setForeground(Color.blue);
        addSubjectTbtn.setBackground(Color.cyan);
        panelTutor.add(addSubjectTbtn);
        addSubjectTbtn.addActionListener(this); //add action to button Subject Tutor
        
        hireTbtn = new JButton("Hire Tutor");
        hireTbtn.setBounds(390,310,110,30);
        hireTbtn.setBackground(Color.cyan);
        panelTutor.add(hireTbtn);
        hireTbtn.addActionListener(this); //add action to button Hire Tutor
        
        addSubjectLbtn= new JButton("Add Lecturer Subject ");
        addSubjectLbtn.setBounds(350,140,160,30);
        addSubjectLbtn.setForeground(Color.blue);
        addSubjectLbtn.setBackground(Color.cyan);
        panelLecturer.add(addSubjectLbtn);
        addSubjectLbtn.addActionListener(this); //add action to button Add Subject Tutor
        
        hireLbtn = new JButton("Hire Lecturer");
        hireLbtn.setBounds(250,310,110,30);
        hireLbtn.setBackground(Color.cyan);
        panelLecturer.add(hireLbtn);
        hireLbtn.addActionListener(this); //add action to button Hire Lecturer
        
        terminationLbtn = new JButton("Lecturer Termination");
        terminationLbtn.setBounds(370,310,160,30);
        terminationLbtn.setBackground(Color.cyan);
        panelLecturer.add(terminationLbtn);
        terminationLbtn.addActionListener(this); //add action to button Lecturer Termination  
        
        frame.setVisible(true);
    }
    /* This method is used for adding subject to Tutor  
     * all the required input taken from textfiled if all the information are valid 
     * Then they are store in arraylist of  type Teacher(list)
     * check data type of textfield.If valid, tutor is added to list
     * 
     */  
    public void addTutorBtn()
    {
        String subject = subjectTtf.getText();
        String interviewerName = interviewerNameTtf.getText();
        String classPerDay0 = classPerDayTtf.getText();        
        String salary0 = salaryTtf.getText();        
        String appointedBy = appointedByTtf.getText();
        String terminationDate = terminationDateTtf.getText();
        
        if (subject.equals("") || interviewerName.equals("") || classPerDay0.equals("") || salary0.equals("") || appointedBy.equals("") ||terminationDate.equals(""))
            {
                  JOptionPane.showMessageDialog(frame,"You have not filled all the field", "Empty Field(s)",JOptionPane.WARNING_MESSAGE);
            }
        else
        {
            try{
                int classPerDay = Integer.parseInt(classPerDay0);
                double salary = Double.parseDouble(salary0);
                Tutor tutor = new Tutor(subject,interviewerName,classPerDay,salary,appointedBy,terminationDate);
                list.add(tutor);    //arraylist of type teacher
                JOptionPane.showMessageDialog(frame,"Subject: "+subject+"\nInterviewerName: "+interviewerName+"\nClass Per Day: "+classPerDay+
                "\nAppointed By: "+appointedBy+"\nTermination Date: "+terminationDate+"\nSalary"+salary+"\nSuccessfully added Tutor!!!!!","Tutor Added",JOptionPane.INFORMATION_MESSAGE);                
                clearBtn(); //clearing after user press ok in dialog box
            }    
            catch(NumberFormatException exp){
                JOptionPane.showMessageDialog(frame,"Please enter proper format \n\t\tTry again ","Invalid Input!",JOptionPane.ERROR_MESSAGE);
            }
        }    
    }
    /*
     * This button is used for hiring Tutor in InformaticCollege
     * firstly, all the required input are taken and checked.
     * If Teacher number is valid, Tutor is hired
     */
    public void hireTutorBtn()
    {
        String teacherNumber0 = teacherNumberTtf.getText();
        String teacherName = teacherNameTtf.getText();
        String appointedDate = appointedDateTtf.getText();
        String terminationDate = terminationDate0Ttf.getText(); 
        String qualification = qualificationTtf.getText();
        if (teacherNumber0.equals("") || teacherName.equals("") || appointedDate.equals("") || terminationDate.equals("") || qualification.equals(""))
            {
                  JOptionPane.showMessageDialog(frame,"You have not filled required the field", "Empty Field(s)",JOptionPane.WARNING_MESSAGE);
            }
        else{
            //exception handling
            try{
                int teacherNumber = Integer.parseInt(teacherNumber0); //string into int
                teacherNumber = teacherNumber - 1;  
                if(teacherNumber<0 || teacherNumber>=list.size()){
                    JOptionPane.showMessageDialog(frame,"The Teacher Number isnot available", "Empty Field(s)",JOptionPane.WARNING_MESSAGE);
                }
                else if(!(list.get(teacherNumber) instanceof Tutor)){
                    JOptionPane.showMessageDialog(frame,"Not an object of Tutor\nPlease enter valid Teacher Number", "Error",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    Tutor tutor = (Tutor) list.get(teacherNumber);
                    tutor.appointTutor(teacherName,appointedDate,terminationDate,qualification);
                    JOptionPane.showMessageDialog(frame,"Teacher Number: "+(++teacherNumber)+"\nTeacher Name: "+teacherName+"\nAppointed Date: "+appointedDate+"\nTermination Date: "+terminationDate+
                    "\nQualification: "+qualification+"\nSuccessfully hired Tutor!.","Tutor Added",JOptionPane.INFORMATION_MESSAGE);
                    clearBtn();
                }
                
            }    
            catch(NumberFormatException exp){
                JOptionPane.showMessageDialog(frame,"Please enter proper format \n Try Again ","Invalid Input!",JOptionPane.ERROR_MESSAGE);
            }
        }      
    } 
    /* This method is used for adding subject to Lecturer  
     * All the required input taken from textfiled if all the information are valid 
     * Then they are store in arraylist of  type Teacher(list)
     * check data type of textfield.If valid, Lecturer is added to list
     * 
     */
    
    public void addlecturerBtn()
    {
        String subject = subjectLtf.getText();
        String interviewerName = interviewerNameLtf.getText();
        String classPerDay00 = classPerDayLtf.getText();        
        String salary00 = classPerDayLtf.getText();       
        String dailyWorkingHour00 = dailyWorkingHourLtf.getText();
       
        if (subject.equals("") || interviewerName.equals("") || classPerDay00.equals("") || salary00.equals("") || dailyWorkingHour00.equals(""))
            {
                  JOptionPane.showMessageDialog(frame,"Please enter all the required fields", "Empty Field(s)",JOptionPane.WARNING_MESSAGE);
            }
        else{ 
            //exception handling        
            try{
                int classPerDay = Integer.parseInt(classPerDay00);
                double salary = Double.parseDouble(salary00);
                int dailyWorkingHour = Integer.parseInt(dailyWorkingHour00);
                Lecturer lecturer = new Lecturer(subject,interviewerName,classPerDay,salary,dailyWorkingHour);
                list.add(lecturer); //object of lecturer is added to the arraylist of teacher
                JOptionPane.showMessageDialog(frame,"Subject: "+subject+"\nInterviewer Name: "+interviewerName+"\nClass PerDay: "+classPerDay+
                "\nSalary: "+salary+"\nDaily working Hour: "+dailyWorkingHour+"\nSuccessfully added lecturer!!!","lecturer Added",JOptionPane.INFORMATION_MESSAGE);
                clearBtn(); //clearing text after user press ok in dialog box
            }    
            catch(NumberFormatException exp){
                JOptionPane.showMessageDialog(frame,"Please Input Valid data type","Invalid Input!",JOptionPane.ERROR_MESSAGE);
            }
        }    
        
    }
    /*This button is used for hiring Lecturer in InformaticCollege
     * firstly, all the required input are taken and checked.
     * If Teacher number is valid,Lecturer is hired 
     */    
    public void hireLecturerBtn()
    {
        String teacherNumber0 = teacherNumberLtf.getText();
        String teacherName = teacherNameLtf.getText();
        String startingDate = startingDateLtf.getText();
        String advanceSalary0 = advanceSalaryLtf.getText();
        String academicBlockNumber = academicBlockNumberLtf.getText();
        
        if (teacherNumber0.equals("") || teacherName.equals("") || startingDate.equals("") || advanceSalary0.equals("") || academicBlockNumber.equals("")){
            JOptionPane.showMessageDialog(frame,"You have not filled all the field", "Empty Field(s)",JOptionPane.WARNING_MESSAGE);
        }
        else{
            //exception handling
            try{
                double advanceSalary00 = Double.parseDouble(advanceSalary0);
                int teacherNumber = Integer.parseInt(teacherNumber0);
                teacherNumber = teacherNumber -1;
                if(teacherNumber<0 || teacherNumber>=list.size()){
                    //Check the valid number for Lecturer
                     JOptionPane.showMessageDialog(frame,"please enter valid Teacher Number", "Empty Field(s)",JOptionPane.WARNING_MESSAGE);
                }
                else if (!(list.get(teacherNumber) instanceof Lecturer)){
                    // checking the instance of lecturer or not
                    JOptionPane.showMessageDialog(frame,"Not an object of lecturer", "Error",JOptionPane.WARNING_MESSAGE);                    
                }
                else{
                    //calling Lectuter class
                    Lecturer lecturer = (Lecturer) list.get(teacherNumber);
                    lecturer.appointlecturer(teacherName,startingDate,advanceSalary00,academicBlockNumber);
                    JOptionPane.showMessageDialog(frame,"Teacher Number: "+(++teacherNumber)+"\nTeacher Name: "+teacherName+"\nStarting Date: "+startingDate+
                    "\nadvanceSalary00: "+advanceSalary00+"\nAcademic Block Number: "+academicBlockNumber+"\nLecturer has been hired successfully", "Successfully",JOptionPane.INFORMATION_MESSAGE);
                    clearBtn();//clearing text if user press ok in dialog box
                }
               
            }    
            catch(NumberFormatException exp){
                JOptionPane.showMessageDialog(frame,"Please Input valid data type","Invalid Input!",JOptionPane.ERROR_MESSAGE);
            }
        } 
    }
    /*This method is used for terminating the lecturer if user want to terminated certain lecturer contract
     * Firstly, it checks whether the teacher number is valid or not
     * if teacher number is valid, the contract is terminated
     */    
    public void terminationBtn()
    {
        String teacherNumberL = teacherNumberLtf.getText();
        if(teacherNumberL.isEmpty()){
             JOptionPane.showMessageDialog(frame,"Teacher Number can't be empty.\nPlease enter valid Teacher Number","Invalid Input!",JOptionPane.ERROR_MESSAGE);
        }     
        else{
            try{                
                int teacherNumber = Integer.parseInt(teacherNumberL);
                teacherNumber = teacherNumber -1;
                if(teacherNumber<0 || teacherNumber>=list.size()){
                    //check if the teacher number is negative or (greater than or equal to) size of list
                    JOptionPane.showMessageDialog(frame,"Invalid Teacher Number\nEnter a valid Teacher Number","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(!(list.get(teacherNumber) instanceof Lecturer)){
                    //checking instance of Lecturer or not
                    JOptionPane.showMessageDialog(frame,"Not an object of lecturer","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    //calling the class of Lecturer
                    Lecturer lecturerTermination = (Lecturer) list.get(teacherNumber);
                    lecturerTermination. lecturerTermination();  

                    JOptionPane.showMessageDialog(frame,"lecturer is successfully terminated","Successfull",JOptionPane.INFORMATION_MESSAGE); 
                    clearBtn();//clearing textfield after user press ok in Dialog box
                }
                
            }
            catch(NumberFormatException nfe){
                // Check the data type of text fields
                JOptionPane.showMessageDialog(frame,"Invalid textfiled data type\nPlease enter valid Teacher Number","Invalid Input",JOptionPane.ERROR_MESSAGE);
                
            }
            catch(NullPointerException npe){
                //check if the any values are empty or not
                JOptionPane.showMessageDialog(frame,"fields of some textBox is empty","successful",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }   
    /*
     * This method is used for clearing all the text of the frame
     */
    public void clearBtn()
    {
        subjectTtf.setText("");
        interviewerNameTtf.setText("");
        classPerDayTtf.setText("");
        salaryTtf.setText(""); 
        appointedByTtf.setText(""); 
        terminationDateTtf.setText("");    
        teacherNumberTtf.setText("");
        teacherNameTtf.setText("");
        appointedDateTtf.setText("");
        terminationDate0Ttf.setText("");
        qualificationTtf.setText("");    
        subjectLtf.setText("");
        interviewerNameLtf.setText("");
        classPerDayLtf.setText("");
        salaryLtf.setText(""); 
        dailyWorkingHourLtf.setText("");     
        teacherNumberLtf.setText("");
        teacherNameLtf.setText("");
        startingDateLtf.setText("");        
        advanceSalaryLtf.setText("");
        academicBlockNumberLtf.setText("");       
    }
    /*
     * This method display all the information of the Teacher management System.
     * It show all the information of adding subject for Tutor, hired tutor, termination, adding subject for lecturer and hired Lecturer
     */
    public void display()
    {
        int counterlecturer =0;//initializing variable to 0 for counting Tutor in Teacher Number
        int counterTutor =0; //initializing variable to 0 for couting Tutor in Teacher Number
        System.out.println("lecturer\n");
        for(Teacher obj: list){
            if(obj instanceof Lecturer){
                //checks whether this is object of ArrayList of Lecturer
                System.out.print(counterlecturer +1+"\n");
                obj.display(); 
                System.out.println("\n");
            }
            counterlecturer +=1;            
        }
        System.out.println("Tutor");
        for(Teacher obj: list){
            if(obj instanceof Tutor){
                //checks whether this is object from arrayList of Tutor 
                System.out.println(counterTutor +1+"");
                obj.display();
                System.out.println("\n");
            }
            counterTutor +=1;
        }
    }
    /*
     * This method is used for checking which button is pressed
     * for checking which button is checked getSource() is used
     * if else is used for locating proper button
     */
    
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource().equals(addSubjectLbtn)){
          addlecturerBtn();
       }
       else if(e.getSource().equals(hireLbtn)){
           hireLecturerBtn();
       }
       else if (e.getSource().equals(terminationLbtn)){
           terminationBtn();
       }
       else if (e.getSource().equals(hireTbtn)){
           hireTutorBtn();
       }
       else if (e.getSource().equals(addSubjectTbtn)){
           addTutorBtn();
       }
       else if (e.getSource().equals(clearBtn)){
           clearBtn();
       }
       else if (e.getSource().equals(displayAllBtn)){
           display();
       }
       else{
           clearBtn();
       }
           
    }
}
    
        
