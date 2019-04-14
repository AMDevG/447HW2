// GENERATED
/* INSTRUCTIONS
 *
 * Complete the exercises below.  For each "EXERCISE" comment, add
 * code immediately below the comment.
 *
 * Please see README.md for instructions, including compilation and testing.
 * 
 * GRADING
 * 
 * 1. Submissions MUST compile using SBT with UNCHANGED configuration and tests with no
 *    compilation errors.  Submissions with compilation errors will receive 0 points.
 *    Note that refactoring the code will cause the tests to fail.
 *
 * 2. You MUST NOT edit the SBT configuration and tests.  Altering it in your submission will
 *    result in 0 points for this assignment.
 *
 * 3. You MUST NOT use while loops or (re)assignment to variables (you can use "val" declarations,
 *    but not "var" declarations).  You must use recursion instead.
 *
 * 4. You may declare auxiliary functions if you like.
 *
 * SUBMISSION
 *
 * 1. Submit this file on D2L before the deadline.
 *
 * 2. Late submissions will not be permitted because solutions will be discussed in class.
 * 
 */

object fp1 {

   def main(args: Array[String]): Unit = {
   	//println(factTest)
   	//println(fib(9))
  	//println(p1)  
  	//println(t1)
  	//println(swap(p1))
  	
  	//val testList : List[Int] = List(100,100,100,100)
  	//println(sum(testList))

  	//println(factTest)
  	println(max(List()))

  }

  def fact (n : Int) : Int = {
    if (n <= 1) 
      1
    else
      n * fact (n - 1)
  }
  // EXERCISE 1: complete the following definition, so that factTest is the list of integers
  // List(1,2,6,24,120).  You must call the "fact" function (five times) defined above instead of
  // hardcoding the numbers 1,2,6,24,120.
  val factTest : List[Int] = {
  	factTestAux()
  	}

  def factTestAux() : List[Int] = {

  	val list5 = fact(5)
  	val list4 = fact(4)
  	val list3 = fact(3)
  	val list2 = fact(2)
  	val list1 = fact(1)

  	val finalList = List(list1, list2, list3, list4, list5)
  	return finalList
  	}

  // EXERCISE 2: complete the following definition of the Fibonacci function.
  def fib (n : Int) : Int = {
    if(n == 0) return 0
    if(n == 1) return 1
    else{
    	return fib(n-1) + fib(n-2)
    }
    -1
  }

  // EXERCISE 3: declare the identifier "p1" with a pair consisting of the Int 7 and the String
  // "hello"
  val p1 : (Int, String) = {
    (7, "hello")
  }

  // EXERCISE 4: declare the identifier "t1" with a triple consisting of the Int 7, the String
  // "hello", and the Boolean false
  val t1 : (Int, String, Boolean) = {
    (7, "hello", false)
  }

  // EXERCISE 5: write a function "swap" that takes a pair of an Int and a String, and returns a
  // pair of a String and an Int (with the values from the pair passed an argument.  E.g., swap (p1)
  // should return ("hello", 7).  You can use "p._1" and "p._2" to access the first and second
  // components of a pair.
  def swap (p:(Int,String)) : (String,Int) = {
    return(p._2, p._1)
  }

  // EXERCISE 6: write a function "sum" that takes a list of integers and sums them.  As with all of
  // the exercises in this assignment, your function MUST be recursive and MUST NOT use a while
  // loop.
  def sum (xs : List[Int]) : Int = {
    if(xs.isEmpty) return 0
    else{
    	return xs(0) + sum(xs.drop(1))
    }
    -1
  }


  // EXERCISE 7: given the definition of the function "sumTailAux" below, complete the
  // definition of the function "sumTail" so that it also sums a list of integers.  You
  // must not alter the definition of "sumTailAux".  Your definition for "sumTail"
  // must call "sumTailAux" directly, and must not call "sum"
  def sumTailAux (accumulator : Int, xs : List[Int]) : Int = {
    xs match {
      case Nil => accumulator
      case y::ys => sumTailAux (accumulator + y, ys)
    }
  }

  def sumTail (xs : List[Int]) : Int = {
    // TODO: Provide definition here.
    -1
  }


  // EXERCISE 8: complete the following definition of the function "max" that finds the maximum
  // integer in a list of integers.  Note that no value can be returned when the list is empty,
  // hence the "NoSuchElementException".  Your function MUST be recursive and MUST NOT use a while
  // loop.  You MUST NOT use the "max" method on lists, but can use the "max" method on integers.
  def max (xs : List[Int]) : Int = {
   	if(xs.isEmpty) throw new NoSuchElementException

   	
    -1
  }

  // EXERCISE 9: given the definition of the function "maxTail" below, complete the
  // definition of the function "maxTailAux" so that "maxTail" also finds the
  // maximum of a list of integers.  You must not alter the definition of "maxTail".  Your
  // definition for "maxTailAux" must be recursive and not use while loops.
  def maxTailAux (accumulator : Int, xs : List[Int]) : Int = {
    // TODO: Provide definition here.
    -1
  }

  def maxTail (xs : List[Int]) : Int = {
    xs match {
      case Nil => throw new java.util.NoSuchElementException
      case y::ys => maxTailAux (y, ys)
    }
  }

  // EXERCISE 10: Write a recursive function "otpu" ("upto" backwards) that takes two Int parameters
  // "start" and "end" and produces a "List[Int]" that counts DOWN from "start" to "end" (inclusive
  // at both ends) one at a time.  If "start < end", the empty list must be returned.
  def otpu (start : Int, end : Int) : List[Int] = {
    // TODO: Provide definition here.
    null
  }
}

