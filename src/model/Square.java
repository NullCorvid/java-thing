package model;

public class Square extends AsciiShape {

	public Square() {
		super();

	}

	@Override
	public void draw() {
		System.out.println("draw a square");
		System.out.println("height: " + getHeight());
		System.out.println("width: " + getWidth());
		System.out.println("label: " + getLabel());
	}

}
