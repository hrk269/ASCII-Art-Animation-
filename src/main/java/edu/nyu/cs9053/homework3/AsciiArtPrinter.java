package edu.nyu.cs9053.homework3;

/**
 * User: blangel
 */
public class AsciiArtPrinter {

    /**
     * @implNote should only print values within {@code asciiArt} and nothing else within this method
     * @param asciiArt to print
     */
    public void print(char[][] asciiArt) {
        for (int height=0; height < asciiArt[0].length; height++){
            for (int width=0; width < asciiArt[1].length; width++){
                System.out.print(asciiArt[height][width]);
            }
            System.out.println();
        }
    }

    protected void clearScreen() {
        System.out.printf("\u001B[51;1H");
    }

}
