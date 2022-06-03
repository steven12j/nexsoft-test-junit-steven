package testSort;

import com.nexsoft.sorting.CSorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

public class CSortingTest {

	CSorting cSorting = new CSorting();

	@ParameterizedTest
	@DisplayName("Test Bubble Sort")
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testBubbleSort(int a, int b, int c, int d) {

		assertTimeout(Duration.ofMillis(500), () -> {
			int angka[] = { a, b, c, d };
			int expected[] = { a, b, c, d };
			cSorting.bubbleSort(angka, angka.length);
			Arrays.sort(expected);
			assertArrayEquals(expected, angka);
		});
	}

	@ParameterizedTest
	@DisplayName("Test Selection Sort")
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testSelectionSort(int a, int b, int c, int d) {

		assertTimeout(Duration.ofMillis(500), () -> {
			int angka[] = { a, b, c, d };
			int expected[] = { a, b, c, d };
			cSorting.selectionSort(angka);
			Arrays.sort(expected);
			assertArrayEquals(expected, angka);
		});
	}

	@ParameterizedTest
	@DisplayName("Test Insertion Sort")
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testInsertionSort(int a, int b, int c, int d) {

		assertTimeout(Duration.ofMillis(500), () -> {
			int angka[] = { a, b, c, d };
			int expected[] = { a, b, c, d };
			cSorting.insertionSort(angka, angka.length);
			Arrays.sort(expected);
			assertArrayEquals(expected, angka);
		});
	}

	@ParameterizedTest
	@DisplayName("Test Negative Sort")
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testNegativeBubbleSort(int a, int b, int c, int d) {

		assertTimeout(Duration.ofMillis(500), () -> {
			int angka[] = { a, b, c, d };
			int expected[] = { a, b, c, d };
			Arrays.sort(expected);
			assertFalse(Arrays.equals(expected, angka), "Method sort not sorted");
		});
	}

	@ParameterizedTest
	@DisplayName("Test Negative Sort 2")
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testNegative2(int a, int b, int c, int d) {
		assertTimeout(Duration.ofMillis(500), () -> {
			try {
				int e = 0;
				int angka[] = {a, b, c, d, e};
				int expected[] = {a, b, c, d, e};
				cSorting.insertionSort(angka, angka.length);
				Arrays.sort(expected);
				assertArrayEquals(expected, angka);
			} catch (ArrayIndexOutOfBoundsException p) {
				System.out.println("The index you have entered is invalid");
				System.out.println("Please enter an index number between 0 and 6");
			}

		});
	}

}

