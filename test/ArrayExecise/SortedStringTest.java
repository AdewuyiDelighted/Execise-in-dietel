package ArrayExecise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedStringTest {
    @Test
    public void testThatFunctionCanSortUnSortedString(){
        String letters = "acb";
        String result = SortedString.sortStrings(letters);
        assertEquals("abc",result);
    }
    @Test public void whenTheWordAreSortedTest(){
        String letters = "abc";
        String result = SortedString.sortStrings(letters);
        assertEquals("abc",result);

    }
    @Test public void whenWordAreNotAlphabeticallyInorderTest(){
        String letters = "debby";
        String result = SortedString.sortStrings(letters);
        assertEquals("bbdey",result);
    }
    @Test public void whenWordAreNotAlphabeticallyInorderAndWordIsQuiteLongerTest(){
        String letters = "television";
        String result = SortedString.sortStrings(letters);
        assertEquals("eeiilnostv",result);
    }
    @Test public void whenWordAreInUppercaseTest(){
        String letters = "LOVE";
assertThrows(InvalidInputException.class,()->SortedString.sortStrings(letters));

    }





}