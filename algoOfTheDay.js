const nestedArray = [2, [1, 2, 3, [9, 6, 7]], 0];
console.log(sortNumber(flattening(nestedArray)))



function sortNumber(data) {
    let isNotSorted = true;
    let index = 0;
    while (isNotSorted) {
        if (index === data.length - 1) isNotSorted = false;
        else if (data[index] <= data[index + 1]) {
        } else {
            const temp = data[index];
            data[index] = data[index + 1];
            data[index + 1] = temp;
            index = 0;
            continue;
        }
        index++;
    }
    return data;
}

function flattening(array){
    const  newArray = [];
    arrayExist(array,array.length)
    function arrayExist (array, arrayLength) {
        let index = 0;
        while (index < arrayLength) {
            if (typeof array[index] === 'object') {
                arrayExist(array[index], array[index].length);
            } else {
                newArray.push(array[index])
            }
            index++;
        }
    }
    return newArray
}


