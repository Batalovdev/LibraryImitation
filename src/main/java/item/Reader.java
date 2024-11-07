package item;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class Reader {
    public Set<Student> readStudents(String filePath) throws IOException {
        ObjectMapper objMap = new ObjectMapper();
        ListWrapper students = objMap.readValue(new File(filePath),
                ListWrapper.class);
        return Set.copyOf(students.getStudents());
    }
}
