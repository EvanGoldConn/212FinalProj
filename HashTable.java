import java.io.*;
public class HashTable{
	private Person[] table;
	private int N;
	private char[] letters;

	public HashTable(){
		N = 26;
		table = new Person[2000];
		letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	}

	private int helper(char c){
		for(int i = 1; i < 27; i++){
			if(c == letters[i])
				return i;
		}

	}
	private int hornerHash(String s){
		String lowerCase = s.toLowerCase();
		int hashVal = 0;
		for(int i = 0; i < s.length; i++){
			hashVal = (hashVal*26+helper(lowerCase.charAt(i)))%N;
		}
		return hashVal;
	}

	public void addPerson(Person person){
		int key = person.getEmailKey();
		int hashKey = hornerHash(key);
		table[hashKey] = person;

	}

	public String deleteAccount(Person person){
		int key = person.getEmailKey();
		int hashKey = hornerHash(key);
		table[hashKey] = null;
	}

}


class hashTest{
	public static void main(String[] args){
		




		
	}
}
