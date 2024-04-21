package jhona;

import java.util.Scanner;

public class Ques5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		
		String[] s=string.split(",");
		String s1=s[0];
		String s2=s[1].toLowerCase();
		if(s1.charAt(s1.length()-1)==s2.charAt(0)) {
			String str=s1.substring(0, s1.length()-1);
			System.out.println(str.toLowerCase()+s2.toLowerCase());
		}else {
		System.out.println(s[0].toLowerCase()+" "+s[1].toLowerCase());
		
	}
}}
