package com.in28minutes.mockito;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HamcrestMatchersTest {

	@Test
	public void test() {
		List<Integer> scores = Arrays.asList(99, 100, 101, 105);
		
		assertThat(scores, hasSize(4));
		assertThat(scores, hasItems(99, 100));
		
		assertThat(scores, everyItem(greaterThan(90)));
		assertThat(scores, everyItem(lessThan(190)));
		
		assertThat("", isEmptyString());
		assertThat(null, isEmptyOrNullString());
		
		Integer[] marks = { 1, 2, 3 };
		assertThat(marks, arrayWithSize(3));
		assertThat(marks, arrayContaining(1, 2, 3));
		assertThat(marks, arrayContainingInAnyOrder(2, 1, 3));
	}

}
