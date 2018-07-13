// create new array of Simpsons
const people = [
    { name: "Bart Simpson", age: 10, admission: 15 },
    { name: "Lisa Simpson", age: 8, admission: 12 },
    { name: "Marge Simpson", age: 36, admission: 18 },
    { name: "Maggie Simpson", age: 1, admission: 5 },
    { name: "Homer Simpson", age: 39, admission: 20 }
];

let totalCost = people.reduce((total, person) => total + person.admission, 0);

console.log("Total cost for the Simpsons: $" + totalCost);

