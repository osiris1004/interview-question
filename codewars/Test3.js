/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.
*/
function getCount(str) {
    const vowels = ['a', 'e', 'i', 'o', 'u']
    count = 0;
    Array.from(str).forEach(element => {
        if(vowels.includes(element)){
            count =count + 1
        }
    });
    return count;
  }
console.log(getCount("abracadabra"));
