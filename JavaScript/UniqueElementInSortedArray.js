function count(arr)
{
    let count=0;
    for(let i=0;i<arr.length;i++)
    {
       let bool=true;
        while(i<arr.length-1 && arr[i]===arr[i+1])
        {bool=false;
                i++;
        }
        if(bool==true)
            count++;
    }
    return count;
}
console.log(count([1,1,1,2,3,3,4,5,6]));
