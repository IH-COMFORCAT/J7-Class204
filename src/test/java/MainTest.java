import com.ironhack.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {


    @Test
    @DisplayName("The product of two numbers is lower than Integer.MAX_VALUE")
    void multiply_productLowerThanMaxValue_ResultOK() {

        assertEquals(10, Main.multiply(5, 2));

    }

    @Test
    @DisplayName("The product of two numbers is greater than MAX Value, throws Exception")
    void multiply_productHigherThanMaxValue_ThrowsIllegalArgument() {

        assertThrows(IllegalArgumentException.class, () -> Main.multiply(Integer.MAX_VALUE, 2));

    }



}
