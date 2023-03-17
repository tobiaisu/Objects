package me.tobiaisu.objects;

import java.util.Scanner;
import java.lang.Math;

public class Triangle extends Shape {
	Scanner scanner = new Scanner(System.in);

	private float hypotenuse;
	private float opposite;
	private float adjacent;

	public Triangle(String color, float hypotenuse, float opposite, float adjacent) {
		super(color);

		this.hypotenuse = hypotenuse;
		this.opposite = opposite;
		this.adjacent = adjacent;

		Count.addCount();
	}

	public Triangle(float hypotenuse, float opposite, float adjacent) {
		super();

		this.hypotenuse = hypotenuse;
		this.opposite = opposite;
		this.adjacent = adjacent;

		Count.addCount();
	}

	public Triangle(String color, float length) {
		super(color);

		this.hypotenuse = length;
		this.opposite = length;
		this.adjacent = length;

		Count.addCount();
	}

	public Triangle(float length) {
		super();

		this.hypotenuse = length;
		this.opposite = length;
		this.adjacent = length;

		Count.addCount();
	}

	public Triangle(String color) {
		super(color);

		this.hypotenuse = Size.size(scanner, "hypotenuse");
		this.opposite = Size.size(scanner, "opposite");

		do {
			this.adjacent = Size.size(scanner, "adjacent");
		} while (this.adjacent >= this.hypotenuse + this.opposite);

		Count.addCount();
	}

	public Triangle() {
		super();

		this.hypotenuse = Size.size(scanner, "hypotenuse");
		this.opposite = Size.size(scanner, "opposite");

		this.adjacent = Size.triangleSize(scanner, "adjacent", this.hypotenuse, this.opposite);

		Count.addCount();
	}


	public float getHypotenuse() {
		return this.hypotenuse;
	}

	public float getOpposite() {
		return this.opposite;
	}

	public float getAdjacent() {
		return this.adjacent;
	}

	public void setHypotenuse(float hypotenuse) {
		this.hypotenuse = Size.size(scanner, "hypotenuse");
	}

	public void setOpposite(float opposite) {
		this.opposite = Size.size(scanner, "opposite");
	}

	public void setAdjacent(float adjacent) {
		this.adjacent = Size.size(scanner, "adjacent");
	}

	public float getPerimeter() {
		return this.hypotenuse + this.opposite + this.adjacent;
	}

	public float getContent() {
		float s = this.getPerimeter() / 2;
		return (float) Math.sqrt(s * (s - this.hypotenuse) * (s - this.opposite) * (s - this.adjacent));
	}

	@Override
	public int hashCode() {
		return (int) (this.hypotenuse * this.adjacent * this.opposite) + super.getColor().hashCode();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Triangle)) {
			return false;
		}

		Triangle triangle = (Triangle) object;

		if (this.hypotenuse == triangle.hypotenuse &&
				this.adjacent == triangle.adjacent &&
				this.opposite == triangle.opposite &&
				super.getColor().equals(triangle.getColor())) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return "Hypotenuse: " + this.hypotenuse +
				"\nOpposite: " + this.opposite +
				"\nAdjacent: " + this.adjacent +
				"\nColor: " + super.getColor()+
				"\nPerimeter: " + this.getPerimeter() +
				"\nContent: " + this.getContent();
	}
}