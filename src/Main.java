import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void printStudentInfo (Student student) {
        System.out.println("Student's name is " + student.getName());
        Optional.ofNullable(student.getAddress()).ifPresentOrElse(address -> System.out.println(address), () -> System.out.print(""));

    }
    public static void main(String[] args) {
        Student student = new Student("Natasha", Optional.of(new Address("Moscow", "Russia")));
        Student student3 = new Student("Anna");
        Student student4 = new Student("Nikita", Optional.of(new Address("St-Petersburg", "Leningradskaya obl.")));
        Student student1 = new Student("Arina");
        Student student2 = new Student("George", Optional.of(new Address("Sochi", "Krasnodarskiy kray")));

        printStudentInfo(student1);
        printStudentInfo(student);
        printStudentInfo(student3);
        printStudentInfo(student4);
        printStudentInfo(student2);
        
        System.out.println();
        ArrayList<String> str = new ArrayList<>();
        str.add("I");
        str.add("have");
        str.add("been");
        str.add("reading");
        str.add("for");
        str.add("several");
        str.add("hours");
        System.out.println(str);
        System.out.println(str.stream().reduce("", (x, y) -> x + " " + y));





    }
}