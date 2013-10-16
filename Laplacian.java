/**
 * 
 * Creates a Laplacian transformation
 */
public class Laplacian implements Filter
{
  public void filter(PixelImage pi)
  {
	int[][] lap = {{-1,-1,-1},{-1,8,-1},{-1,-1,-1}}; //Array to store weights for Laplacian filter
    pi.getAverages(lap, 0);
  }
  
}

