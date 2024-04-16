import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LogicGates1Test {

    @Test
    public void testGetInputA() {
        // Create a LogicGates1 instance
        LogicGates1 gates = new LogicGates1();

        // Verify that the initial value of InputA is false
        assertFalse(gates.getInputA());

        // Create a copy of the LogicGates1 object
        LogicGates1 copy = new LogicGates1();

        // Modify the InputA value
        gates.setInputA(true);

        // Verify that InputA is now true
        assertTrue(gates.getInputA());

        // Verify that InputA of the copy remains false
        assertFalse(copy.getInputA());
    }

    @Test
    public void testGetInputB() {
        // Create a LogicGates1 instance
        LogicGates1 gates = new LogicGates1();

        // Verify that the initial value of InputB is false
        assertFalse(gates.getInputB());

        // Create a copy of the LogicGates1 object
        LogicGates1 copy = new LogicGates1();

        // Modify the InputB value
        gates.setInputB(true);

        // Verify that InputB is now true
        assertTrue(gates.getInputB());

        // Verify that InputB of the copy remains false
        assertFalse(copy.getInputB());
    }

    @Test
    public void testSetInputA() {
        // Create a LogicGates1 instance
        LogicGates1 gates = new LogicGates1();

        // Set InputA to true
        gates.setInputA(true);

        // Verify that InputA is now true
        assertTrue(gates.getInputA());
    }

    @Test
    public void testSetInputB() {
        // Create a LogicGates1 instance
        LogicGates1 gates = new LogicGates1();

        // Set InputB to true
        gates.setInputB(true);

        // Verify that InputB is now true
        assertTrue(gates.getInputB());
    }

    @Test
    public void testSetInputAFalse() {

        LogicGates1 gates = new LogicGates1();

        /*
         * Set input A to true (it's false initially, but let's test switching
         * between both to make sure it's working properly)
         */
        gates.setInputA(true);

        // Set input A to false
        gates.setInputA(false);

        // Create a copy of the gates object
        LogicGates1 copy = new LogicGates1();
        copy.setInputA(false);

        // Check if getInputA returns false
        assertFalse(gates.getInputA());

        // Check if getInputB returns the same value as the copy
        assertEquals(copy.getInputA(), gates.getInputA());
    }

    @Test
    public void testSetInputBFalse() {

        LogicGates1 gates = new LogicGates1();

        /*
         * Set input B to true (it's false initially, but let's test switching
         * between both to make sure it's working properly)
         */
        gates.setInputB(true);

        // Set input B to false
        gates.setInputB(false);

        // Create a copy of the gates object
        LogicGates1 copy = new LogicGates1();
        copy.setInputB(false);

        // Check if getInputB returns false
        assertFalse(gates.getInputB());

        // Check to ensure getInputB returns the same value as the copy
        assertEquals(copy.getInputB(), gates.getInputB());
    }

}
