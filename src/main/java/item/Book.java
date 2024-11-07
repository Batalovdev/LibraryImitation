package item;

import lombok.Getter;
import lombok.NonNull;

import java.util.Objects;

@Getter
public class Book {
    private  String name;
    private  int pubAge;
    private  String authorName;

    public Book(){}
    public Book(String name, int pubAge, String authorName){
        this.authorName=authorName;
        this.name=name;
        this.pubAge=pubAge;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){return true;}
        if(obj == null || this.getClass()!= obj.getClass()){
            return false;
        }
        Book book=(Book) obj;

        return pubAge==book.pubAge
                && (Objects.equals(name, book.name))
                && (Objects.equals(authorName, book.authorName));
    }

    @Override
    public int hashCode(){
        int result = name!=null?name.hashCode():0;
        result+=authorName!=null?authorName.hashCode():0;
        result+=pubAge;
        return result;
    }
}
