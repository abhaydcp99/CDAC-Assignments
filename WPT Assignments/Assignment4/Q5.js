//  Exercise 5: Chain fetchData and processData using nested callbacks

function fetchData(url, callback){
    setTimeout(() => {
        const error = false;
        if (error) {
            callback("Error : Failed to each fetch data", null);
        }else {
            const response = `Fetched data from ${url}`;
            callback (null, response);
        }
    },1000);
}

function processData (data, callback) {
    const processed = data + " -> processed";
    callback(processed);
}

fetchData("https://specialforce", function(err, response){
    if(err){
        console.error(err);
    }else {
        processData (response, function(finalResult){
            console.log(finalResult);
            
        });
    }
});