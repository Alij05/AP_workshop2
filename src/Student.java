public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private double grade;

    public Student(String firstName ,String lastName ,String id){
        setFirstName(firstName);
        setLastName(lastName);
        setId(id);
        grade = 0;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setId(String id){
        if(id.length() == 8)
            this.id = id;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getId(){
        return id;
    }
    public double getGrade(){
        return grade;
    }

    public void printStudentInfo(){
        System.out.println(firstName + " " + lastName + "\n" + id + "  " + grade + "\n");
    }
}

