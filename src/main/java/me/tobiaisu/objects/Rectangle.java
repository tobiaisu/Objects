package me.tobiaisu.objects;

import java.util.Scanner;
import java.lang.Math;

public class Rectangle extends Shape {
	Scanner scanner = new Scanner(System.in);

	private float length;
	private float height;

	public Rectangle(String color, float length, float height) {
		super(color);

		this.length = length;
		this.height = height;

		Count.addCount();
	}

	public Rectangle(float length, float height) {
		super();

		this.length = length;
		this.height = height;

		Count.addCount();
	}

	public Rectangle(String color, float size) {
		super(color);

		this.length = size;
		this.height = size;

		Count.addCount();
	}

	public Rectangle(float size) {
		super();

		this.length = size;
		this.height = size;

		Count.addCount();
	}

	public Rectangle(String color) {
		super(color);

		this.length = Size.size(scanner, "width");
		this.height = Size.size(scanner, "height");

		Count.addCount();
	}

	public Rectangle() {
		super();

		this.length = Size.size(scanner, "width");
		this.height = Size.size(scanner, "height");

		Count.addCount();
	}


	public float getLength() {
		return this.length;
	}

	public float getHeight() {
		return this.height;
	}

	public void setLength(float length) {
		this.length = Size.size(scanner, "width");
	}

	public void setHeight(float height) {
		this.height = Size.size(scanner, "height");
	}

	public float getDiagonal() {
		return (float) Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.height, 2));
	}

	public float getPerimeter() {
		return 2 * (this.length + this.height);
	}

	public float getContent() {
		return this.length * this.height;
	}

	@Override
	public int hashCode() {
		return (int) (this.length * this.height) + super.getColor().hashCode();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Rectangle)) {
			return false;
		}

		Rectangle rectangle = (Rectangle) object;

		if (this.length == rectangle.length &&
				this.length == rectangle.length &&
				super.getColor().equals(rectangle.getColor())) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return "Length: " + this.length +
				"\nHeight: " + this.height +
				"\nColor: " + super.getColor() +
				"\nDiagonal: " + this.getDiagonal() +
				"\nPerimeter: " + this.getPerimeter() +
				"\nContent: " + this.getContent();
	}
}