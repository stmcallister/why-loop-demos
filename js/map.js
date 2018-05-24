// create new array of aging Simpsons
// Simpson's age?
const people = [
    { name: "Bart Simpson", age: 10 },
    { name: "Lisa Simpson", age: 8 },
    { name: "Marge Simpson", age: 36 },
    { name: "Maggie Simpson", age: 1 },
    { name: "Homer Simpson", age: 39 }
];

// const aged = people.map((person) => { return { name: person.name, age: person.age + 1 }; });
let aged = [];

for (let i = 0; i < people.length; i++) {
    let person = {
        name: people[i].name,
        age: people[i].age + 1
    }
    aged.push(person);
}

console.log("people: "+ JSON.stringify(people));
console.log();
console.log("aged: " + JSON.stringify(aged));
