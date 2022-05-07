function sort(arr)
{
  for(let i=0;i<arr.length;i++)
    {
        let a=0;
        let isSwap=true;
        for(let j=1;j<arr.length-i;j++)
        {
            if(arr[a]>arr[j])
            {
                let temp=arr[a];
                arr[a]=arr[j];
                arr[j]=temp;
                isSwap=false;
            }
            a++;
        }
        if(isSwap)
                 break;
    }
    return arr;
}
console.log(sort([8,5,1,4,3,2,10,7]));
