package mongodbexample.repository;

import mongodbexample.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer> {
    //you dont need to create any methods, they are provided by mongo repository.
    //in generics first argument is ki collection kon hai and second argument is for id. Means <Student,Integer>

    public Student findByName(String name);

}
