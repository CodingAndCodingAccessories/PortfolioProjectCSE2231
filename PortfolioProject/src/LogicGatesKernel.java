import components.standard.Standard;

/**
 * LogicGates kernel component with primary methods.
 *
 * @author Levi Weber
 *
 *
 */
public interface LogicGatesKernel extends Standard<LogicGatesMVP> {

    /**
     * Gets the state of input A.
     *
     * @return The state of input A.
     * @requires input A exists.
     * @ensures The returned value is the current state of input A.
     */
    boolean getInputA();

    /**
     * Gets the state of input B.
     *
     * @return The state of input B.
     * @requires input B exists
     * @ensures The returned value is the state of input B.
     */
    boolean getInputB();

    /**
     * Sets the state of input A.
     *
     * @param state
     *            The state to set for input A.
     * @requires state is a valid boolean value representing the input state.
     * @replaces this.inputA
     * @ensures The state of input A is set to the provided value.
     */
    void setInputA(boolean state);

    /**
     * Sets the state of input B.
     *
     * @param state
     *            The state to set for input B.
     * @requires state is a valid boolean representing the input state.
     * @replaces this.inputB
     * @ensures The state of input B is set to the provided value.
     */
    void setInputB(boolean state);

}
