
/*Question: https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1/?page=1&difficulty[]=-2&difficulty[]=-1&status
[]=solved&status[]=unsolved&category[]=Arrays&sortBy=submissions */

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
    int left=0,right=n-1;
    while(left<=right){
        int mid=(left+right)/2;
      
        if(arr[mid]<k)
            left= mid+1;
        else if(arr[mid]==k)
            return mid;
         else
            right=mid-1;    
        
    }
    return -1;
    }
}
