public class Lab {
    private Student[] students;
    private String teacherName;
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avg;

    public Lab(String teacherName ,String dayOfWeek ,int maxSize){
        setTeacherName(teacherName);
        setDayOfWeek(dayOfWeek);
        setMaxSize(maxSize);
        students = new Student[maxSize];
    }

    public void enrollStudent(Student std){
        if(currentSize < maxSize){
            students[currentSize] = std;
            currentSize++;
        }
    }

    public void setTeacherName(String teacherName){
        this.teacherName = teacherName;
    }
    public void setDayOfWeek(String dayOfWeek){
        this.dayOfWeek = dayOfWeek;
    }
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    public void setStudents(Student[] students){
        this.students = students;
    }
    public void setCurrentSize(int currentSize){
        this.currentSize = currentSize;
    }
    public void setAvg(){
        double sum = 0;
        for (int i = 0; i < maxSize; i++) {
            sum += students[i].getGrade();
        }
        avg = sum / maxSize;
    }

    public String getTeacherName(){
        return teacherName;
    }
    public String getDayOfWeek(String dayOfWeek){
        return dayOfWeek;
    }
    public int getMaxSize(){
        return maxSize;
    }
    public int getCurrentSize(){
        return currentSize;
    }
    public double getAvg(){
        return avg;
    }

    public void print(){
        System.out.println("Lab's Student : ");
        for (int i = 0; i < maxSize; i++) {
            students[i].printStudentInfo();
        }
    }

}
