package com.ajc.kata4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SearchFunctionalityTest {

	private SearchFunctionality search;

    @BeforeAll
    public void setUp() {
    	search = new SearchFunctionality();
    }
	
	@Test
    @DisplayName("Should return no results when search text length less than 2")
    void testSearchTextLengthLessThanTwo() {
		String []  cities = search("a");
        assertEquals(0, cities.length);
    }

	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
