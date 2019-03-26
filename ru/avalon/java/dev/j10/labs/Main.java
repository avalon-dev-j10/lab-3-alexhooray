package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		FibonacciInitializer fibonacciInitializer = new FibonacciInitializer();
		RandomInitializer randomInitializer = new RandomInitializer(-50, 50);
		BubbleSort bubbleSort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort();
		ShellSort shellSort = new ShellSort();

		int[] array = new int[20];
		int sum = 0;
		for (int i = 0; i < 20; i++) {
			fibonacciInitializer.initialize(array);
			sum = sum + array[i];
		}
		// System.out.println(sum);

/*
Пузырьковая сортировка
 */
		randomInitializer.initialize(array);
		bubbleSort.sort(array);
		// System.out.println(Arrays.toString(array));
		selectionSort.sort(array);
		// System.out.println(Arrays.toString(array));
		bubbleSort.sort(array);
		// System.out.println(Arrays.toString(array));

		/*
		 * TODO(Студент): Выполнить действия над массивом чисел
		 *
		 * 0. Создать массив из 20 целых чисел и адресовать
		 *    его с сохранить ссылку в переменную array.
		 *
		 * 1. Проинициализировать массив значениями
		 *    последовательности чисел Фибоначчи.
		 *
		 * 2. Найти сумму элементов массива.
		 *
		 * 3. Проинициализировать массив последовательностью
		 *    случайных чисел в диапазоне от -50 до 50.
		 *
		 * 4. Отсортировать массив с использованием
		 *    пузырьковой сортировки.
		 *
		 * 5. Проинициализировать массив последовательностью
		 *    случайных чисел в диапазоне от -50 до 50.
		 *
		 * 6. Отсортировать массив с использованием
		 *    сортировки выбором.
		 *
		 * 7. Проинициализировать массив последовательностью
		 *    случайных чисел в диапазоне от -50 до 50.
		 *
		 * 8. Отсортировать массив с использованием
		 *    сортировки Шелла.
		 */
	}
}

