/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers. 
The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. 
Write a method that takes the array as an argument and returns this "outlier" N.
 */

function findOutlier(integers) {
    //your code here
    let result;
    const sum = integers.reduce((accumulator, currentValue) => accumulator + currentValue, 0);

    if (sum % 2 !== 0) {
        const invalidValue = integers.find((value) => value % 2 !== 0);
        result = invalidValue;
    } else {
        const invalidValue = integers.find((value) => value % 2 === 0);
        result = invalidValue;
    }
    return result;
}

console.log(findOutlier([2, 4, 0, 100, 4, 11, 2602, 36]));
console.log(findOutlier([160, 3, 1719, 19, 11, 13, -21]));
