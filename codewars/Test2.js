/*
Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. 
You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning or the end of the sentence!
 */

function smash(words) {
    list = Array.from(words);
    let _words = '';
    list.forEach((element, index) => {
        if (index === 0) {
            _words = _words + element;
        } else {
            _words = _words + ' ' + element;
        }
    });

    return _words;
}

console.log(smash(['hello', 'world', 'this', 'is', 'great']));
