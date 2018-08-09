package com.ktsession.welcome;

public class DemoBean {

	private String color;

	private String outputText;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOutputText() {
		return outputText;
	}

	public void setOutputText(String outputText) {
		this.outputText = outputText;
	}

	@Override
	public String toString() {
		return "DemoBean [color=" + color + ", outputText=" + outputText + "]";
	}
	
	
	
}
