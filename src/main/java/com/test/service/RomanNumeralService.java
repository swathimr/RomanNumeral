package com.test.service;

import com.test.domain.RomanResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RomanNumeralService {

  private Logger logger = LoggerFactory.getLogger(RomanNumeralService.class);

  /**
   * Takes the input integer and converts to roman numeral
   * @param num
   * @return
   */
  public RomanResponse calculateRomanNumeral(int num) {

    String romanVal = intToRoman(num);
      if(num<0) {
        throw new NumberFormatException("Number to convert roman numeral must be greater than 0");
      }
      return RomanResponse.builder().romanVal(romanVal).build();
  }

  /**
   * Helper method that converts to roman numeral
   * @param num
   * @return
   */
  private String intToRoman(int num) {
    String[] str = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int[] val = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < val.length; i++) {
      while (num >= val[i]) {
        num -= val[i];
        sb.append(str[i]);
      }
    }
    return sb.toString();
  }

}
