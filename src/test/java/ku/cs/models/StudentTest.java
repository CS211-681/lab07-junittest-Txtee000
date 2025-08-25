package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
//    static Student s;
//    @BeforeAll // จะถูกรัน 1 ครั้ง
//    static void initial(){
//        s = new Student("6710450678", "test");
//    }

    Student s;
    @BeforeEach // จะรันทุกครั้งที่เรียก @Test
    void setUp() {
        s = new Student("6710450678", "Chonlasit");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะเเนน 54.55")
    void testAddScore() {
        s.addScore(54.55);
        assertEquals(54.55, s.getScore()); // เทียบค่าว่าเท่ากันมั้ย
    }
    @Test
    void testCalculateScore() {
        s.addScore(84.55);
        assertEquals("A", s.grade());
    }

    @Test
    void testIsId(){
        s.isId("6710450678");
        assertEquals(true, s.isId(s.getId()));
    }

    @Test
    void testIsNameContains(){
        s.isNameContains("Chonlasit");
        assertEquals(true,s.isNameContains(s.getName()), s.getName());
    }
    @Test
    void testChangeName(){
        s.changeName("Tee");
        assertEquals("Tee", s.getName());
    }
}