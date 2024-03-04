public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ali" ,"Jalilvand" ,"40139005");
        Student st2 = new Student("Armin" ,"Karimi" ,"40123020");
        Student st3 = new Student("Maryam" ,"Mohammadi" ,"40031083");

        st1.setGrade(20);
        st2.setGrade(14.75);
        st3.setGrade(18.5);

//        st1.printStudentInfo();
//        st2.printStudentInfo();

        Lab l1 = new Lab("Mr.Azizi" ,"Monday", 10);
        l1.enrollStudent(st1);
        l1.enrollStudent(st2);
        l1.enrollStudent(st3);
        l1.setAvg();
        l1.printInformations();
        System.out.println("\naverage = " + l1.getAvg());

    }
}