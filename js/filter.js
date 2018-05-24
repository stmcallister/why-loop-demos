// create new array of Simpsons
// Who can drink at Moe's?
const people = [
    { name: "Bart Simpson", age: 10 },
    { name: "Lisa Simpson", age: 8 },
    { name: "Marge Simpson", age: 36 },
    { name: "Maggie Simpson", age: 1 },
    { name: "Homer Simpson", age: 39 }
];

const drinkingAge = 18;
const adults = people.filter((person => person.age >= drinkingAge));

// let adults = [];

// for(let i = 0; i < people.length; i++) {
//     if (people[i].age >= drinkingAge) {
//         adults.push({ name: people[i].name, age: people[i].age });
//     }
// }


console.log("people: "+ JSON.stringify(people));
console.log();
console.log("adults: " + JSON.stringify(adults));
