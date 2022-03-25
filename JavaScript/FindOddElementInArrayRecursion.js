function check(arr){ 
 oddarray=[]
    if(arr.length==0)
        return oddarray;
    if(arr[0]%2!=0)
    {
       oddarray.push(arr[0]);
    }
    oddarray=oddarray.concat(check(arr.slice(1)));
    return oddarray;
}

const arr=[1,2,3,4,5];
console.log(check(arr));

