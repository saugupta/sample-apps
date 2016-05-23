package com.kmalik.sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utilities {
	 public static String executeCommand(String command) {
	      StringBuffer output = new StringBuffer();

	      Process p;
	      try {
	          p = Runtime.getRuntime().exec(command);

	          BufferedReader reader = new BufferedReader(new InputStreamReader(
	                  p.getInputStream()));
	          //p.waitFor();
	          String line = "";
	          while ((line = reader.readLine()) != null) {
	              output.append(line + "\n");
	          }

	      } catch (Exception e) {
	          e.printStackTrace();
	      }

	      return output.toString();

	  }
}
