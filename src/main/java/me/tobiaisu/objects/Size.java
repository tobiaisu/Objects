package me.tobiaisu.objects;

import java.util.Scanner;

public class Size {
	public static float size(Scanner scanner, String name) {
		float size;

		do {
			System.out.print("Set " + name + ": ");
			size = scanner.nextFloat();
		} while (size <= 0);

		return size;
	}

	public static float triangleSize(Scanner scanner, String name, float hypotenuse, float opposite) {
		float size;

		do {
			System.out.print("Set " + name + ": ");
			size = scanner.nextFloat();
		} while (size <= 0 || size >= hypotenuse + opposite);

		return size;
	}
}
