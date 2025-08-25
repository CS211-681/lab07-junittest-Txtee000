package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class StudentListTest {
    StudentList studentList;
    @BeforeEach
    void setUp() {
        studentList = new StudentList();
    }

    @Test
    void testAddNewStudent() {
        studentList.addNewStudent("6710450678", "Chonlasit");
        studentList.addNewStudent("6710450999", "Tee");
        ArrayList<Student> students = studentList.getStudents();
        assertEquals("6710450678", students.get(0).getId());
        assertEquals("Chonlasit", students.get(0).getName());
        assertEquals(0, students.get(0).getScore());
        assertEquals(2, students.size());
    }
    @Test
    void testAddNewStudent2() {
        studentList.addNewStudent("6710450678", "Chonlasit", 50);
        studentList.addNewStudent("6710450999", "Tee", 100);
        ArrayList<Student> students = studentList.getStudents();
        assertEquals("6710450678", students.get(0).getId());
        assertEquals("Chonlasit", students.get(0).getName());
        assertEquals(50, students.get(0).getScore());
        assertEquals(2, students.size());
    }
    @Test
    void testFindStudentById(){
        studentList.addNewStudent("6710450678", "Chonlasit");
        studentList.addNewStudent("6710450999", "Tee");
        assertEquals("6710450678", studentList.findStudentById("6710450678").getId());
    }
    @Test
    void testFilterByName(){
        studentList.addNewStudent("6710450678", "Chonlasit");
        studentList.addNewStudent("6710450999", "Chonrana");
        StudentList filteredList =  studentList.filterByName("x");
        for(Student student : filteredList.getStudents()){
            assertEquals(true, student.isNameContains("x"));
        }

    }
    @Test
    void testGiveScoreToId(){
        studentList.addNewStudent("6710450678", "Chonlasit");
        studentList.giveScoreToId("6710450678", 60);
        assertEquals(60, studentList.findStudentById("6710450678").getScore());
    }

    @Test
    void testViewGradeOfId(){
        studentList.addNewStudent("6710450678", "Chonlasit", 100);
        studentList.addNewStudent("6710450999", "Tee", 50);
        assertEquals("A", studentList.viewGradeOfId("6710450678"));

    }
}