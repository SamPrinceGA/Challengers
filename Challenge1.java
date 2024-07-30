package javaChallenges;

public class Challenge1 {

	public static void main(String[] args) {
		
		/*Given a String consisting of words and spaces, retun the length of the last word in the string. 
		A word is maximal substring consisting of non-space characters only */
		
		String strInput = "Java Challengers using    String function"; //index start from 0,1,2,3,4
		String arrData[] = strInput.split(" "); //0-Java,1-Challengers,2,3,4-function
		int iLength = arrData.length-1;//5-1==4
		String strOutput = arrData[iLength];//arrData[4]
		int lenOutput = arrData[iLength].length();
		
		
		System.out.println(strOutput);
		System.out.println(lenOutput);
		

	}

}
