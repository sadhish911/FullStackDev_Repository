package com.gentech.stringassignment;


public class Assignment10 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("mondaytuesdaywednesdaythursdayfridaysaturdaysunday");
		assignment.deleteday(str);
		assignment.addcomma(str);
	}
}
class assignment
{
	static void deleteday(StringBuffer str)
	{
		StringBuffer res = new StringBuffer(str);
		for(int i = 0;i<res.length();i++) {
			if(res.charAt(i)=='d')
			{
				if(res.charAt(i+1)=='a' && res.charAt(i+2)=='y')
				{
					res.delete(i, i+3);
				}
			}
			
		}
		System.out.println(res);
		
	}
	
	static void addcomma(StringBuffer str)
	{
		StringBuffer res = new StringBuffer(str);
		for(int i = 0;i<res.length();i++) {
			if(res.charAt(i)=='d')
			{
				if(res.charAt(i+1)=='a' && res.charAt(i+2)=='y')
				{
					res.insert(i+3,',');
				}
			}
			
		}
		System.out.println(res);
	}
	
}