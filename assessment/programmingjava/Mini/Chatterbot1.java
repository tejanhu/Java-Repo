
//
// Program Name: chatterbot2
// Description: this is an improved version of the previous chatterbot program "chatterbot1"
// this one will try a little bit more to understand what the user is trying to say
//
// Author: Gonzales Cenelia
//

import java.io.*;
import java.util.*;



public class Chatterbot1 {

	static String[][] KnowledgeBase = {
		{"WHAT IS YOUR NAME", 
		 "MY NAME IS CHATTERBOT2."
		},
		
		{"HI", 
		 "HI THERE!",
		},
		
		{"HOW ARE YOU", 
		 "I'M DOING FINE!"
		},
		  
		{"WHO ARE YOU", 
		 "I'M AN A.I PROGRAM."
		},

		{"ARE YOU INTELLIGENT", 
		 "YES,OFCORSE."
		},
		   
		{"ARE YOU REAL", 
		 "DOES THAT QUESTION REALLY MATERS TO YOU?"
		}
	};
	
	static String findMatch(String str) {
		String result = "";
		for(int i = 0; i < KnowledgeBase.length; ++i) {
			if(KnowledgeBase[i][0].equalsIgnoreCase(str)) {
				result = KnowledgeBase[i][1];
				break;
			}
		}
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		while(true) {
			System.out.print(">");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String sInput = in.readLine();
			String sResponse = findMatch(sInput);
			if(sInput.equalsIgnoreCase("BYE")){
				System.out.println("IT WAS NICE TALKING TO YOU USER, SEE YOU NEXT TIME!");
				break;
			} else if(sResponse.length() == 0) {
				System.out.println("I'M NOT SURE IF I UNDERSTAND WHAT YOU  ARE TALKING ABOUT.");
			} else {
				System.out.println(sResponse);
			}
		}
	}	
}


