package com.test;

import com.test.service.RomanNumeralService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class RomanNumeralServiceTest {

  private RomanNumeralService romanNumeralService;

  @Before
  public void init() {
    romanNumeralService = new RomanNumeralService();
  }

  @Test(expected = NumberFormatException.class)
  public void testNegativeNumber() {
    romanNumeralService.calculateRomanNumeral(-1);
  }

  @Test(expected = NumberFormatException.class)
  public void testZero() {
    romanNumeralService.calculateRomanNumeral(0);
  }

  @Test
  public void getRomanConversion399() {
    String actual = romanNumeralService.calculateRomanNumeral(399).getRomanVal();
    String expected = "CCCXCIX";
    Assert.assertEquals(actual,expected);
  }

  @Test
  public void getRomanConversion3992() {
    String actual = romanNumeralService.calculateRomanNumeral(3992).getRomanVal();
    String expected = "MMMCMXCII";
    Assert.assertEquals(expected, actual);
  }

}
