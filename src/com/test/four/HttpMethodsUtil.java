package com.test.four;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * The util class to make HTTP calls
 * @author Anish
 *
 */
public class HttpMethodsUtil {
	/**
	 * The method to make get call
	 * @param url
	 * @return
	 * @throws Exception
	 */
	public static String sendGet(String url) throws Exception {
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		int responseCode = con.getResponseCode();
		System.out.println("Response Code for the url:"+url +" : " + responseCode);
		if(responseCode==200) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			return response.toString();
		} else {
			System.err.println("Invalid Response: "+responseCode);
			throw new InvaliedResponseCodeException();
		}

	}

}
