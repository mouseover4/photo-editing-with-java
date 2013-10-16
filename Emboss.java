/**
 * 
 * Creates a Test transformation
 */
public class Emboss implements Filter
{
  public void filter(PixelImage pi)
  {
	pi.grayScale();
	int[] t1 = {-18,-9,0,-9,9,9,0,9,18}; //Array to store weights for Test filter
	int[] t2 = {0,0,0,0,9,-3,0,-3,-3}; //Array to store weights for Test filter
	int[][] t = {{2,0,0},{0,-1,0},{0,0,-1}}; //Array to store weights for Test filter
    pi.getAverages(t, 128);
   
  }
  
  //http://beej.us/blog/data/convolution-image-processing/
  //http://lodev.org/cgtutor/filtering.html
  //http://entropymine.com/imageworsener/grayscale/
  //http://www.tannerhelland.com/3643/grayscale-image-algorithm-vb6/
  
  
}

