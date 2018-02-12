package edu.nyu.cs9053.homework3;

/**
 * User: blangel
 */
public class AsciiArtConverter {

    private static final char[] ASCII_ART_LOOKUP_TABLE = new char[]{
            '$', '@', 'B', '%', '8', '&', 'W', 'M', '#', '*', 'o', 'a', 'h', 'k',
            'b', 'd', 'p', 'q', 'w', 'm', 'Z', 'O', '0', 'Q', 'L', 'C', 'J', 'U',
            'Y', 'X', 'z', 'c', 'v', 'u', 'n', 'x', 'r', 'j', 'f', 't', '/', '|',
            '(', ')', '1', '{', '}', '[', ']', '?', '-', '_', '+', '~', '<', '>',
            'i', '!', 'l', 'I', ';', ':', ',', '"', '^', '`', '\'', '.', ' '
    };

    private final Grayscaler grayscaler;

    public AsciiArtConverter(Grayscaler grayscaler) {
        this.grayscaler = grayscaler;
    }

    protected AsciiArtConverter() {
        this(new Grayscaler());
    }

    /**
     * @implNote hint, for each pixel transform to grayscale and then find the appropriate char within {@linkplain #ASCII_ART_LOOKUP_TABLE}
     * @param infoProvider to transform into a {@code char[][]}
     * @return the converted {@code char[][]}
     */
    public char[][] convert(ImageInfoProvider infoProvider) {
        char[][] asciiArt = new char[infoProvider.getHeight()][infoProvider.getWidth()];
        for (int height=0; height<asciiArt[0].length; height++){
            for (int width=0; width<asciiArt[1].length;width++){
                int pixel = infoProvider.getPixel(width, height);
                double grayscalePixel = grayscaler.grayScale(pixel);
                char asciiCharacter = getCharacterForPixel(grayscalePixel);
                asciiArt[height][width] = asciiCharacter;
            }
        }
        return asciiArt;

    }

    /**
     * @implNote scale the {@code pixel} to one unsigned byte {@code pixel / 255d} and then multiply that
     *           by the index size {@code (ASCII_ART_LOOKUP_TABLE.length - 1)} and take the {@linkplain Math#ceil(double)}
     *           of that value and use as an index into {@linkplain #ASCII_ART_LOOKUP_TABLE}
     * @param pixel to map to a char within {@linkplain #ASCII_ART_LOOKUP_TABLE}
     * @return the appropriately mapped char
     */
    protected char getCharacterForPixel(double pixel) {
        int tableIndex = (int) Math.ceil((pixel/255d)*(ASCII_ART_LOOKUP_TABLE.length-1));
        return ASCII_ART_LOOKUP_TABLE[tableIndex];
    }

}