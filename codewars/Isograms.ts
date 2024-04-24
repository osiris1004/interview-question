/* 
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false
*/


function isIsogram(str: string): boolean {
    let hasDouble = false;
    let exiting = 0
    const splittedSting = str.toLowerCase().split('')

    splittedSting.forEach(item => {
        splittedSting.forEach(item2 => {
            if (item2 === item) {
                exiting = exiting + 1
                if (exiting > 1) {
                    hasDouble = true
                    return
                }
            }
        });
        exiting = 0
    })

    return !hasDouble
}


isIsogram("Dermatoglyphics")
isIsogram("isogram")
isIsogram("aba")
isIsogram("moOse")
isIsogram("isIsogram")
isIsogram("")