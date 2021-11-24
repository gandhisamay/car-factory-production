package Models.Parts;

import Interfaces.Parts.ColorI;

public class Color implements ColorI {
    private String interiorColor;
    private String frameColor;
    private int coloringTime = 250;

    public Color(String interiorColor, String frameColor) {
        this.interiorColor = interiorColor;
        this.frameColor = frameColor;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public int getColoringTime() {
        return coloringTime;
    }

    public String getFrameColor() {
        return frameColor;
    }

    public void setColoringTime(int coloringTime) {
        this.coloringTime = coloringTime;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public void setFrameColor(String frameColor) {
        this.frameColor = frameColor;
    }

}
