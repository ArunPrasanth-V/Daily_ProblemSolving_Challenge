function calc(arr) {
    let meh=0;
    let msf=0;
    for(let i of arr){
        meh+=i;
        if(meh<i)
            meh=i;
        if(msf<meh)
            msf=meh;
    }
    return msf;
}

console.log(calc([1,2,-3,-4,-2,6,5,4,-1]));
