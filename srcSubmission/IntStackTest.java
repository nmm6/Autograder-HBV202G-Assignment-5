import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {

	private IntStack stack;
	
	@Before
	public void setUp() throws Exception {
		stack= new IntStack();
	}
	
    @Test
    public void testNewStackIsNotFull() {

        assertFalse(stack.isFull());
    }
    
    @Test
    public void testFullStackIsFull() {
    	for (int i = 0; i < stack.getCapacity(); i++) {
    		stack.push(11);
    	}
    	assertTrue(stack.isFull());
    }
    
    @Test
    public void testStackIsFull() {
    	for (int i = 0; i < stack.getCapacity(); i++) {
    		assertFalse(stack.isFull());
    		stack.push(11);
    	}
    }
    
    @Test
    public void testPopReturnsPushedValue() {
    	stack.push(32);
    	stack.push(11);
    	assertEquals(11, stack.pop());
    	assertEquals(32, stack.pop());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopOnEmptyStack() {
    	stack.pop();
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPushOnFullStack() {
    	try {
    		for (int i = 0; i < stack.getCapacity(); i++) {
    			stack.push(11);
    		}
    	} catch (Exception e) {
    		fail("Exception occured but stack is not yet full.");
    	}
    	stack.push(11);
    }
    
    @Test
    public void testIsEmpty() {
    assertTrue(stack.isEmpty());
    stack.push(11);
    assertFalse(stack.isEmpty());
    }
   
}
