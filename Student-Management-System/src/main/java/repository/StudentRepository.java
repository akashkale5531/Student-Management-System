package repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
