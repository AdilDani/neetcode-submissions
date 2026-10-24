class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length - 1;
        int result = area(heights, i, j);
        int area;
        while(i<j){
            if(heights[i]>heights[j]){
                j--;
            }
            else {
                i++;
            }

            area= area(heights, i, j);
            result=Math.max(result,area);
        }

        return result;


    }



    public int area(int[] heights, int i, int j){
        return Math.min(heights[i], heights[j]) * (j - i);
    }

}
