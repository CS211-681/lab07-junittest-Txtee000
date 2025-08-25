package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    StudentHardCodeDatasource  studentHardCodeDatasource;
    @BeforeEach
    void setUp() {
        studentHardCodeDatasource = new StudentHardCodeDatasource();
    }
    @Test
    void testReadData(){
        StudentList list = studentHardCodeDatasource.readData();
        assertEquals("6710400001", list.getStudents().get(0).getId());
        assertEquals("First", list.getStudents().get(0).getName());
        assertEquals(4, list.getStudents().size());
    }

}