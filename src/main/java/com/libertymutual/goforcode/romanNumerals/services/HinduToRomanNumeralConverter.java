package com.libertymutual.goforcode.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public HinduToRomanNumeralConverter() {
	
	}

	public String convert(int input) {
		String romanNumeral = "";
		if (input < 1) {
			return "Input a number greater than 1";
		}
		while (input >= 1000) {
	        romanNumeral += "M";
	        input -= 1000;        
	    }
	    while (input >= 900) {
	        romanNumeral += "CM";
	        input -= 900;
	    }
	    while (input >= 500) {
	        romanNumeral += "D";
	        input -= 500;
	    }
	    while (input >= 400) {
	        romanNumeral += "CD";
	        input -= 400;
	    }
		while(input <= 399 && input >= 100) {
			romanNumeral += "C";
			input -= 100;
		}
		if (input >= 90) {
			romanNumeral += "XC";
			input -= 90;
		}
		while(input < 89 && input >= 50) {
			romanNumeral += "L";
			input -= 50;
		}
		if (input >= 40) {
			romanNumeral += "XL";
			input -= 40;
		}
		while(input < 39 && input > 9) {
			romanNumeral += "X";
			input -= 10;
		}
		if (input == 9) romanNumeral += "IX";
		while(input < 9 && input > 4) {
			romanNumeral += "V";
			input -= 5;
		}
		if (input == 4) romanNumeral += "IV";
		while(input < 4 && input > 0) {
			romanNumeral += "I";
			input -= 1;
		}
		
		return romanNumeral;
	}

}
