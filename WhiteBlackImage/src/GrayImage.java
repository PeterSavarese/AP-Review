public class GrayImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    /** The 2-dimensional representation of this image.
     *  Guaranteed not to be null.
     *  All values in the array are within the range
     *  [BLACK, WHITE], inclusive.
     */
    private int[][] pixelValues;

    /** @return the total number of white pixels in
     *    this image.
     * Postcondition: this image has not been changed.
     */
    public int countWhitePixels() {
        int iWhitePixelsFound = 0;

        for (int iRow = 0; iRow < pixelValues.length; iRow++) {
            for (int iColumn = 0; iColumn < pixelValues[iRow].length; iColumn++) {
                if (pixelValues[iRow][iColumn] == WHITE) {
                    iWhitePixelsFound++;
                }
            }
        }

        return iWhitePixelsFound;
    }

    public void processImage() {
        for (int iRow = 0; iRow < pixelValues.length; iRow++) {
            for (int iColumn = 0; iColumn < pixelValues[iRow].length; iColumn++) {
                // Go over 2 and down 2 in our array
                int iOverTwoRow = iRow + 2;
                int iOverTwoCol = iColumn + 2;

                if (iOverTwoRow < pixelValues.length && iOverTwoCol < pixelValues[iOverTwoRow].length) { // Check that the index isn't outside the array's bounds
                    pixelValues[iRow][iColumn] -= pixelValues[iOverTwoRow][iOverTwoCol];

                    if (pixelValues[iRow][iColumn] < BLACK) { // Clamp our function to not go below 0, since Grayscale/RGB doesn't have negative color values
                        pixelValues[iRow][iColumn] = BLACK;
                    }
                }
            }
        }
    }
}