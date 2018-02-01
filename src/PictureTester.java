/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("beach.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}
	
	public static void testEdgeDetection2() {
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection2(10);
		swan.explore();
	}

	public static void testKeepOnlyBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyRed();
		beach.explore();
	}

	public static void testKeepOnlyRed() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyRed();
		beach.explore();
	}

	public static void testKeepOnlyGreen() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyGreen();
		beach.explore();
	}

	public static void testNegate() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();
	}

	public static void testGrayscale() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.greyscale();
		beach.explore();
	}

	public static void testFixUnderwater() {
		Picture water = new Picture("water.jpg");
		water.explore();
		water.fixUnderwater();
		water.explore();
	}

	public static void testMirrorVerticalRightToLeft() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorVerticalRightToLeft();
		beach.explore();
	}

	public static void testMirrorHorizontal() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorHorizontal();
		beach.explore();
	}

	public static void testMirrorHorizontalBotToTop() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorHorizontalBotToTop();
		beach.explore();
	}
	
	public static void testMirrorDiagonal() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorDiagonal();
		beach.explore();
	}

	public static void testMirrorArms() {
		Picture snowman = new Picture("snowman.jpg");
		snowman.explore();
		snowman.mirrorArms();
		snowman.explore();
	}

	public static void testMirrorGull() {
		Picture gull = new Picture("seagull.jpg");
		gull.explore();
		gull.mirrorGull();
		gull.explore();
	}

	public static void testCopy() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage2();
		canvas.explore();

	}

	public static void testEncode() {
		Picture beach = new Picture("beach.jpg");
		beach.encode();
		beach.explore();
	}
	
	public static void testEncodeAndDecode() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.encode();
		beach.explore();
		beach.decode();
		beach.explore();
	}
	
	public static void exploreMessage() {
		Picture message = new Picture("msg.jpg");
		message.explore();
	}
	
	public static void testChromakey() {
		//This Method Only Exists To Prevent An Error
	}
	
	public static void testGetCountRedOverValue(int fillerInt) {
		//This Method Only Exists To Prevent An Error
	}
	
	public static void testSetRedToHalfValueInTopHalf() {
		//This Method Only Exists To Prevent An Error
	}
	
	public static void testClearBlueOverValue(int fillerInt) {
		//This Method Only Exists To Prevent An Error
	}
	
	public static void testGetAverageForColumn(int fillerInt) {
		//This Method Only Exists To Prevent An Error
	}
	
	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		//--------Color Alteration Methods---------//
		testZeroBlue(); //Removes all blue from picture
		testKeepOnlyBlue(); //Keeps only blue in picture
		testKeepOnlyRed(); //Keeps only red in picture
		testKeepOnlyGreen(); //Keeps only green in picture
		testNegate(); //Inverts all colors in picture
		testGrayscale(); //averages all colors in picture
		testFixUnderwater(); //Highlights fish in water.jpg
		//-------------Mirror Methods--------------//
		testMirrorVertical(); //mirrors left to right
		testMirrorVerticalRightToLeft(); //mirrors right to left
		testMirrorHorizontal(); //mirrors top to bottom 
		testMirrorHorizontalBotToTop(); // mirrors bottom to top
		testMirrorDiagonal(); //mirrors bottom left to top right
		testMirrorTemple(); //mirrors top of temple, making temple look "fixed"
		testMirrorArms(); //doubles the arms of a snowman
		testMirrorGull(); //creates a second segull, now they are friends
		//-------------Collage Methods-------------//
		testCollage(); //creates a collage of flowers
		testCopy(); //creates a collage of koalas with mirrors
		//----------Edge Detection Methods---------//
		testEdgeDetection(); //detects edges through difference of left & right
		testEdgeDetection2(); //detects edges through difference of top & bottom
		//----------Steganography Methods----------//
		testEncodeAndDecode(); //Encodes & Decodes, View This Method
		//-----------Unused Methods Below----------//
		testChromakey(); //unused method
		testGetCountRedOverValue(250); //unused method
		testSetRedToHalfValueInTopHalf(); //unused method
		testClearBlueOverValue(200); //unused method
		testGetAverageForColumn(0); //unused method
	}
}