/**
 * {@code LogicGatesKernel} enhanced with secondary methods.
 *
 * @author Levi Weber
 *
 *
 */
public interface LogicGates extends LogicGatesKernel {

    /**
     * Performs the logical AND operation on inputs A and B, and reports the
     * result.
     *
     * @return The result of the AND operation.
     * @requires The logic gate has valid boolean input states for both input A
     *           and input B.
     * @updates this.output
     * @ensures The output is the boolean result of the logical AND operation on
     *          input A and input B.
     */

    boolean ANDGate();

    /**
     * Performs the logical OR operation on inputs A and B, and reports the
     * result.
     *
     * @return The result of the OR operation.
     * @requires The LogicGates object exists and the logic gate has valid
     *           boolean input states for both input A and input B.
     * @updates this.output
     * @ensures The output is the boolean result of the logical OR operation on
     *          input A and input B.
     */
    boolean ORGate();

    /**
     * Performs the logical NOT operation on input A, and reports the result.
     *
     * @return The result of the NOT operation.
     * @requires The LogicGates object exists and the logic gate has a valid
     *           boolean input state for input A.
     * @updates this.output
     * @ensures The output is the result of the logical NOT operation on input
     *          A.
     */
    boolean NOTGate();

    /**
     * Performs the logical XOR operation on inputs A and B, and reports the
     * result.
     *
     * @return The result of the XOR operation.
     * @requires The LogicGates object exists and the logic gate has valid
     *           boolean input states for both input A and input B.
     * @updates this.output
     * @ensures The output is the result of the logical XOR operation on input A
     *          and input B.
     */
    boolean XORGate();

    /**
     * Performs the logical NAND operation on inputs A and B, and reports the
     * result.
     *
     * @return The result of the NAND operation.
     * @requires The LogicGates object exists and the logic gate has valid
     *           boolean input states for both input A and input B.
     * @updates this.output
     * @ensures The output is the result of the logical NAND operation on input
     *          A and input B.
     */
    boolean NANDGate();

    /**
     * Performs the logical NOR operation on inputs A and B, and reports the
     * result.
     *
     * @return The result of the NOR operation.
     * @requires The logic gate has valid boolean input states for both input A
     *           and input B.
     * @updates this.output
     * @ensures The output is the result of the logical NOR operation on input A
     *          and input B.
     */
    boolean NORGate();

}
