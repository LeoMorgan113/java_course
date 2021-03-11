import com.company.ComplexNum;
import com.company.ComplexNumForms;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexNumTest {
    public ComplexNumForms complexNum = new ComplexNumForms(1.0, 4.0);

    @Test
    @DisplayName("Test for addReal()")
    public void addReal() {
        assertNotEquals(complexNum.addReal(new ComplexNum(3.0, 5.0)),
                            new ComplexNumForms(8.0, 9.0).getReal());
        assertEquals(complexNum.addReal(new ComplexNum(3.0, 5.0)),
                            new ComplexNumForms(4.0, 3.0).getReal());
    }

    @Test
    @DisplayName("Test for addImaginary()")
    public void addImaginary() {
        assertNotEquals(complexNum.addImaginary(new ComplexNum(3.0, 5.0)),
                            new ComplexNumForms(4.0, 3.0).getImaginary());
        assertEquals(complexNum.addImaginary(new ComplexNum(3.0, 5.0)),
                            new ComplexNumForms(8.0, 9.0).getImaginary());
    }

    @Test
    @DisplayName("Test for format()")
    public void format() {
        assertNotEquals(complexNum.format(ComplexNumForms.FORMAT.STANDARD), "x+iy = 1 + 4i");
        assertEquals(complexNum.format(ComplexNumForms.FORMAT.STANDARD), "x+iy = 1.0+4.0i");
    }
}

