let numbers = [10,2,3,4,5,6];

Array.prototype.mySpecialFilter = function(myFun) {
    console.log("myFun: "+ myFun);
    console.log("this: "+ this);
    let filtered = [];

    for (let i = 0; i < this.length; i++){
        if (myFun(this[i])) {
            filtered.push(this[i]);
        }
    }
    return filtered;
}

let bigNums = numbers.mySpecialFilter(function(element) {
    return element > 5;
});

console.log("bigNums: "+ bigNums);