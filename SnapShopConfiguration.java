/*
 *I was surprised to learn that there is more than one convolution matrix that will produce an emboss effect. 
 *Unlike the other transformations, for the emboss filter it was necessary to add an offset of 128 to the RGB 
 *averages. When I first tested the filter, though the resulting image was mostly gray, small areas of blue, 
 *green and red pixels were still visible. To create an entirely monochrome image, I had to add a grayscale 
 *method. The simplest formula, which involves adding the values of the red, green, and blue pixels, then 
 *dividing the sum by 3,produced a flat image that is, the image lost some luminosity. Instead, 
 *I used the formula, red*(0.299), g*(0.587), b*(0.114) which produced a brighter grayscale image.
 */

/**
 * 
 * 
 * @author Helen Lawrence
 * @version 1.2 8/10/2013
 */
public class SnapShopConfiguration {
	/**
	 * Method to configure the SnapShop. Call methods like addFilter and
	 * setDefaultFilename here.
	 * 
	 * @param theShop
	 *            A pointer to the application
	 */
	public static void configure(SnapShop theShop) {
		theShop.setDefaultFilename("billg.jpg");
		theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
		theShop.addFilter(new FlipVerticalFilter(), "Flip Vertical");
		theShop.addFilter(new NegativeFilter(), "Negative");
		theShop.addFilter(new Gaussian(), "Gaussian");
		theShop.addFilter(new Laplacian(), "Laplacian");
		theShop.addFilter(new UnsharpMasking(), "Unsharp Masking");
		theShop.addFilter(new Edgy(), "Edgy");
		theShop.addFilter(new Emboss(), "Emboss");
		// add your other filters below
	}
}
