package com.ajc.kata4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SearchFunctionalityTest {

	private SearchFunctionality searchFunctionality;

    @BeforeAll
    public void setUp() {
    	searchFunctionality = new SearchFunctionality();
    }
	
	@Test
    @DisplayName("Should return no results when search text length less than 2")
    void testSearchTextLengthLessThanTwo() {
		List<String> cities = searchFunctionality.searchFunctionality("a");
        assertEquals(0, cities.size());
    }

	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
