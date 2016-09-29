package model;

public class AsciiShape {

	private int height, width;
	private String label;

	/**
	 * standard label "LU" by requirement specification
	 */
	public AsciiShape() {
		label = "LU";
	}

	public void setHeight(int newHeight) {
		height = newHeight;
	}

	public void setWidth(int newWidth) {
		width = newWidth;
	}

	public void setLabel(String newLabel) {
		if (newLabel.equals("") || newLabel == null)
			return;
		label = newLabel;
	}

	public void draw() {
		System.out.println("Draw method not implemented for this shape");
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getLabel() {
		return label;
	}

}
