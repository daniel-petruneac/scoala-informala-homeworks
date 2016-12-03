package siit.bubblesort;

import java.util.Comparator;

public class BubbleSort {
	public <T extends Comparable<T>> T[] sortPrimitives(T[] list) {
		boolean checker = true;

		for (int i = 0; i < list.length - 1; i++) {

			if (list[i].compareTo(list[i + 1]) > 0) {
				T aux = list[i];
				list[i] = list[i + 1];
				list[i + 1] = aux;
				checker = false;
			}
		}

		if (!checker) {
			sortPrimitives(list);
		}

		return list;
	}

	public <T> T[] sortEmployees(T[] list, Comparator<T> comparator) {
		boolean checker = true;

		for (int i = 0; i < list.length - 1; i++) {

			if (comparator.compare(list[i], list[i + 1]) > 0) {
				T aux = list[i];
				list[i] = list[i + 1];
				list[i + 1] = aux;
				checker = false;
			}
		}

		if (!checker) {
			sortEmployees(list, comparator);
		}

		return list;
	}
}