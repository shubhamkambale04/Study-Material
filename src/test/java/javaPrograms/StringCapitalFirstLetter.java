package javaPrograms;

public class StringCapitalFirstLetter {
	public static void main(String[] args) {

		String s="my name is shubham";
		String words[]=s.split(" ");  
	    String capitalizeWord="";
	    
	    for(String word:words){  
	        String first=word.substring(0,1);  
	        String afterfirst=word.substring(1);  
	        capitalizeWord=capitalizeWord+first.toUpperCase()+afterfirst+" ";  
	    }  
	    System.out.println(capitalizeWord);
	}
}
