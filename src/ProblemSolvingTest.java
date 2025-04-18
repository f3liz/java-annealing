import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {
  @Test
  void testAllStartWithA_trueMixedCase() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "asbestos", "ABBA");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    //assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseOneElement() {
    // arrange
    Set<String> input = Set.of("armadillo", "utopia", "Arcanine");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testEmptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    //assert
    assertTrue(actual);
  }

  @Test
  void testNoneStartWithA() {
    // arrange
    Set<String> input = Set.of("felix", "lebron", "goat");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testOneElement() {
    // arrange
    Set<String> input = Set.of("armadillo");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testfalseOneElement() {
    // arrange
    Set<String> input = Set.of("Utopia");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  // TODO:
  // Come up with more tests to thoroughly test testAllStartWithA
  // Suggestions:
  //  - test an empty set
  //  - test a set where none start with A
  //  - test a set with only a single element
  //  - more you can think of!

  @Test
  void testHasEmptyString_falseAllNonEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "utopia");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_trueOneEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "", "utopia", "yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasOneStringEmptyString() {
    // arrange
    Set<String> input = Set.of("");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testEmptySetEmptyStringMethod() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }



  // TODO:
  // Come up with more tests to thoroughly test hasEmptyString
  // Use your creativity here!


  @Test
  void testMaxLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);
  }

  @Test
  void testMaxLength_multipleWordsSameLength() {
    // arrange
    Set<String> input = Set.of("by", "at", "me", "he");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(2, actual);
  }

  @Test
  void testMaxLengthEmptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(0, actual);
  }

  @Test
  void testMaxLengthWithSpaces() {
    // arrange
    Set<String> input = Set.of("hello felix", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(11, actual);
  }


  // TODO:
  // Come up with more tests to thoroughly test maxLength
  // Use your creativity here!
    
  @Test
  void testMinLengthEmptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(Integer.MAX_VALUE, actual);
  }

  @Test
  void testMinLengthOneWord() {
    // arrange
    Set<String> input = Set.of("hi");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(2, actual);
  }

  @Test
  void testMinLengthSameLengthMultipleWords() {
    // arrange
    Set<String> input = Set.of("a", "b", "c", "d");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(1, actual);
  }

  @Test
  void testMinLengthMixedWords() {
    // arrange
    Set<String> input = Set.of("allstar", "lebron", "ball", "basketball");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(4, actual);
  }

  @Test
  void testMinLengthMixedWordsWithSpaces() {
    // arrange
    Set<String> input = Set.of("all-star", "lebron james", "buckets", "i am");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(4, actual);
  }

  @Test
  void testMinLengthOneEmptyString() {
    // arrange
    Set<String> input = Set.of("allstar", "lebron", "ball", "");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(0, actual);
  }
  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration

}
