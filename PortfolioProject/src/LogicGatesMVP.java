
/**
 * Proof of concept for simple LogicGates program, which models... well, logic
 * gates.
 *
 * @author Levi Weber
 *
 */
public final class LogicGatesMVP {

    /*
     * Representation field: each "LogicGates" object will involve two booleans
     * for the input data, inputA and inputB (though, NOT gates only use one
     * input, which will be inputA), and perform the specified logicical
     * operation when the ___gate secondary method is called on it. For example,
     * if a LogicGates object has inputA and inputB both as false (their
     * defaults), then using the ANDgate method would return a boolean result of
     * false.
     */

    //States to be used; initialized to false for simplicity.
    private boolean inputA = false;
    private boolean inputB = false;
    private boolean output;

    /*
     * Kernel Methods: All of these are necessary even in proof of concept for
     * even just one or two gate tests.
     */

    /**
     * Gets the state of input A.
     *
     * @return The state of input A.
     */
    public boolean getInputA() {
        return this.inputA;
    }

    /**
     * Gets the state of input B.
     *
     * @return The state of input B.
     */
    public boolean getInputB() {
        return this.inputB;
    }

    /**
     * Sets the state of input A.
     *
     * @param state
     *            The boolean state to set for input A.
     */
    public void setInputA(boolean state) {
        this.inputA = state;
    }

    /**
     * Sets the state of input B.
     *
     * @param state
     *            The boolean state to set for input B.
     */
    public void setInputB(boolean state) {
        this.inputB = state;
    }

    /*
     * Secondary Methods: Only testing three gate types for this proof of
     * concept, NOT, AND, and OR.
     */

    /**
     * Performs the logical AND operation on inputs A and B. Sets the result as
     * the output and returns the result.
     *
     * @return The result of the AND operation.
     */
    public boolean ANDGate() {
        this.output = this.inputA && this.inputB;
        return this.output;
    }

    /**
     * Performs the logical OR operation on inputs A and B. Sets the result as
     * the output and returns the result.
     *
     * @return The result of the OR operation.
     */
    public boolean ORGate() {
        this.output = this.inputA || this.inputB;
        return this.output;
    }

    /**
     * Performs the logical NOT operation on input A ONLY. Sets the result as
     * the output and returns the result.
     *
     * @return The result of the NOT operation.
     */
    public boolean NOTGate() {
        this.output = !this.inputA;
        return this.output;
    }

    //...other gates and secondary methods to be implemented here...

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        /*
         * Put your main program code here
         */
        LogicGatesMVP aB = new LogicGatesMVP();

        aB.setInputA(true);
        aB.setInputB(true);

        boolean trueANDtrueResult = aB.ANDGate();

        System.out.println("Input A: " + aB.getInputA());
        System.out.println("Input B: " + aB.getInputB());
        System.out.println("Output (A AND B): " + trueANDtrueResult);

        LogicGatesMVP justA = new LogicGatesMVP();

        //Set this new A to be aB's InputA value, which is true.
        justA.setInputA(aB.getInputA());

        boolean trueNOTResult = justA.NOTGate();

        //Value of justA should now be false, since true went through inverter.

        System.out.println();
        System.out.println("Input A: " + justA.getInputA());
        System.out.println("Output (NOT A): " + trueNOTResult);
        System.out.println();

        /*
         * Having to create new objects is tedious... maybe this could be done
         * with enums and switch case?
         */
        LogicGatesMVP secondAB = new LogicGatesMVP();
        secondAB.setInputA(justA.getInputA());
        secondAB.setInputB(false);

        /*
         * Next line should return false, since InputA will be false after NOT
         * gate and Input B is false
         */

        boolean falseORtrueResult = secondAB.ORGate();

        System.out.println("Input A: " + secondAB.getInputA());
        System.out.println("Input B: " + secondAB.getInputB());
        System.out.println("Output (A OR B): " + falseORtrueResult);

    }

}
