import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.AfterClass;

@RunWith(Suite.class)
@SuiteClasses({ IntStackTest.class})

public class AllTests {
	/**
	 * Executed after all tests of the test suite have been executed. Student
	 * submission would use a "normal" AllTests.java that would then be replaced by a
	 * version that adds the afterClass() method.
	 */
	@AfterClass
	public static void afterClass() {
		ResultStorageSingleton results = ResultStorageSingleton.getInstance();
		
		System.out.println("Method isFull was called as expected: " + (results.getIsFull() == 12));
		
		System.out.println("Method isFull()=True was called as expected: " + (results.getIsFullTrue()== 1));
		
		System.out.println("Method isFull()=False was called as expected: " + (results.getIsFullFalse() == 11));
		
		System.out.println("Method getCapacity was called as expected: " + (results.getGetCapacity() == 33));
		
		System.out.println("Method push was called as expected: " + (results.getPush() == 34));
		
		System.out.println("Method pop was called as expected: " + (results.getPop() == 3));
		
		System.out.println("Method isEmpty was called as expected: " + (results.getIsEmpty() == 2));

		System.out.println("Method isEmpty()=True was called as expected: " + (results.getIsEmptyTrue() == 1));

		System.out.println("Method isEmpty()=False was called as expected: " + (results.getIsEmptyFalse() == 1));
		
		System.out.println("New stack was created as expected: " + (results.getNewStack() == 7));
		System.out.println();
		
		// testNewStackIsNotFull() (1 call), testFullStackIsFull() (1 call), testStackIsFull() (1 call) ==> 12 calls
		System.out.println("Method isFull was called: " + results.getIsFull() + " times. (12 expected)");
		// testFullStackIsFull() (1 call)
		System.out.println("Method isFull was called with return value True: " + results.getIsFullTrue() + " time(s). (1 expected) ");
		// testNewStackIsNotFull() (1 call), testStackIsFull() (10 calls) ==> 11 calls
		System.out.println("Method isFull was called with return value False: " + results.getIsFullFalse() + " times. (11 expected) ");
		
		// testFullStackIsFull() (11 calls), testStackIsFull() (11 calls), testPushOnFullStack() (11 calls) ==> 33 calls
		System.out.println("Method getCapacity was called: " + results.getGetCapacity() + " times. (33 expected) ");
		
		// testPopReturnsPushedValue() (2 calls), testPushOnFullStack() (11 calls), testIsEmpty (1 call)
		// testFullStackIsFull() (10 calls), testStackIsFull() (10 calls) ==> 34
		System.out.println("Method push was called: " + results.getPush() + " times. (34 expected) ");
		
		// testPopReturnsPushedValue() (2 calls), testPopOnEmptyStack() (1 call) ==> 3
		System.out.println("Method pop was called: " + results.getPop() + " times. (3 expected) ");
		
		// testIsEmpty() (2 calls) ==> 2
		System.out.println("Method isEmpty was called: " + results.getIsEmpty() + " times. (2 expected) ");
		// testIsEmpty() (1 call)
		System.out.println("Method isEmpty was called with return value True: " + results.getIsEmptyTrue() + " time. (1 expected) ");
		// testIsEmpty() (1 call)
		System.out.println("Method isEmpty was called with return value False: " + results.getIsEmptyFalse() + " time. (1 expected) ");
		
		// Once for every test case ==> 
		System.out.println("New stack was created: " + results.getNewStack() + " times. (7 expected) ");
				
	}
}