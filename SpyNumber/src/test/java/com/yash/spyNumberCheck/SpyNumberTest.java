package com.yash.spyNumberCheck;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.function.Predicate;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.yash.spyNumberCheck.SpyNumber;

@RunWith(value = MockitoJUnitRunner.class)
public class SpyNumberTest {

	@InjectMocks
	private SpyNumber spyNumber;

	@Mock
	private Logger loggerMock;

	@Mock
	private CustomInputScanner mockScanner;

	@Test
	public void shouldReturnTrueIfNumberIsSpy() {
		Integer number = 123;
		boolean expectedResult = true;

		when(mockScanner.getInput()).thenReturn(123);
		boolean actualResult = spyNumber.isSpyNumber(number);

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void shouldReturnFalseIfNumberIsSpy() {
		Integer number = 125;
		boolean expectedResult = false;

		when(mockScanner.getInput()).thenReturn(125);

		boolean actualResult = spyNumber.isSpyNumber(number);

		assertEquals(expectedResult, actualResult);

	}

}
