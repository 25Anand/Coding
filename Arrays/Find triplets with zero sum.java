
Question: /*   https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1/?page=1&difficulty[]=-2&
               difficulty[]=-1&status[]=solved&status[]=unsolved&category[]=Arrays&sortBy=submissions    */

class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        // boolean found=false;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            int left=i+1, right=n-1,sum;
            while(left<right)
            {
                sum=arr[i]+arr[left]+arr[right];
                if(sum==0)
                {
                    return true;
                }else if(sum<0){
                   left++ ;
                }
                else{
                    right--;
                }
            }
            
        }
        return false;
    }
}
