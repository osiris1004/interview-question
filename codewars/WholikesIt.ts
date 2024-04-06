/* 
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
Note: For 4 or more names, the number in "and 2 others" simply increases.

*/

function likes(a: string[]): string {

    if (a.length == 0) {
        return 'no one likes this'
    }

    if (a.length == 1) {
        return `${a[0]} likes this`
    }

    if (a.length == 2) {
        return `${a[0]} and ${a[1]} like this`
    }
    
    return `${[...a].splice(0, 2).map((data, i)=> i===0 ? data : ` ${data}`).join()} and ${a.length - 2 === 1 ? a[a.length - 1] : `${a.length - 2 } others`} like this`

}


console.log(likes([]))
console.log(likes(['Peter']))
console.log(likes(['Jacob', 'Alex']))
console.log(likes(['Max', 'John', 'Mark']))
console.log(likes(['Alex', 'Jacob', 'Mark', 'Max']))


console.log(['Max', 'John', 'Mark'].splice(0, 2).map((data, i)=> i===0 ? data : ` ${data}`))