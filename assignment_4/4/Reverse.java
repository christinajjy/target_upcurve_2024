import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Reverse{
	public static void main(String args[]){
		System.out.println("enter a string");
		Reverse r = new Reverse();
		r.reverseByWords("hello i am christina");
		r.reverseByWords("i am glad to meet you ");
		r.reverseByWords("would you like some tea");
		r.reverseByWords("where are you");
		
	}	
	public String reverseByWords(String s){
		ArrayList<String> a = new ArrayList<>();
		String word = "";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '||i==s.length()-1){
				if(i==s.length()-1)
					word = word+s.charAt(i);
				a.add(word);
				word = "";
			}
			else{
				word = word+s.charAt(i);
			}
		}
		Object[] obj = a.toArray();
		for(int i=obj.length-1;i>=0;i--)
			System.out.print(obj[i]+" ");
		System.out.println();

		return null;	

	}
}
