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
 */
class S01_PerformWokshopSpec extends Specification {
//(String text, int length):String

  //"word", 2 : "wo\nrd"
  //"word word", 6 : ("word\nword")
  //"word word", 3 : ("wor\nd w\nord")
  //"word word", 3 : ("wor\nd\nwor\nd")

  def 'should return empty string for empty string'() {
    expect:
    wrap("", 4) == ""
  }

  def 'should return empty string for null'() {
    expect:
    wrap(null, 4) == ""
  }

  def 'should return a word for word'() {
    expect:
    wrap("word", 5) == "word"
  }

  def 'should throw exception when length less than 1'() {
    when:
    wrap("word", 0)

    then:
    thrown(IllegalArgumentException)
  }

  def 'should break single word'() {
    expect:
    wrap("word", 2) == "wo\nrd"
    wrap("test", 2) == "te\nst"
  }

  @Ignore
  def 'should break words to separate lines'() {
    expect:
    wrap("word word", 6) == "word\nword"
  }


  String wrap(String text, int length) {
    if (length < 1) {
      throw new IllegalArgumentException()
    }
    if (text == null) {
      return ""
    }
    if(text.length() > length){
      return text.substring(0, length) + "\n" + text.substring(length)
    }
    return text
  }
}

//({}–>nil) no code at all->code that employs nil
//*    (nil->constant)
//*    (constant->constant+) a simple constant to a more complex constant
//*    (constant->scalar) replacing a constant with a variable or an argument
//*    (statement->statements) adding more unconditional statements.
//    *    (unconditional->if) splitting the execution path
//*    (scalar->array)
//*    (array->container)
//*    (statement->recursion)
//*    (if->while)
//*    (expression->function) replacing an expression with a function or algorithm
//*    (variable->assignment) replacing the value of a variable.