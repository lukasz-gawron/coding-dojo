package com.performgroup.workshop.tdd

import spock.lang.Ignore
import spock.lang.Specification

/**
 * https://reinhard.codes/2016/03/04/the-transformation-priority-premise/
 * https://bitbucket.org/donneo36/tdd-katas/src
 *
 * You write a class called Wrapper,
 * that has a single static function named wrap that takes two arguments,
 * a string, and a column number.
 * The function returns the string, but with line breaks inserted at just the right places
 * to make sure that no line is longer than the column number.
 * You try to break lines at word boundaries.
 * Like a word processor, break the line by replacing the last space in a line with a newline.
 *
 * MUST word cannot be longer than column number
 * NICE TO HAVE if more words in sentence try to split them on word boundary
 *
 */
class S01_05_24_PerformWokshopSpec extends Specification {
//""
//word,5
//word word,6
//wordword, 6

  def 'should return empty string on empty string'() {
    expect:
    wrap("", 5) == ""
  }

  def 'should return empty string on null'() {
    expect:
    wrap(null, 5) == ""
  }

  def 'should throw exception on length less than 1'() {
    when:
    wrap("", 0)

    then:
    thrown(IllegalArgumentException)
  }

  def 'should return word if length longer than text'() {
    expect:
    wrap("word", 5) == "word"
  }

  def 'should break word on length'() {
    expect:
    wrap("word", 2) == "wo\nrd"
    wrap("drow", 2) == "dr\now"
  }

  @Ignore
  def 'should break word on every length'() {
    expect:
    wrap("word", 1) == "w\no\nr\nd"
  }

  def 'should break text with word on every line'() {
    expect:
    wrap("word word", 4) == "word\nword"
    wrap("long word", 4) == "long\nword"
  }

  String wrap(String text, int length) {
    if (length < 1) {
      throw new IllegalArgumentException()
    }
    if (text == null) {
      return ""
    }
    if (text.length() > length) {
      if(text.contains(" ")){
        return text.replace(" ", "\n")
      }
      return text.substring(0, length) + "\n" + text.substring(length, text.length())
    }
    return text
  }
}

