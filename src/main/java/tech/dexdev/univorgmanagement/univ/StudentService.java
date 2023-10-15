package tech.dexdev.univorgmanagement.univ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Optional<Student> findById(String id) {
        boolean exists = repository.existsById(id);
        if(!exists)
            throw new IllegalStateException("Student With Id '" + id + "' Not In Database");
        return repository.findById(id);
    }

    public void save(Student student) {
        Optional<Student> optionalStudent = repository.findById(student.getStudentId());
        if(optionalStudent.isPresent()) {
                throw new IllegalStateException("Duplicate Record");
        }
        repository.save(student);

    }

    public void updateById(String id,
                           Student student) {
        boolean exists = repository.existsById(id);
        if(!exists) {
            throw new IllegalStateException("Student With Id '" + id + "' Not In Database");
        }
        if(!Objects.equals(student.getStudentId(), id)) {
            throw new IllegalStateException("Student Ids do not match");
        }
        repository.save(student);
    }

    public void deleteById(String id) {
        boolean exists = repository.existsById(id);
        if(!exists)
            throw new IllegalStateException("Student With Id '" + id + "' Not In Database");
        repository.deleteById(id);

    }
}
