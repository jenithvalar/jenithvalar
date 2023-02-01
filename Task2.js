function delay(){
    for(let number=1; number<=10; number++){
        setTimeout(function(){
            console.log(number);
        },1000*number);
    }
} delay();

//1.created a function called delay
//2.for loop to print numbers from 1 to 10 with delay
//3.Inside the forloop I have initialized number to 1.
//4.Next the condition 1 is less than or equal to 10 the condition runs upto the number is lesser than 10.
//5.Then increments the number at each iteration using i++
//6.I am using the setTimeout in-built method to set the time delaying of (1 second * current value )