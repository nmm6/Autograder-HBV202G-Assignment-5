/**
 * Class for storing results from the class that gets tested be the submitted
 * JUnit tests.
 * 
 * This class uses the singleton design pattern, so that it can be used by all
 * instance of the class that gets tested. => Instantiate via getInstance()
 * 
 *
 */
public class ResultStorageSingleton {
	private static ResultStorageSingleton theInstance = null;

	private int isFull;
	private int isFullTrue;
	private int isFullFalse;
	
	private int getCapacity;
	
	private int push;
	
	private int pop;
	
	private int isEmpty;
	private int isEmptyTrue;
	private int isEmptyFalse;
	
	private int newStack;

	public static ResultStorageSingleton getInstance() {
		if (theInstance == null) { // Lazy instantiation
			theInstance = new ResultStorageSingleton();
		}
		return theInstance;
	}

	protected ResultStorageSingleton() { // Class may not be instantiated by others
	};

	/**
	 * Return how often the isFull method was called
	 */
	public int getIsFull() {
		return isFull;
	}

	/**
	 * Increment how often the isFull method was called
	 */
	public void incrIsFull() {
		isFull++;
	}
	
	/**
	 * Return how often the isFull method was called with return value True
	 */
	public int getIsFullTrue() {
		return isFullTrue;
	}

	/**
	 * Increment how often the isFull method was called with return value True
	 */
	public void incrIsFullTrue() {
		isFullTrue++;
	}
	
	/**
	 * Return how often the isFull method was called with return value False
	 */
	public int getIsFullFalse() {
		return isFullFalse;
	}

	/**
	 * Increment how often the isFull method was called with return value False
	 */
	public void incrIsFullFalse() {
		isFullFalse++;
	}
	
	/**
	 * Return how often the getCapacity() method was called
	 */
	public int getGetCapacity() {
		return getCapacity;
	}

	/**
	 * Increment how often the getCapacity() method was called
	 */
	public void incrGetCapacity() {
		getCapacity++;
	}
	
	/**
	 * Return how often the push(int) method was called
	 */
	public int getPush() {
		return push;
	}

	/**
	 * Increment how often the push(int) method was called
	 */
	public void incrPush() {
		push++;
	}
	
	/**
	 * Return how often the pop() method was called
	 */
	public int getPop() {
		return pop;
	}

	/**
	 * Increment how often the pop() method was called
	 */
	public void incrPop() {
		pop++;
	}
	
	/**
	 * Return how often the isEmpty method was called
	 */
	public int getIsEmpty() {
		return isEmpty;
	}

	/**
	 * Increment how often the isEmpty method was called
	 */
	public void incrIsEmpty() {
		isEmpty++;
	}
	
	/**
	 * Return how often the isEmpty method was called with return value True
	 */
	public int getIsEmptyTrue() {
		return isEmptyTrue;
	}

	/**
	 * Increment how often the isEmpty method was called with return value True
	 */
	public void incrIsEmptyTrue() {
		isEmptyTrue++;
	}
	
	/**
	 * Return how often the isEmpty method was called with return value False
	 */
	public int getIsEmptyFalse() {
		return isEmptyFalse;
	}

	/**
	 * Increment how often the isEmpty method was called with return value False
	 */
	public void incrIsEmptyFalse() {
		isEmptyFalse++;
	}
	
	/**
	 * Return how often a new stack was created
	 */
	public int getNewStack() {
		return newStack;
	}

	/**
	 * Increment how often a new stack was created
	 */
	public void incrNewStack() {
		newStack++;
	}
	

	
}
