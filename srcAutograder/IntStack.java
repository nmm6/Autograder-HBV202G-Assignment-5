/**
 * A very simple stack for storing the basic type int.
 * The stack has a fixed capacity.
 */
public class IntStack {
	private ResultStorageSingleton resultStorage;
    /**
     * The maximum capacity of the stack.
     * This value is fixed.
     */
    private final int theCapacity = 10;

    /**
     * The data structure used to store the stack.
     * Private, i.e. do not make any assumptions on how the stack is stored.
     */
    private int[] theStack;

    /**
     * Location in theStack array, where next push will insert.
     * 0 means: stack is empty
     */
    private int nextPushLocation; // .

    /**
     * Constructs an empty stack.
     */
    public IntStack() {
    	resultStorage = ResultStorageSingleton.getInstance();
    	resultStorage.incrNewStack();
    	theStack = new int[theCapacity];
        nextPushLocation = 0;
    }

    /**
     * Returns the capacity of the stack.
     * @return the capacity of the stack
     */
    public int getCapacity() {
    	resultStorage.incrGetCapacity();
        return theCapacity;
    }

    /**
     * Returns whether the stack is full.
     * A further push would throw an exception.
     * @return true if the stack is full, false if the stack is not full
     */
    public boolean isFull() {
    	resultStorage.incrIsFull();
        if (nextPushLocation == theCapacity) {
        	resultStorage.incrIsFullTrue();
            return true;
        } else {
        	resultStorage.incrIsFullFalse();
            return false;
        }
    }

    // TODO: Add isEmpty() method
    public boolean isEmpty() {
    	resultStorage.incrIsEmpty();
    	if (nextPushLocation == 0) {
        	resultStorage.incrIsEmptyTrue();
            return true;
        } else {
        	resultStorage.incrIsEmptyFalse();
            return false;
        }
    }
    
    /**
     * Pushes an int on the stack.
     * @param element the int to be pushed on the stack
     * @throws ArrayIndexOutOfBoundsException if the stack was already full
     */
    public void push(int element) throws ArrayIndexOutOfBoundsException {
    	resultStorage.incrPush();
        theStack[nextPushLocation++] = element;
    }

    /**
     * Pops an int from the stack
     * @return the popped int
     * @throws ArrayIndexOutOfBoundsException if the stack was already empty
     */
    public int pop() throws ArrayIndexOutOfBoundsException {
    	resultStorage.incrPop();
        return theStack[--nextPushLocation];
    }

}
