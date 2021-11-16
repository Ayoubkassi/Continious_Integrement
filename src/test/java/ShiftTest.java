
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ryota
 */
public class ShiftTest {
    
    Calculator calc = new Calculator();
    
    @DisplayName("Test Addition")
    @Test
    void addition(){
        assertEquals(2,calc.add(1, 1));
    }
    
    @Test
    void substraction(){
        assertEquals(0,calc.sub(1,1));
    }
    
    
}
