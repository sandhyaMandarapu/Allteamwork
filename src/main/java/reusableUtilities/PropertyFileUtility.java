package reusableUtilities;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	/**
	 * @author Sultan(9511)
	 * @CreatedDate 03-05-2023
	 * @param This class contains all the generic methods to read the data from property file.
	 * @outputparam  returns particular datatypes
	 */
	public class PropertyFileUtility {
		
		/**
		 * This method will read the specific key value from the property file
		 * @param key
		 * @return
		 * @throws IOException
		 */
		public String readDataFromPropertyFile(String key) throws IOException
		{
			FileInputStream fis = new FileInputStream(ConstantsUtility.PropertyFilePath);
			Properties pObj = new Properties();
			pObj.load(fis);
			String value = pObj.getProperty(key);
			return value;
		}
		
		

	}



