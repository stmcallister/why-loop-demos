// chain: triple all the odd values
let numbers = [1,2,3,4,5,6,7,8,9,10];  
// goes from left to right. filter first and then map
let result = numbers
                    // get odds
                    .filter((n) => n % 2 !== 0)
                    // triple
                    // .map((odd) => odd * 3)
                    // reduce to the sum of the tripledOdds
                    // .reduce((total, currentElement) => total + currentElement,0);
                        
console.log("numbers: "+ numbers);
console.log("result: "+ result);

