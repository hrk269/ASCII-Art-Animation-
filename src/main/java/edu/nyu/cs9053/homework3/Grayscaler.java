package edu.nyu.cs9053.homework3;

/**
 * User: blangel
 */
public class Grayscaler {

    /**
     * Turns {@code pixel} into gray-scale
     * @implNote {@code pixel} is an RGB value where blue is the first 8 bits, green is the second 8 bits and red is the third 8 bits
     * @implNote to gray-scale an RGB use this formula {@literal 0.21 * red + 0.72 * green + 0.07 * blue}
     * @param pixel to gray-scale
     * @return the gray-scaled value
     */
    public double grayScale(int pixel) {
        double blue = pixel & 0xff;
        double green = (pixel & 0xff00) >> 8;
        double red = (pixel & 0xff0000) >> 16;
        double grayscaledRGB = ((0.21*red)+(0.72*green)+(0.07*blue));
        return grayscaledRGB;
    }

}
