package me.tobiaisu.objects;

import java.util.Scanner;

public class Shape {
	Scanner scanner = new Scanner(System.in);
	private String color;

	public Shape(String color) {
		this.color = color;

		if (color == null) {
			System.out.print("Set color: ");
			this.color = scanner.next();
		}
	}

	public Shape() {
		System.out.print("Set color: ");
		this.color = scanner.next();
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
