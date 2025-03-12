/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumCount = function(nums) {
    let pos = 0;
    let neg = 0;
    for (let num of nums) {  // Fixed the syntax error here
        if (num > 0) pos++;
        else if (num < 0) neg++; // Ensuring only negative numbers are counted
    }
    return Math.max(pos, neg);
};
