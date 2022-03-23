function maxSubArray(arr,n) {
    if(arr.length<n)
        return null;
    let maxSum=0;
    for(let i=0;i<n;i++)
        {
           maxSum+=arr[i]; 
        }
    let tempsum=maxSum;
    for(let i=n;i<arr.length;i++)
        {
            tempsum+=arr[i-n]+arr[i];
           if(maxSum<tempsum)
           {
               maxSum=tempsum;
           }
        }
    return maxSum
}
console.log(maxSubArray([2,6,9,2,1,8,5,6,3],3));
