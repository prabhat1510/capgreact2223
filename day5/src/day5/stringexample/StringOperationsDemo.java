package day5.stringexample;

public class StringOperationsDemo {

	public static void main(String[] args) {
		// 01234 --- start index position is 0 and end position is length-1
		String s = "hello";
		System.out.println("Length or size of the hello string----" + s.length());
		System.out.println("Index of character 'e' in hello----" + s.indexOf('e'));
		System.out.println("Index of character 'l' in hello----" + s.indexOf('l'));
		System.out.println("Index of character 'l' in hello----" + s.lastIndexOf('l'));
		System.out.println("Substring from the hello ----" + s.substring(1));
		System.out.println("Substring from the hello ----" + s.substring(1, 3));

		String hi = "Hi   ";
		System.out.println(hi);
		/**
		 * a string whose value is this string, with all leading and trailing space
		 * removed, or this string if it has no leading or trailing space.
		 */
		System.out.println("Remove spcaes----" + hi.trim());
		// valueOf - Converts data to String
		int num = 12345;
		String numStr = String.valueOf(num);
		System.out.println(numStr);
		System.out.println(numStr instanceof String);
		/**
		String emptyString = null;
		System.out.println(emptyString.isEmpty());// NullPointerException
		**/
		String emptyString="";
		System.out.println("********************************");
		checkStringForEmpty(emptyString);
		System.out.println("********************************");
		//Java 6 onwards we have isEmpty method 
		System.out.println(emptyString.isEmpty());
		System.out.println(s.hashCode());
		//System.out.println(s);
		s=s.concat(" Everyone");
		System.out.println(s);
		System.out.println(s.hashCode());
		
		String leadingSpace ="   Morning";
		// trim() will remove Leading as well as trailing whitespace
		System.out.println(leadingSpace.trim()); 
		String strStrip = " Hello World !!   ";
		// It returns a string whose value is given string, 
		//with all leading and trailing white space removed.
		System.out.println(strStrip.strip());
		System.out.println("****************************************");
		System.out.println(strStrip.stripLeading());
		System.out.println(strStrip.stripTrailing());
		// this will give you same results as strip() method
		System.out.println(strStrip.trim());
		strStrip = strStrip.replaceAll("\\s", "");
		System.out.println("After removing all white spaces ----"+strStrip);
		System.out.println(strStrip.toLowerCase());
		System.out.println(strStrip.toUpperCase());
					 //012345	
		String fruit ="Ap ple";
		System.out.println(fruit.length());
		System.out.println(fruit.indexOf('l'));
		//Api for paragraphs -- NO
		String paragraph="Hello Everyone, today is very wonderful sunny day. We are learning String concepts. Here we are learning now about paragraph.";
		System.out.println(paragraph.split("[.]"));
		String[] splittedParagraph = paragraph.split("[.]");

		for(String sentence:splittedParagraph){
			System.out.println(sentence);
		}
		
	}
	
	private static void checkStringForEmpty(String emptyString) {
		if(emptyString.equals("")) {
			System.out.println("String provided is an empty string");
		}else {
			System.out.println("String provided is not an empty string");
		}
	}

}
