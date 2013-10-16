/**
 * 
 * Creates Unsharp Masking
 */
public class UnsharpMasking implements Filter
{
  public void filter(PixelImage pi)
  {
	int[][] u = {{-1,-2,-1},{-2,28,-2},{-1,-2,-1}}; //Array to store weights for UnsharpMasking filter
    pi.getAverages(u, 0);
  }
  
}

