class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double pr=0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int m=discounts.length;
        int n=prices.length;
        int i=n-1;
        int j=m-1;
            while(i>=0 && j>=0){
           pr=pr+prices[i]*(100.0-discounts[j])/100.0;
        i--; j--;     
            }
        while(i>=0){
        pr=pr+prices[i];
            i--;
        }
        return pr;
    }
}
