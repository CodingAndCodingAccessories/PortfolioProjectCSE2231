import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LogicGatesSecondaryTest {

    //Truth tables...
    @Test
    public void testANDGateTT() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set inputs A and B to true
        gates.setInputA(true);
        gates.setInputB(true);

        // Call the ANDGate method
        boolean result = gates.ANDGate();

        // Assert that the result is true since both inputs are true
        assertTrue(result);
    }

    @Test
    public void testANDGateFF() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set inputs A and B to false
        gates.setInputA(false);
        gates.setInputB(false);

        // Call the ANDGate method
        boolean result = gates.ANDGate();

        // Assert that the result is false since both inputs are false
        assertFalse(result);
    }

    @Test
    public void testANDGateTF() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set inputs A and B to false
        gates.setInputA(true);
        gates.setInputB(false);

        // Call the ANDGate method
        boolean result = gates.ANDGate();

        // Assert that the result is false since both inputs are false
        assertFalse(result);
    }

    @Test
    public void testANDGateFT() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set inputs A and B to false
        gates.setInputA(false);
        gates.setInputB(true);

        // Call the ANDGate method
        boolean result = gates.ANDGate();

        // Assert that the result is false since both inputs are false
        assertFalse(result);
    }

    @Test
    public void testORGateTT() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set inputs A and B to true
        gates.setInputA(true);
        gates.setInputB(true);

        // Call the ORGate method
        boolean result = gates.ORGate();

        // Assert that the result is true since at least one input is true
        assertTrue(result);
    }

    @Test
    public void testORGateTF() {
        LogicGates1 gates = new LogicGates1();
        gates.setInputA(true);
        gates.setInputB(false);
        boolean result = gates.ORGate();
        assertTrue(result);
    }

    @Test
    public void testORGateFT() {
        LogicGates1 gates = new LogicGates1();
        gates.setInputA(false);
        gates.setInputB(true);
        boolean result = gates.ORGate();
        assertTrue(result);
    }

    @Test
    public void testORGateFF() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set inputs A and B to false
        gates.setInputA(false);
        gates.setInputB(false);

        // Call the ORGate method
        boolean result = gates.ORGate();

        // Assert that the result is false since both inputs are false
        assertFalse(result);
    }

    @Test
    public void testNOTGateT() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set input A to true
        gates.setInputA(true);

        // Call the NOTGate method
        boolean result = gates.NOTGate();

        // Assert that the result is false since input A is true
        assertFalse(result);
    }

    @Test
    public void testNOTGateF() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set input A to false
        gates.setInputA(false);

        // Call the NOTGate method
        boolean result = gates.NOTGate();

        // Assert that the result is true since input A is false
        assertTrue(result);
    }

    @Test
    public void testXORGateTT() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set inputs A and B to true
        gates.setInputA(true);
        gates.setInputB(true);

        // Call the XORGate method
        boolean result = gates.XORGate();

        // Assert that the result is false since both inputs are true
        assertFalse(result);
    }

    @Test
    public void testXORGateFF() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set inputs A and B to false
        gates.setInputA(false);
        gates.setInputB(false);

        // Call the XORGate method
        boolean result = gates.XORGate();

        // Assert that the result is false since both inputs are false
        assertFalse(result);
    }

    @Test
    public void testXORGateTF() {
        LogicGates1 gates = new LogicGates1();
        gates.setInputA(true);
        gates.setInputB(false);
        boolean result = gates.XORGate();
        assertTrue(result);
    }

    @Test
    public void testXORGateFT() {
        LogicGates1 gates = new LogicGates1();
        gates.setInputA(false);
        gates.setInputB(true);
        boolean result = gates.XORGate();
        assertTrue(result);
    }

    @Test
    public void testNANDGateTT() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set inputs A and B to true
        gates.setInputA(true);
        gates.setInputB(true);

        // Call the NANDGate method
        boolean result = gates.NANDGate();

        // Assert that the result is false since both inputs are true
        assertFalse(result);
    }

    @Test
    public void testNANDGateFF() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set inputs A and B to false
        gates.setInputA(false);
        gates.setInputB(false);

        // Call the NANDGate method
        boolean result = gates.NANDGate();

        // Assert that the result is true since both inputs are false
        assertTrue(result);
    }

    @Test
    public void testNANDGateTF() {
        LogicGates1 gates = new LogicGates1();
        gates.setInputA(true);
        gates.setInputB(false);
        boolean result = gates.NANDGate();
        assertTrue(result);
    }

    @Test
    public void testNANDGateFT() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set input A to false and input B to true
        gates.setInputA(false);
        gates.setInputB(true);

        // Call the NANDGate method
        boolean result = gates.NANDGate();

        // Assert that the result is true since one input is false and the other is true
        assertTrue(result);
    }

    @Test
    public void testNORGateTT() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set inputs A and B to true
        gates.setInputA(true);
        gates.setInputB(true);

        // Call the NORGate method
        boolean result = gates.NORGate();

        // Assert that the result is false since both inputs are true
        assertFalse(result);
    }

    @Test
    public void testNORGateFF() {
        // Create a LogicGates object
        LogicGates1 gates = new LogicGates1();

        // Set inputs A and B to false
        gates.setInputA(false);
        gates.setInputB(false);

        // Call the NORGate method
        boolean result = gates.NORGate();

        // Assert that the result is true since both inputs are false
        assertTrue(result);
    }

    @Test
    public void testNORGateTF() {
        LogicGates1 gates = new LogicGates1();
        gates.setInputA(true);
        gates.setInputB(false);
        boolean result = gates.NORGate();
        assertFalse(result);
    }

    @Test
    public void testNORGateFT() {
        LogicGates1 gates = new LogicGates1();
        gates.setInputA(false);
        gates.setInputB(true);
        boolean result = gates.NORGate();
        assertFalse(result);
    }

}
