
public class INeuron {

	public static void main(String[] args) {
		String name = "INEURON";
		printPattern(name, name.length());
	}

	// I = i=0, i=height-1,j=height/2
	// N= j=0,j=height-1,
	// E = i=0,i=height/2 , i=height-1 , j=0
	// U = i=height-1,j=0,j=width-1
	// R = i=0,i=height/2,j=0,i<height/2
	// O = i=0,i=height-1,j=0,j=width-1
	// N= j=0,j=height-1,
	private static void printPattern(String name, int len) {
		int ll = 7;// letter length
		int pointer = ll;// width of each letter.
		int letterCount = 1;// word pointer
		int LetterWidth = 6;
		int totalHeight = 7;// height
		int totalWidth = len * len;// width
		int NPointer = 0;
		int RPointer = 2;
		for (int i = 0; i < totalHeight; i++) {
			pointer = ll;
			letterCount = 1;
			int startingIndex = 0;// letter startingIndex
			int endingIndex = len - 1;// letter endingIndex

			for (int j = 0; j < totalWidth; j++) {

				if (j == (pointer))// true: pointer is in end of particular letter
				{
					letterCount++; // increment the word count
					pointer += ll; // increment the pointer count.so it refer next letter
					startingIndex = j + 1;
					endingIndex = startingIndex + LetterWidth - 1;
					System.out.print("  ");
					continue;
				}
				// first row INEURON
				if (i == 0 && (letterCount != 2 && letterCount != 4 && letterCount != 7)) {
					System.out.print("* ");
				}
				// middle row
				else if ((letterCount == 1 && j == endingIndex / 2) || // for I
						(letterCount == 2
								&& (j == startingIndex || (j == endingIndex) || (j == startingIndex + NPointer)))
						|| // for N
						(letterCount == 3 && (j == startingIndex || (i == totalHeight / 2))) || // for E
						(letterCount == 4 && (j == startingIndex || j == endingIndex)) || // for U
						(letterCount == 5 && (((j == startingIndex) || (j == endingIndex && i < totalHeight / 2))
								|| i == totalHeight / 2 || (i > totalHeight / 2 && j == startingIndex + RPointer + 1)))
						|| // for R
						(letterCount == 6 && (j == startingIndex || j == endingIndex)) || // for O
						(letterCount == 7
								&& (j == startingIndex || (j == endingIndex) || (j == startingIndex + NPointer))) // for
																													// N
				) {

					System.out.print("* ");
				}
				// last row INEURON
				else if (i == totalHeight - 1 && letterCount != 2 && letterCount != 5 && letterCount != 7) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			NPointer++;
			if (i > totalHeight / 2) {
				RPointer++;
			}
			System.out.println();
		}
	}

}


/*
 sample output:
 
* * * * * * *   *         *   * * * * * *   *         *   * * * * * *   * * * * * *   *         * 
      *         * *       *   *             *         *   *         *   *         *   * *       * 
      *         *   *     *   *             *         *   *         *   *         *   *   *     * 
      *         *     *   *   * * * * * *   *         *   * * * * * *   *         *   *     *   * 
      *         *       * *   *             *         *   *     *       *         *   *       * * 
      *         *         *   *             *         *   *       *     *         *   *         * 
* * * * * * *   *         *   * * * * * *   * * * * * *   *         *   * * * * * *   *         * 
 
 
 */
