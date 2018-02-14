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
        for (int imageHeight=0; imageHeight < asciiArt.length; imageHeight++){
            for (int imageWidth=0; imageWidth < asciiArt[1].length; imageWidth++){
                System.out.printf("%c", asciiArt[imageHeight][imageWidth]);
            }
            System.out.printf("%c", '\n');
        }
    }

    protected void clearScreen() {
        //System.out.printf("\u001B[51;1H");
        System.out.printf("\033[H\033[2J");  //This clear statement works better on Ubuntu
        //System.out.flush();
    }

}
