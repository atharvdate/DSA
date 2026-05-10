package arrays;

public class TrappingRainwater {
    public static int trappedRainWater(int[] height){
        int n = height.length;
        // leftmax boundary
        int[] leftmax = new int[n];
            leftmax[0] = height[0];
            for(int i=1; i<n; i++){
                leftmax[i] = Math.max(height[i], leftmax[i-1]);
            }

        // rightmax boundary
        int[] rightmax = new int[n];
            rightmax[n-1] = height[n-1];
                for(int i=n-2; i>=0; i--){
                    rightmax[i] = Math.max(height[i], rightmax[i+1]);
                }

        // water level on individual bar
        int trappedWater=0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(rightmax[i], leftmax[i]);
            trappedWater += (waterLevel-height[i])*1;
        }
        return trappedWater;
        // trapped water


    }


    public static void main(String[] args){
        int[] height = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}