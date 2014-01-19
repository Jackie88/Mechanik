package CommandFinder;

public class valueFinder {
	public static String findValue(String[] inputExpression){
		
		String foundValue = "-1";
		String[][] numbersWordList = new String[11][2];	
		
		numbersWordList[0][0]="0";
		numbersWordList[0][1]="zero";
		numbersWordList[1][0]="1";
		numbersWordList[1][1]="jeden";
		numbersWordList[2][0]="2";
		numbersWordList[2][1]="dwa";
		numbersWordList[3][0]="3";
		numbersWordList[3][1]="trzy";
		numbersWordList[4][0]="4";
		numbersWordList[4][1]="cztery";
		numbersWordList[5][0]="5";
		numbersWordList[5][1]="pi[eê][æc]";
		numbersWordList[6][0]="6";
		numbersWordList[6][1]="sze[sœ][cæ]";
		numbersWordList[7][0]="7";
		numbersWordList[7][1]="siedem";
		numbersWordList[8][0]="8";
		numbersWordList[8][1]="osiem";
		numbersWordList[9][0]="9";
		numbersWordList[9][1]="dziewi[eê][cæ]";
		numbersWordList[10][0]="10";
		numbersWordList[10][1]="dziesi[eê][cæ]";
		
		
		for (String s1 : inputExpression){
			for(int i = 0; i<=10; i++){
				for(String j : numbersWordList[i]){
					if(s1.matches(j)) foundValue=Integer.toString(i);
				}
			}
		}
		return foundValue;
	}
}
