package me.tobiaisu.objects;

import java.util.Scanner;

public class Cuboid extends Rectangle {
	Scanner scanner = new Scanner(System.in);

	private float width;

	public Cuboid(String color, float length, float height, float width) {
		super(color, length, height);

		this.width = length;

		Count.addCount();
	}

	public Cuboid(float length, float height, float width) {
		super(length, height);

		this.width = width;

		Count.addCount();
	}

	public Cuboid(String color, float size) {
		super(color, size, size);

		this.width = size;

		Count.addCount();
	}

	public Cuboid(float size) {
		super(size, size);

		this.width = size;

		Count.addCount();
	}

	public Cuboid(String color) {
		super(color);

		this.width = Size.size(scanner, "width");

		Count.addCount();
	}

	public Cuboid() {
		super();

		this.width = Size.size(scanner, "width");

		Count.addCount();
	}

	public float getWidth() {
		return this.width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getSurface() {
		return 2 * (super.getLength() * super.getHeight())
				+ 2 * (super.getLength() * this.width)
				+ 2 * (super.getHeight() * this.width);
	}

	@Override
	public float getDiagonal() {
		return (float) Math.sqrt(Math.pow(this.width, 2) + (Math.pow(super.getLength(), 2) + Math.pow(getHeight(), 2)));
	}

	@Override
	public float getPerimeter() {
		return 4 * super.getLength() + 4 * super.getHeight() + 4 * this.width;
	}

	@Override
	public float getContent() {
		return this.width * super.getContent();
	}

	@Override
	public int hashCode() {
		return (int) (super.getLength() * super.getHeight() * this.width) + super.getColor().hashCode();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Cuboid)) {
			return false;
		}

		Cuboid cuboid = (Cuboid) object;

		if (super.getLength() == cuboid.getLength() &&
				super.getHeight() == cuboid.getHeight() &&
				this.width == cuboid.width &&
				super.getColor().equals(cuboid.getColor())) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return "Length: " + super.getLength() +
				"\nHeight: " + super.getHeight() +
				"\nWidth: " + this.width +
				"\nColor: " + super.getColor() +
				"\nDiagonal: " + this.getDiagonal() +
				"\nPerimeter: " + this.getPerimeter() +
				"\nContent: " + this.getContent();
	}
}
