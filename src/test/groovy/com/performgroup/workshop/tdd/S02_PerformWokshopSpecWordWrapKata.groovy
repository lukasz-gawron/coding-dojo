package com.performgroup.workshop.tdd

import org.junit.Assert
import spock.lang.Specification

/**
 * You write a class called Wrapper,
 * that has a single static function named wrap that takes two arguments,
 * a string, and a column number.
 * The function returns the string, but with line breaks inserted at just the right places
 * to make sure that no line is longer than the column number.
 * You try to break lines at word boundaries.
 * Like a word processor, break the line by replacing the last space in a line with a newline.
 *
 * https://8thlight.com/blog/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html
 */
class S02_PerformWokshopSpecWordWrapKata extends Specification {

  def "return empty string on null"() {
    expect:
    wrap(null, 10) == ""
  }


  def 'return empty string on empty string'() {
    expect:
    wrap("", 20) == ""
  }

  def 'throw exception if length less than 1'() {
    when:
    wrap("word", 0)
    then:
    thrown(IllegalArgumentException)

  }

  def 'one short word doesnt wrap'() {
    expect:
    wrap("word", 5) == "word"
  }

  def 'word longer than break wrap at break'() {
    expect:
    wrap("longword", 4) == "long\nword"
    wrap("longerword", 6) == "longer\nword"
  }

  def 'word longer twice much than break wrap at breaks'() {
    expect:
    wrap("verylongword", 4) == "very\nlong\nword"
  }

  def 'two words  wrap after first word if break in the middle of second word'() {
    expect:
    wrap("word word", 6) == "word\nword"
    wrap("word here", 6) == "word\nhere"
  }

  def 'three words  wrap after first word if break in the middle of second word'() {
    expect:
    wrap("word word word", 6) == "word\nword\nword"
  }


  def wrap(String text, int length) {
    if (text == null) {
      return ""
    }
    if (length < 1) {
      throw new IllegalArgumentException()
    }
    if (text.length() <= length) {
      text
    } else {
      int space = text.indexOf(" ")
      if (space >= 0) {
        return text.substring(0, space) + "\n" + wrap(text.substring(space + 1), length);
      }
      return text.substring(0, length) + "\n" + wrap(text.substring(length), length)
    }
  }
}
