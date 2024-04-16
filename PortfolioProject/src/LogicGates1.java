import components.map.Map;
import components.map.Map1L;

/**
 * {@code LogicGates} represented as a {@code map} of input variables and their
 * boolean states, with implementations of kernel methods and standard methods.
 *
 * @convention The map, inputsMap, will only have two pairs (for the two inputs
 *             of most gates) for its keys and two booleans for the
 *             corresponding values.
 *
 * @correspondence The map, inputsMap, has Strings as its keys (the input name,
 *                 typically "A" or "B" but no reason why it couldn't be more
 *                 than one letter so that's why I chose String instead of char)
 *                 and booleans as its values.
 *
 * @author Levi Weber
 *
 */

public class LogicGates1 extends LogicGatesSecondary {

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.inputsMap = new Map1L<>();
    }

    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     *
     * @ensures this = {} // Ensure the object is initialized to a valid state
     */
    public LogicGates1() {
        this.inputsMap = new Map1L<String, Boolean>(); // Initialize the map
        this.inputsMap.add("A", false);
        this.inputsMap.add("B", false);
    }

    /**
     * Constructor resulting in the initialization of the map with specified
     * inputs.
     *
     * @param initialInputs
     *            initial inputs to be stored in the map
     * @requires initialInputs != null
     * @ensures this = initialInputs
     */
    public LogicGates1(Map1L<String, Boolean> initialInputs) {
        assert initialInputs != null : "Violation of: initialInputs is not null";
        this.inputsMap = initialInputs; // Initialize the map with the provided inputs
    }

    /*
     * Standard methods -------------------------------------------------------
     */

    //Wanting LogicGatesMVP rather than LogicGatesSecondary??
    @Override
    public void clear() {
        this.createNewRep();

    }

    @Override
    public final LogicGatesMVP newInstance() {
        return new LogicGatesMVP();
    }

    @Override
    public void transferFrom(LogicGatesMVP source) {
        // See below.

    }

    /*
     * Getting a casting error for this method; it's having issues going from
     * LogicGatesMVP to LogicGates1. Why are these standard methods even using
     * LogicGatesMVP in the first place? Shouldn't they use LogicGatesSecondary?
     *
     * @Override public void transferFrom(LogicGatesMVP source) { LogicGates1
     * localSource = (LogicGates1) source; this.inputsMap =
     * localSource.inputsMap; localSource.createNewRep(); }
     */

    /*
     * Kernel Methods --------------------------------------------------------
     */

    // Map to store input variables and their boolean states
    private Map<String, Boolean> inputsMap;

    @Override
    public boolean getInputA() {

        return this.inputsMap.value("A");

    }

    @Override
    public boolean getInputB() {
        return this.inputsMap.value("B");
    }

    @Override
    public void setInputA(boolean value) {
        if (this.inputsMap.hasKey("A")) {
            this.inputsMap.remove("A");
        }

        this.inputsMap.add("A", value);
    }

    @Override
    public void setInputB(boolean value) {
        if (this.inputsMap.hasKey("B")) {
            this.inputsMap.remove("B");
        }
        this.inputsMap.add("B", value);
    }

}
