package item;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
public class Student {

    private  String name;
    private  int age;
    private List<Book> books;

    public Student(){}

    public Student(String name, int age, List<Book> books){
        this.age=age;
        this.name=name;
        this.books=books;
    }

}
