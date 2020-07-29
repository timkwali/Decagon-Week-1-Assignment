package com.example.checkpalindrome

import org.junit.Test

import org.junit.Assert.*
import java.lang.Exception

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun checkIfPalindrome() {
        //ONE WORD CASE
        assertEquals(true, checkPalindrome("Racecar"))

        //A FULL SENTENCE
        assertEquals(true, checkPalindrome("A nut for a jar of tuna"))

        //ACCEPTS DATES AND TIME
        assertEquals(true, checkPalindrome("02/02/2020"))
        assertEquals(true, checkPalindrome("11/11/11 11:11"))

        //WORKS WITH REALLY LONG ENTRY
        assertEquals(true, checkPalindrome(
            "Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel, and Ellen sinned."
        ))

        //MIXED WITH PUNCTUATIONS
        assertEquals(true, checkPalindrome("Are we not pure? “No, sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man—a prisoner up to new era."))

        //NOT A PALINDROME
        assertEquals(false, checkPalindrome("the round house"))
        assertEquals(false, checkPalindrome("33452323"))
    }
}