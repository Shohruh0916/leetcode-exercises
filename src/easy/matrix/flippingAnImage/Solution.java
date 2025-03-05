package easy.matrix.flippingAnImage;

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i=0; i<image.length; i++) {
            for (int j=0; j<(image.length+1)/2; j++) {
                if (j!=image.length-1-j) {
                    int swap =image[i][j];
                    image[i][j]=image[i][image.length-1-j];
                    image[i][image.length-1-j] = swap;
                }
                if (image[i][j]==0) {
                    image[i][j]=1;
                } else {
                    image[i][j]=0;
                }
                if (j!=image.length-1-j) {
                    if (image[i][image.length-1-j]==0) {
                        image[i][image.length-1-j]=1;
                    } else {
                        image[i][image.length-1-j]=0;
                    }
                }
            }
        }
        return image;
    }
}
