package main;

public class WaterContainer {

    private static int maxArea(int[] height){
        int maxArea = 0;
        int tempArea;



        int p1 = 0;
        int p2 = height.length-1;

            while(p1 < p2) {
                tempArea = Math.min(height[p1], height[p2]) * (p2-p1);
                maxArea = Math.max(tempArea, maxArea);

                if(height[p1] <= height[p2]) {
                    p1++;
                }
                else{
                    p2--;
                }
            }



        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {9, 4, 7, 6, 3};

        System.out.println(maxArea(height));

    }
}

//        tempArea = Math.min(height[i], height[j]) * (j-i);
//        maxArea = Math.max(tempArea, maxArea);