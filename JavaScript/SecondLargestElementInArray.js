function find(arr) {
    let max=-Infinity;
    let max2=max;
    for(let i of arr)
        {
            if(max<i)
                max=i;
            if(i>max2 && i!=max)
                max2=i;
        }
    return max2;
}
console.log(find([7,2,4,0,5]));
