package com.gentech.bytebufferedassignment;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Assignment7 {

	public static void main(String[] args) {
		buffereda7();
	}
	
	private static void buffereda7()
	{
		BufferedWriter bw = null;
		try
		{
			bw = new BufferedWriter(new FileWriter("W:\\Gentech\\FileDemo\\form.html"));
			
			bw.write("<!DOCTYPE html>");
			bw.write("<html lang=\"en\">");
			bw.write("<head>");
			bw.write("<title>Document</title>");   
			bw.write("</head>");
			bw.write("<body>");
			bw.write("<fieldset>"); 
			bw.write("<form>"); 
			bw.write("<legend>Registration</legend>");  
			bw.write("<input type=\"text\" name=\"Name\" placeholder=\"Enter your name\"></input>");  
			bw.write("<br/>"); 
			bw.write("<br/>"); 
			bw.write("<input type=\"email\" name=\"mail\" placeholder=\"Enter your email\"></input>"); 
			bw.write("<br/>"); 
			bw.write("<br/>"); 
			bw.write("<input type=\"password\" name=\"Password\" placeholder=\"Create Password\"></input>"); 
			bw.write("<br/>"); 
			bw.write("<br/>"); 
			bw.write("<input type=\"password\" name=\"PasswordRe\" placeholder=\"Confirm Password\"></input>"); 
			bw.write("<br/>"); 
			bw.write("<br/>"); 
			bw.write(" <input type=\"checkbox\" name=\"terms\" required=\"\"></input> I accept all terms and condition");
			bw.write("<br/>"); 
			bw.write("<br/>"); 
			bw.write("<input type=\"submit\" name=\"Register Now\" value=\"Register Now\"></input>");  
			bw.write("</form>"); 
			bw.write("</fieldset>"); 
			bw.write("</body>");
			bw.write("</html>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
