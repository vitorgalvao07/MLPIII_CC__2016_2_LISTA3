
public class CalculatorTest {
	
	public void evaluatesExpression() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertNotNull(6, sum);
		assertEquals(6, sum);
		
		//System.out.println("");
		}
	
	private void assertNotNull(int i, int sum) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(int i, int sum) {
		// TODO Auto-generated method stub
		
	}

}
