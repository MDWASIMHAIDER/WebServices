package com.nt.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;



public class TestClient {

	public static String getResourceClient() throws Exception {
		String sourceUrl="http://localhost:2525/RestEasy-2nd-App-CustomReader-Writer/rest/cust/get";
		URL url=null;
		HttpURLConnection huc=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		String line=null;
		String res=null;
		url=new URL(sourceUrl);
		huc=(HttpURLConnection) url.openConnection();
		huc.setRequestMethod("GET");
		huc.setRequestProperty("Accept", "text/plain");
		
		int status=huc.getResponseCode();
		System.out.println(status);
		if(status==200) {
			is=huc.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			while((line=br.readLine())!=null) {
				 res=line;
				System.out.println(res);
			}
			br.close();
			isr.close();
			is.close();
		}
		return res;
	}
	
	public static void postResourceClient() throws Exception {
		URL url=null;
		HttpURLConnection con=null;
		OutputStream os=null;
		int status=0;
		String input="bharat\n"+"bharat@91\n"+101;
		//String input = "{\"id\":101,\"name\":\"bharat\",\"email\":\"bharat@91\"}";
		//String input = "{\"name\":\"bharat\",\"email\":\"bharat@91\",\"id\":101,}";
		url=new URL("http://localhost:2525/RestEasy-2nd-App-CustomReader-Writer/rest/cust/post");
		con=(HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("content-type","text/plain");
		con.setDoOutput(true);
		status=con.getResponseCode();
		System.out.println(status);
		
		if(status==200) {
			os=con.getOutputStream();
			os.write(input.getBytes());
			os.flush();
		}
		else {
			throw new Exception();
		}
		con.disconnect();
	} 
	
	public static void main(String[] args) throws Exception {
		//System.out.println(getResourceClient());
		postResourceClient();
	//2nd way to develope get mode client
		/*
		try {

			Client client = Client.create();

			WebResource webResource = client
			   .resource("http://localhost:2525/RestEasy-2nd-App-CustomReader-Writer/rest/cust/get");

			ClientResponse response = webResource.accept("text/plain")
	                   .get(ClientResponse.class);

			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Output from Server .... \n");
			System.out.println(output);

		  } catch (Exception e) {

			e.printStackTrace();

		  }

*/	
		
	
	}
	}
