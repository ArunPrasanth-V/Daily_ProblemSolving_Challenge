oddarray=[]
function check(arr){ 
    if(arr.length==0)
        return;
    if(arr[0]%2!=0)
    {
       oddarray.push(arr[0]);
    }
    check(arr.slice(1));
}

const arr=[1,2,3,4,5];
console.log(check(arr));
console.log(oddarray);
