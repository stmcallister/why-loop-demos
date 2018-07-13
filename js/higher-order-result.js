var numbers = [1,2,3,4,5,6];

Array.prototype.myFilter = function(origFun) {
    console.log(origFun);
    console.log(this);
    var filtered = [];

    for(let i = 0; i < this.length; i++) {
        if (origFun(this[i], i, this)) {
            filtered.push(this[i]);
        }
    }

    return filtered;
}

var biggerThanFive = numbers.myFilter(function(element, index, array) {
    return element > 5;
});

console.log(biggerThanFive); 