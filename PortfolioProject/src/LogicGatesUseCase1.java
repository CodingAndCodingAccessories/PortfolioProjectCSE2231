
public class LogicGatesUseCase1 {

    // Method to generate a text truth table for an AND gate in the console.
    public static void generateANDTruthTable() {
        System.out.println("Truth Table for AND Gate:");
        System.out.println("Input A | Input B | Output");
        System.out.println("-----------------------------");
        for (boolean a : new boolean[] { true, false }) {
            for (boolean b : new boolean[] { true, false }) {
                LogicGates1 gate = new LogicGates1();
                gate.setInputA(a);
                gate.setInputB(b);
                System.out.println(
                        a + "       | " + b + "       | " + gate.ANDGate());
            }
        }
    }

    public static void main(String[] args) {
        generateANDTruthTable();
    }
}
