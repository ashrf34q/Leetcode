package main;

public class TrappingRain {

    private static int trap(int[] height) {

        int trapMax = 0;

        int p1 = 0, p2 = height.length-1;

        int maxL = height[p1];
        int maxR = height[p2];

        while(p1 < p2) {
            if(height[p1] <= height[p2]) {
                p1++;

                if(height[p1] > maxL){
                    maxL = height[p1];
                }
                else {
                    trapMax += (Math.min(maxL, maxR) - height[p1]);
                }

            }

            else{

                p2--;
                if(height[p2] > maxR){
                    maxR = height[p2];
                }
                else {
                    trapMax += (Math.min(maxR, maxL) - height[p2]);
                }

            }
        }

        return trapMax;
    }


    public static void main(String[] args) {

        int[] height = {5,5,1,7,1,1,5,2,7,6};

//

        System.out.println(trap(height));
    }
}



/*
  int maxL;
        int maxR;
        int trapMax = 0;

        for(int i = 0; i < height.length; i++) {

            maxL = 0; maxR = 0;

            for(int j = 0; j < i; j++) {
                if(height[j] > maxL){
                    maxL = height[j];
                }
            }
            for(int k = i+1; k < height.length; k++) {
                if(height[k] > maxR) {
                    maxR = height[k];
                }
            }

            int total =  (Math.min(maxL, maxR) - height[i]);

            if(total >= 0) {
                trapMax += total;
            }
        }

        return trapMax;
 */