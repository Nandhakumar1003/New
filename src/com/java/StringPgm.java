package com.java;

public class StringPgm {

	public static void main(String[] args) {
				String s="oops";
				String rev = "";
				int length = s.length();
				System.out.println(length);
				System.out.println("1234");
				
				for (int i=length-1; i>=0;i--) {
					rev = rev+s.charAt(i);
				}
				System.out.println(rev);
		
	}

}
