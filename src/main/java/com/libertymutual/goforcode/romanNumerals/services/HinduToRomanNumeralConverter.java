package com.libertymutual.goforcode.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public HinduToRomanNumeralConverter() {
	
	}

	public String convert(int input) {
		String romanNumeral = "";
		if (input < 1 || input > 3000) {
			return "invalid number input";
		}
		while(input < 399 && input >= 100) {
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
