package com.test.four;
/**
 * The class which call two services and concatenate the response
 * @author Anish
 *
 */
public class StingConcatination {
	
	/**
	 * main method
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String urlOne = "https://cdn.gfkdaphne.com/tests/async.php?a=1";
		String urlTwo = "https://cdn.gfkdaphne.com/tests/async.php?a=2";
		String responseOne = null; 
		try {
			responseOne = HttpMethodsUtil.sendGet(urlOne);
		} catch (Exception e) {
			System.err.println("Error: "+e.getMessage());
		}
		String responseTwo = null;
		try {
			responseTwo = HttpMethodsUtil.sendGet(urlTwo);
		} catch (Exception e) {
			System.err.println("Error: "+e.getMessage());
		}
		if(null!=responseOne && null!=responseTwo) {
			System.out.println(responseOne+" "+responseTwo);
		} else {
			System.err.println("Error occured in: "+responseOne==null? urlOne: urlTwo);
		}
	}
	
		


}
