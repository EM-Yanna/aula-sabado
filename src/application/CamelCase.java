package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CamelCase {
	public static List<String> converterCamelCase(String original) {
		return splitString(original);
	}
	
	private static List<String> splitString(String original) {
		List<String> splittedString = new ArrayList<String>();
		int posicao;
		char letras[] = original.toCharArray();
		posicao = getCapitalPosition(letras);
		if(posicao != 0) {
			splittedString.add(original.substring(0, posicao));			
		}
		splittedString.add(original.substring(posicao));
		return toLowerCaseSplittedString(splittedString);
	}

	private static boolean isCapital (char c) {
		if(c >= 65 && c <= 90) {
			return true;
		}
		return false;
	}
	
	private static int getCapitalPosition(char[] letras) {
		int pos = 0;
		for (char c : letras) {
			if(isCapital(c)) {
				return pos;
			}
			pos++;
		}
		return 0;
	}
	
	private static List<String> toLowerCaseSplittedString(List<String> splittedList) {
		List<String> lowerCaseSplittedList = new ArrayList<>();
		for (String string : splittedList) {
			lowerCaseSplittedList.add(string.toLowerCase());
		}
		return lowerCaseSplittedList;
	}
}