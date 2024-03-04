public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ali" ,"Jalilvand" ,"40139005");
        Student st2 = new Student("Armin" ,"Karimi" ,"40123020");

        st1.setGrade(20);
        st2.setGrade(18.5);

        st1.printStudentInfo();
        st2.printStudentInfo();

        Lab l1 = new Lab("Mr.Azizi" ,"Monday", 2);

    }
}