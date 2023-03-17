package me.tobiaisu.objects;

import java.util.Scanner;
import java.lang.Math;

public class Circle extends Shape {
	Scanner scanner = new Scanner(System.in);

	private float radius;

	public Circle(String color, float radius) {
		super(color);

		this.radius = radius;

		Count.addCount();
	}

	public Circle(float radius) {
		super();

		this.radius = radius;

		Count.addCount();
	}

	public Circle(String color) {
		super(color);

		this.radius = Size.size(scanner, "radius");

		Count.addCount();
	}

	public Circle() {
		super();

		this.radius = Size.size(scanner, "radius");

		Count.addCount();
	}

	public float getRadius() {
		return this.radius;
	}

	public float getDiameter() {
		return this.radius * 2;
	}

	public void setRadius(float radius) {
		this.radius = Size.size(scanner, "radius");
	}

	public void setDiameter(float diameter) {
		this.radius = Size.size(scanner, "radius") / 2;
	}

	public float getPerimeter() {
		return 2 * (float) Math.PI * this.radius;
	}

	public float getContent() {
		return (float) Math.PI * (float) Math.pow(this.radius, 2);
	}

	@Override
	public int hashCode() {
		return (int) (this.radius * (this.radius * 2)) + super.getColor().hashCode();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Circle)) {
			return false;
		}

		Circle circle = (Circle) object;

		if (this.radius == circle.radius &&
				super.getColor().equals(circle.getColor())) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return "Radius: " + this.radius +
				"\nDiameter: " + this.radius * 2 +
				"\nColor: " + super.getColor() +
				"\nPerimeter: " + this.getPerimeter() +
				"\nContent: " + this.getContent();
	}
}