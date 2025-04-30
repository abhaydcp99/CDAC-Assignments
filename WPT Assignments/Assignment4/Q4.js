// Exercise 4: Add error handling in fetchData

function fetchData(url, callback){
    setTimeout(() => {
        const error = false;
        if(error){
            callback("Error: Failed to fetch data",null);
        }else{
            const response = `Fetched data from ${url}`;
            callback(null, response);
        }
    },1000);
}

fetchData("https://specialforce.com", function(err, response){
    if(err){
        console.log(err);
    }else{
        console.log(response);
    }
});