
import java.security.SecureRandom;

public class DrawIfs {

	private static final int width = 449, height = 519, scale = -500;
	private static final int xOffset = 439, yOffset = 509;
	static final double values[][] = { { 0.50, 0.00, 0.00, 0.50, 0.00, 0.33 }, { 0.50, 0.00, 0.00, 0.50, 0.50, 0.33 },
			{ 0.50, 0.00, 0.00, 0.43, 0.25, 0.34 }, };

	static int[][] drawIfs() {

		int points[][] = new int[height][width];
		double x = 0, y = 0, u, v;
		int xDisp, yDisp;

		SecureRandom rnd = new SecureRandom();

		for (int i = 0; i < width * height; i++) {
			double randomNumber = rnd.nextDouble();

			int rowNumber;		

			if (randomNumber >= 0 && randomNumber < 0.33) {
				rowNumber = 0;
			} else if (randomNumber >= 0.33 && randomNumber < 0.66) {
				rowNumber = 1;
			} else {
				rowNumber = 2;
			}
			double[] rows = values[rowNumber];

			u = rows[0] * x + rows[1] * y + rows[4];
			v = rows[2] * x + rows[3] * y + rows[5];
			x = u;
			y = v;
			xDisp = (int) Math.floor(x* scale) + xOffset;
			yDisp = (int) Math.floor(y* scale) + yOffset;
			//System.out.println (xDisp + "," + yDisp);
			points[yDisp][xDisp] += 1;
		}
		return points;
	}

	public static void main(String[] args) {
		IfsViewer.view(drawIfs());

	}
}//end of class
