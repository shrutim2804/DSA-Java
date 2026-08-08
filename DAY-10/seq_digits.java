Leetecode qs no=1291

=======================================================================================================================================
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> op=new ArrayList<>();
        String s="123456789";
        for(int len=2;len<=9;len++){
            for(int i=0;i+len<=9;i++){
                String part=s.substring(i,i+len);
                 int num=Integer.parseInt(part);
                 if(num>=low && num<=high){
                    op.add(num);
                 }
            }
        }
        return op;
    }
}
