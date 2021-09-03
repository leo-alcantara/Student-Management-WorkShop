package se.lexicon.data_access;


import org.springframework.stereotype.Component;
import se.lexicon.models.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao {

    List<Student> studentStorage = null;


    public StudentDaoListImpl() {
        this.studentStorage = new ArrayList<>();
    }


    @Override
    public Student save(Student student) {
        studentStorage.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        return  studentStorage.stream()
                       .filter(student -> student.getId()==id)
                      .findFirst().orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Student> findAll() {
        return studentStorage;
    }

    @Override
    public void delete(int id) {
        studentStorage.remove(find(id));
    }
}
