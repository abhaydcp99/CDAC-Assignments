//Exercise 1: Convert string to uppercase using a callback


function toUpperCase(str){
    return str.toUpperCase();
}

function processData(input, callback) {
    const result = callback(input);
    console.log(result);
}

processData("cdac juhu",toUpperCase);


/*
function toUpperCase(str) -> its a function where it takes `str` named parameter.
return str.toUpperCase(); -> here given string convert to UPPERCASE. 

function processData(input, callback) -> 

*/