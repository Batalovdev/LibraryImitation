import item.Reader;
import item.Student;

import java.io.IOException;
import java.util.Set;

public class CentralLib {
    public static void main(String[] args) {
        Reader reader = new Reader();
        try {
            Set<Student> students = reader.readStudents("src/main/resources/students_list.json");

            students.stream().forEach(student -> {
                System.out.printf("Name:%s\nAge:%d\nBooks:",student.getName(),student.getAge());
                student.getBooks().stream().forEach(book -> {
                    System.out.printf("\t%s\n",book.getName());
                });
            });


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
