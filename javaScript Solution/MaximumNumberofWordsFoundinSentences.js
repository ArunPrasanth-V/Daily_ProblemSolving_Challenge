// 2114. Maximum Number of Words Found in Sentences
// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/


var mostWordsFound = function(sentences) {
    return Math.max(  ...sentences.map(words=>words.split(" ").length) ) 
};
