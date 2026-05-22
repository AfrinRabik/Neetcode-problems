class Solution 
{
    public String reverseStr(String s, int k) 
    {
        char c[]=s.toCharArray();
        for(int start = 0; start < c.length; start += 2 * k)
        {
            int left = start;
            int right = Math.min(start + k - 1, c.length - 1);
        
       
        while(left<right)
        {
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
        
    }
    return new String(c);
}
}
