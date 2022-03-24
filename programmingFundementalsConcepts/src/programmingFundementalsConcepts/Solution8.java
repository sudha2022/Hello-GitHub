
/*Write a program that counts the occurrences of each word in
 *  a text file (the_prince_quotes.txt in the same repository).
 *   Make it case-insensitive by converting each word to lower case before counting
     Involves text file reading, using String's .split() method,
       using HashMap to store the word to count mapping
 * 
 * */
package programmingFundementalsConcepts;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
	public class Solution8 {
	
	static void CountWords(String filename, Map< String, Integer> words) throws FileNotFoundException
	{
		
	Scanner file=new Scanner (new File("C:\\Users\\SudhaPotla\\OneDrive - Xpanxion\\Desktop\\Sudha.txt"));
	while(file.hasNext()){
	String word=file.next();
	Integer count=words.get(word);
	if(count!=null) {
	count++;
	}else
	count=1;
	words.put(word, count);
	}
	file.close();
	}
	public static void main(String[] args) throws FileNotFoundException 
	{
	Map<String,Integer> words=new HashMap<String, Integer>();
		CountWords("Sudha.txt",words);
	
	System.out.println(words);
	}
	}