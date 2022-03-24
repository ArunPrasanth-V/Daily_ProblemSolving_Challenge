function find(arr) {
    let max=-Infinity;
    let max2=max;
    let temp=0;
    for(let i of arr)
        {
            if(max<i){
              temp=max;  
                max=i;
                i=temp;
            }
                
             if(i>max2 && i!=max)
                max2=i;
        }
    return max2;
}
console.log(find([7,2,4,0,5]));
