import java.util.ArrayList;


public class Test {
    public static void main(String [] args) {
//        System.out.println(reverseString("Howdy"));
//        System.out.println(isSquare(4));
//        System.out.println(isSquare(11));
//        System.out.println(isSquare(0));
//        System.out.println(isUnique("asgflhgdfo"));
//        System.out.println(isUnique("asdfghjkl"));
//    	System.out.println(removeDupes("abc"));
//    	System.out.println(removeDupes("dogmeat"));
    	//permutation2("abc");
    	String str = "abc";
    	System.out.println(str.substring(3));
    	
    }
	

    public static void permutation(String str) { 
    	ArrayList<String> permutations = new ArrayList<String>();
        permutations = permutation("", str);
        System.out.println(permutations.toString());
    }

    private static ArrayList<String> permutation(String prefix, String str) {
    	ArrayList<String> permutations = new ArrayList<String>();
        int n = str.length();
        if (n == 0) {
        	permutations.add(prefix);
        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
        }
		return permutations;
    }
    
    public static void permutation2(String str) { 
        permutation2("", str); 
    }

    private static void permutation2(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation2(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
        }
    }
    
    
/*    public static String removeDupes(String input) {
    	StringBuilder output = new StringBuilder();
    	for (int i=0;i < input.length();i++) {
    		String temp1 = new String(input.charAt(i)+"");
    		if (output.indexOf(temp1) == -1) {
    			output.append(input.charAt(i));
    		}
    	}
    	return output.toString();
    }
    
	public static String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int lastIndex = str.length() - 1;
		for (int i=0;i<str.length()/2;i++) {
			char temp = charArray[i];
			charArray[i] = charArray[lastIndex-i];
			charArray[lastIndex-i] = temp;
		}
		String reversed = new String(charArray);
		return reversed;
	}
	
	public static boolean isSquare(int input) {
		int a = 0;
		while(true) {
			if (a*a == input) {
				return true;
			}
			else if (a*a > input){
				return false;
			}
			a++;
		}
	}
	
	public static boolean isUnique(String input) {
		boolean[] ascii = new boolean[257];
		for (int i=0;i<input.length();i++) {
			if (ascii[input.charAt(i)] == false) {
				ascii[input.charAt(i)] = true;
			}
			else {
				return false;
			}
		}
		return true;
	}*/
}
