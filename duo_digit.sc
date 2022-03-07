import math._
import scala.util._
import scala.io.StdIn._

object Solution extends App {
    
    def isDuoDigit(number: Int): String = {
        // Write your code here
        val abs_number = abs(number)
        var num_of_digits = 1
        var output = "y"
        val number_length = abs_number.toString.length
        if (number_length > 2) {
            for (i <- 0 to number_length-1) {
                for (j <- 1 to number_length-1) {
                    if (abs_number.toString.charAt(i) == abs_number.toString.charAt(j)) {
                        num_of_digits -=1
                    }
                    else if(abs_number.toString.charAt(i) != abs_number.toString.charAt(j)) {
                        num_of_digits += 1
                    }
                }
            }
        }

        if (num_of_digits > 2) {
            output = "n"
        }
        // To debug: System.err.println("Debug messages...");

        return output
    }