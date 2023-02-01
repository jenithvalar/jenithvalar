
async function wait(){
    await new Promise(resolve => setInterval(resolve,3000)); {
        
    console.log("UsainBolt");
        
    }
}wait();

//1.I have created a asynchronous function named wait
//2.The function has await statement -----> it waits for a promise to resolve before executing the code inside the await block
//3.I have created a promise and passed a callback function it will resolve after 3 seconds by the setInterval inbuilt function
//4.Then the code will print the console after I call the function.

//async-->allow code to to execute while it wait for the response from the async operation
//await-->it pause the execution of the function and wait for a promise to resolve.
// A promise is a  object that links the “producing code” and the “consuming code” together.
//“Producing code” is code that can take some time. “Consuming code” is a code that must wait for the result.