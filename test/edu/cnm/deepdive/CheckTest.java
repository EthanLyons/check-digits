package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CheckTest {

  @ParameterizedTest(name = "[{index}] input = {0}; expected = {1}")
  @CsvFileSource(resources = "tests.csv")
  void digitSum(int input, int expected) {
    int actual = Check.digitSum(input);
    assertEquals(expected, actual);
  }

}