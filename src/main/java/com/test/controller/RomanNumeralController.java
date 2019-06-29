package com.test.controller;

import com.test.domain.RomanResponse;
import com.test.service.RomanNumeralService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/")
public class RomanNumeralController {

  private RomanNumeralService romanNumeralService;
  private Logger logger = LoggerFactory.getLogger(RomanNumeralController.class);

  @Autowired
  public RomanNumeralController(RomanNumeralService romanNumeralService) {
    this.romanNumeralService = romanNumeralService;
  }

  /**
   * Get api to convert integer to roman numeral
   * @param query
   * @return
   */
  @GetMapping(value = "/romannumeral", produces = MediaType.APPLICATION_JSON_VALUE)
  public RomanResponse getRomanNumeral(@RequestParam(value = "query") Integer query) {
    logger.info("Get roman numeral for an integer value:",query);
    try {
      return romanNumeralService.calculateRomanNumeral(query);
    } catch (Exception excep) {
      logger.error("Unable to convert integer to roman numeral",excep);
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST,excep.getMessage());
    }
  }

}
