// create new array of Simpsons
// Who can drink at Moe's?
const people = [
    { name: "Bart", age: 10 },
    { name: "Lisa", age: 8 },
    { name: "Marge", age: 36 },
    { name: "Maggie", age: 1 },
    { name: "Homer", age: 39 }
];

const drinkingAge = 21;
let adults = people.filter((person) => person.age >= drinkingAge); 

console.log("people: "+ JSON.stringify(people));
console.log();
console.log("adults: " + JSON.stringify(adults));
