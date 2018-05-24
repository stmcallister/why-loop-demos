// create new array of Simpsons
const people = [
    { name: "Bart Simpson", age: 10 },
    { name: "Lisa Simpson", age: 8 },
    { name: "Marge Simpson", age: 36 },
    { name: "Maggie Simpson", age: 1 },
    { name: "Homer Simpson", age: 39 }
];

let avgAge = people.reduce((totalAge, person) => totalAge + person.age, 0)/people.length;

// let totalAge = 0;
// for (let i = 0; i < people.length; i++) {
//     totalAge = totalAge + people[i].age;
// }

// let avgAge = 0;
// avgAge = totalAge/people.length;
console.log("Avg age of the Simpsons: " + avgAge);

