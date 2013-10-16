/**
 * 
 * Creates a Gaussian blur
 */
public class Gaussian implements Filter
{
  public void filter(PixelImage pi)
  {
	int[][] g = {{1,2,1},{2,4,2},{1,2,1}}; //Array to store weights for Gaussian filter
    pi.getAverages(g, 0);
  }
  
}
