/**
 * 
 * Applies an Edgy filter
 */
public class Edgy implements Filter
{
  public void filter(PixelImage pi)
  {
	int[][] e = {{-1,-1,-1},{-1,9,-1},{-1,-1,-1}}; //Array to store weights for Edgy filter
    pi.getAverages(e, 0);
  }
  
}

