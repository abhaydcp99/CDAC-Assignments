// Exercise 3: Simulate network request with setTimeout

function fetchData(url, callback){
    setTimeout(() => {
        const response = `Fetched data from ${url}`;
        callback(response);
    },1000);    // -- to give 1 sec delay
}

fetchData("https://specialforce.com", function(response){
    console.log(response);
});