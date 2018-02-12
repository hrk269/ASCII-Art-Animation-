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
        for (int height=0; height < asciiArt.length; height++){
            for (int width=0; width < asciiArt[1].length; width++){
                System.out.printf("%c", asciiArt[height][width]);
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
