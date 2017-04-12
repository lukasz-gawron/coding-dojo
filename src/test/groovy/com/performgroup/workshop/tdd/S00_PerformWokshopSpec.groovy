package com.performgroup.workshop.tdd

import spock.lang.Specification

/**
 *
 * @author Lukasz Gawron / Software Engineer / testing but not TDD'ing yet
 *
 * Agenda:
 *  - Are you using TDD?
 *  - What TDD is?
 *  - Why do we want to do TDD?
 *    - safety
 *    - feedback
 *    - communication
 *    - loosly coupled desing
 *
 *  - 7 Steps of TDD (Red Green Refactor)
 *      1. create a list of tests
 *      2. Add new test FAST (baby steps)
 *      3. Run test suite, to see it failed
 *      4. Make changes to tested code
 *      5. Run again test suite, to see that ALL TEST PASSED
 *      6. REFACTOR tested code to eliminate duplication
 *      7. if you discover new test case, add it to TODO list, don't implement it straight away
 *
 *  - TDD Strategies:
 *      -   fraud (oszustwo) - implement based on hardcoded constants and return expected result, after that generalise and replace constant with variables, in case of service, database, something we have contract alrady, we can just put inside test test data, and we pretend we have it from db
 *      -   obviousness (oczywistosc) - create real implementation, which seems to be for sure correct
 *      -   trinagulation - generalise code based on 2 or more examples (tests)
 *
 *  - Priority Premise
 *    ({}–>nil) no code at all->code that employs nil
 *    (nil->constant)
 *    (constant->constant+) a simple constant to a more complex constant
 *    (constant->scalar) replacing a constant with a variable or an argument
 *    (statement->statements) adding more unconditional statements.
 *    (unconditional->if) splitting the execution path
 *    (scalar->array)
 *    (array->container)
 *    (statement->recursion)
 *    (if->while)
 *    (expression->function) replacing an expression with a function or algorithm
 *    (variable->assignment) replacing the value of a variable.
 *
 *    More about premise:
 *    https://8thlight.com/blog/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html
 *
 *  - Good practices:
 *      - if you don't know where to start, start from something obvious e.g. wrong input etc
 *      - rely on assurance from other smaller test
 *      - name test properly
 *      - keep tests isolated from each other
 *      - test should have single reason to fail, do not assert everything becuase you can,
 *      - test behaviour not algorithm (do not overmock)
 *      - keep tests fast e.g. divide unit and integration suites,
 *      - think about feature you want to test all the time, write acceptance test or integration test first
 *      - remove tests if not relevant anymore
 *      - write code which helps you test, use fixture objects, mothers, builders, to create test data
 *      - don't unit test setter/getter, 3rd party libraries, databases, GUI (use MVP, MVVM patterns)
 *      - measure code coverage
 *      - what is ideal code coverage?
 *      - test units, not classes
 *
 *  Test Driven Development: By Example Kent Beck
 *  https://www.amazon.com/Test-Driven-Development-Kent-Beck/dp/0321146530
 *
 *  Uncle Bob
 *  https://8thlight.com/blog/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html
 *  http://blog.cleancoder.com/uncle-bob/2014/12/17/TheCyclesOfTDD.html
 *  http://blog.cleancoder.com/uncle-bob/2017/03/03/TDD-Harms-Architecture.html
 *  https://8thlight.com/blog/uncle-bob/2013/03/06/ThePragmaticsOfTDD.html
 *
 *  Jakub Nabrdalik - Test Driven Traps
 *  https://www.youtube.com/watch?v=wbAtJlbRhbQ
 *
 *  Venkat Subramaniam: Succeeding with TDD: Pragmatic Techniques for effective mocking
 *  https://vimeo.com/68383352
 *
 *  https://schneide.wordpress.com/2013/04/05/tdd-avoid-getting-stuck-or-whats-the-next-test/
 *  https://schneide.wordpress.com/2013/04/29/the-difference-between-test-first-and-test-driven-development/
 *
 */
class S00_PerformWokshopSpec extends Specification {

}
