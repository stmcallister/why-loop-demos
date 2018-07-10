let numbers = [10,2,3,4,5,6];

let bigNums = numbers.mySpecialFilter(function(element) {
    return element > 5;
});

console.log("bigNums: "+ bigNums);