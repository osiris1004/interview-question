
function findIt(a: number[]):  number {

    let count: number = 0
    let result: number = 0;

    for (let i = 0; i < a.length; i++) {
        [...a].forEach(data2 => { if (data2 === a[i]) count = count + 1 })
        if (count % 2 !== 0) {
            result = a[i]
            break
        }

    }
    return result;
}


console.log(findIt([20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5]));
console.log(findIt([1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5]));
console.log(findIt([20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5]));
console.log(findIt([10]));
console.log(findIt([1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1]));
console.log(findIt([5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10]));



