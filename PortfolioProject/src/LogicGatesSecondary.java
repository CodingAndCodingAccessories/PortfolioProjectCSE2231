/**
 * Implementations of secondary methods for {@code LogicGates}.
 *
 * @author Levi Weber
 *
 *
 */
public abstract class LogicGatesSecondary implements LogicGates {

    /*
     * Public members ---------------------------------------------------------
     */

    /*
     * Common methods (from Object) -------------------------------------------
     */

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public boolean equals(Object obj) {

        boolean equalsResult = false;
        if (this == obj) {
            equalsResult = true;
        }

        LogicGatesMVP other = (LogicGatesMVP) obj;

        /*
         * If the two inputs of the logic gates aren't the same, they clearly
         * aren't equal. This is essentially a table to reference and check that
         * the inputs of one gate match BOTH the inputs of the other.
         */

        // Compare input values using a single switch statement
        switch (this.getInputA() + ":" + this.getInputB() + ":"
                + other.getInputA() + ":" + other.getInputB()) {

            //Both have both inputs as true
            case "true:true:true:true":

                //Both have both inputs as false
            case "false:false:false:false":

                //Both have input A true, input B as false
            case "true:false:true:false":

                //Both have input A false, input B as true
            case "false:true:false:true":
                equalsResult = true;
                break;

            //Otherwise, inputs are mismatched, so they aren't equal.
            default:
                equalsResult = false;
        }

        return equalsResult;
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public String toString() {

        //This simply reports the current inputs of the LogicGates object as a string.
        return "Input A: " + this.getInputA() + ", Input B: "
                + this.getInputB();
    }

    /*
     * Not going to implement hashCode(), since my override of equals() does not
     * rely on it.
     */

    /*
     * Other non-kernel methods -------------
     */

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public boolean ANDGate() {

        /*
         * Checking precondition: Check if the LogicGates object is initialized
         */
        assert this != null : "LogicGate object is not initialized";

        // Retrieve input states using kernel methods
        boolean inputA = this.getInputA();
        boolean inputB = this.getInputB();

        // Perform logical AND operation
        boolean result = inputA && inputB;

        // Return the result
        return result;
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public boolean ORGate() {

        // Retrieve input states using kernel methods
        boolean inputA = this.getInputA();
        boolean inputB = this.getInputB();

        // Perform logical OR operation
        boolean result = inputA || inputB;

        // Return the result
        return result;
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public boolean NOTGate() {

        //Checking precondition.
        assert this != null : "LogicGate object is not initialized";

        // Get the value of inputA
        boolean inputA = this.getInputA();
        // Perform NOT operation
        return !inputA;
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public boolean XORGate() {

        //Checking precondition.
        assert this != null : "LogicGate object is not initialized";

        boolean inputA = this.getInputA();
        boolean inputB = this.getInputB();
        return (inputA && !inputB) || (!inputA && inputB);
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public boolean NANDGate() {

        //Checking precondition.
        assert this != null : "LogicGate object is not initialized";

        boolean inputA = this.getInputA();
        boolean inputB = this.getInputB();
        return !(inputA && inputB);
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public boolean NORGate() {

        //Checking precondition.
        assert this != null : "LogicGate object is not initialized";

        boolean inputA = this.getInputA();
        boolean inputB = this.getInputB();
        return !(inputA || inputB);
    }

}
