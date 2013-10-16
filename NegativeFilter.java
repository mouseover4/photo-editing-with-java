/**
 * Filter that creates a negative image.
 */
public class NegativeFilter implements Filter
{
  public void filter(PixelImage pi)
  {
    Pixel[][] data = pi.getData();

    for (int row = 0; row < pi.getHeight(); row++)
    {
      for (int col = 0; col < pi.getWidth(); col++)
      {
    	//get rgb values of the pixel
        Pixel p = data[row][col];
        int red = p.red;
        int green = p.green;
        int blue = p.blue;
        
        //calculate negtive colors by subtracting the original rgb values from 255
        int negativeRed = 255 - red;
        int negativeGreen = 255 - green;
        int negativeBlue = 255 - blue;
        
        //assign new color values
        p.red = negativeRed;
        p.green = negativeGreen;
        p.blue = negativeBlue;
      }
    }

    pi.setData(data);
  } 
}