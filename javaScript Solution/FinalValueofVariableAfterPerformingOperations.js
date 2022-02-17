// 2011. Final Value of Variable After Performing Operations
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

var finalValueAfterOperations = function(operations) {
   
  return operations.reduce((acumulator,currentval)=>
     {
      return (currentval==="++X"||currentval==="X++"?acumulator+1:acumulator-1)
     },0);
};
