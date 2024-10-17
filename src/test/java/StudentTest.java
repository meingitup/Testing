import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student= new Student();
    @Test
    public void test() {
        int sum = student.add(2,3);
        assertEquals(5,sum);
        assertTrue(5==sum);

    }

}