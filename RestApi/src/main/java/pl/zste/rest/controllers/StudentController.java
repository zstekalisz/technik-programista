package pl.zste.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.zste.rest.endpoints.RestAppEndpoint;
import pl.zste.rest.hateoas.StudentDTO;
import pl.zste.rest.hateoas.StudentDTOAssembler;
import pl.zste.rest.model.Student;

import java.util.List;

@RestController
@RequestMapping(value = "/students",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(value = "*")
public class StudentController {

    @Autowired
    private RestAppEndpoint endpoint;

    @Autowired
    private StudentDTOAssembler studentDTOAssembler;

    @GetMapping(value = "/{id}")
    public StudentDTO getStudentById(@PathVariable Long id){
        Student student = endpoint.getStudentById(id);
        return studentDTOAssembler.toModel(student);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CollectionModel<StudentDTO> getAllStudents(){
        List<Student> students = endpoint.getAllStudents();
        CollectionModel<StudentDTO> collectionModel = studentDTOAssembler.toCollectionModel(students);
        //statyczny import - w linii poniżej dodajemy linka do metody jako siebie samej
        collectionModel.add(linkTo(methodOn(StudentController.class).getAllStudents()).withRel("students"));
        return collectionModel;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentDTO> addNewStudent(@RequestBody Student student){
        Student saved = endpoint.saveStudentInDatabase(student);
        StudentDTO savedDTO = studentDTOAssembler.toModel(saved);
        return ResponseEntity.ok(savedDTO);
    }
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<StudentDTO> editStudent(@PathVariable Long id, @RequestBody Student student){
        Student studentFromDB = endpoint.getStudentById(id);
        studentFromDB.setName(student.getName());
        studentFromDB.setSurname(student.getSurname());
        studentFromDB.setClassNumber(student.getClassNumber());
        studentFromDB.getEmail().setEmail(student.getEmail().getEmail());
        Student updateStudent = endpoint.updateStudent(studentFromDB);
        StudentDTO updateStudentDTO = studentDTOAssembler.toModel(updateStudent);
        return ResponseEntity.ok(updateStudentDTO);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        Student student = endpoint.getStudentById(id);
        if(student!=null){
            endpoint.deleteStudent(student);
            return ResponseEntity.ok("Usunięto studenta");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nie znaleziono studenta o takim id");
        }
    }
}
