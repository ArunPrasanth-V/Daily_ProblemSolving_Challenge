function ana(first,last)
{
    if(first.length !==last.length)
        return false;
    const lookup={};
    for(let i=0;i<first.length;i++)
    {
     let letter=first[i];
        lookup[letter] ? lookup[letter]+=1:lookup[letter]=1;
    }
    for (let i = 0; i < last.length; i++) {
       let letter=last[i];
        if(!lookup[letter])
            return false;
        else
            lookup[letter]-=1;
    }
    return true;
}
console.log(ana("anagram","anagrm"));
