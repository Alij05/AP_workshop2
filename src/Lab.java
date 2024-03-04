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
        //currentSize = 0;
        students = new Student[maxSize];
    }

    public void enrollStudent(Student std){
        if(currentSize < maxSize){
            this.students[currentSize] = std;
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
    public void setStudents(Student std) {
        for (int i = 0; i < maxSize; i++) {
            this.students[i] = std;
        }
    }
    public void setCurrentSize(int currentSize){
        this.currentSize = currentSize;
    }
    public void setAvg(){
        double sum = 0;
        for (int i = 0; i < currentSize; i++) {
            sum += students[i].getGrade();
        }
        avg = sum / currentSize;
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

    public void printInformations(){
        System.out.println(teacherName);
        System.out.println("\nLab's Student : \n");
        for (int i = 0; i < currentSize; i++) {
            students[i].printStudentInfo();
        }
    }

}
