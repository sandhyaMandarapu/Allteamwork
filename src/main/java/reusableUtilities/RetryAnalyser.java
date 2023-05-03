package reusableUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser {
	/**
	 * @author KT1559
	 * @param this class will re try the failed test scripts due to synchronization or network issues.
	 * 
	 *
	 */
	public class RetryAnalyserImplementation implements IRetryAnalyzer{
		
		int count = 0;
		int retryCount = 4; // manually try and then specify the retry count

		public boolean retry(ITestResult result) {
			
			while(count<retryCount)
			{
				count++;
			}
			return true;
		}
	
	}
}
