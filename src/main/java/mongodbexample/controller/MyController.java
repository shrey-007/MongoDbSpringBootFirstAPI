package mongodbexample.controller;

import mongodbexample.model.Student;
import mongodbexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MyController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/addStudent")
    public ResponseEntity<?> addStudent(@RequestBody Student student){

        Student savedStudent=this.studentRepository.save(student);

        return ResponseEntity.ok(savedStudent);

    }

    @GetMapping("/getStudents")
    public ResponseEntity<?> getStudents(){
        return ResponseEntity.ok(this.studentRepository.findAll());
    }

    @GetMapping("getStudent/{name}")
    public ResponseEntity<?> getStudent(@PathVariable("name") String name){
        return ResponseEntity.ok(this.studentRepository.findByName(name));

    }


}
