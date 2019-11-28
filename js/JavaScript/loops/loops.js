var brands = ['Kingfisher', 'Bisleri', 'Kinley', 'Aqua']
console.log('For of loop')
for(var brand of brands) {
    console.log('Brand =', brand)
}
console.log('===========================================')

console.log(`For in loop`)
for (var index in brands) {
    console.log('Brand =', brands[index])
}
console.log('===========================================')

var person = {
    name : 'Poirei',
    age : 24,
    color : 'White'
}
for(var key in person) {
    console.log('Value =', person[key]);
}
console.log('===========================================')
console.log(`For each function`);

var movies = [`Titanic`, `Zero Dark Thirty`, `Fury`, `Avengers : Endgame`];
movies.forEach(function(value, index) {
    console.log(`Movie =`, value)
})
console.log(`+++++++++++++++++++++++++++++++++++++++++++`)
var items = [
    {
        item : 'Lipstick',
        id : 1,
        price : 500
    },
    {
        item : 'Bangles',
        id : 2,
        price : 100
    },
    {
        item : 'Watch',
        id : 3,
        price : 5000
    },
    {
        item : 'Laptop',
        id : 4,
        price : 150000
    }
]
items.forEach(function(val, index) {
    console.log(`Item =`, items[index])
})
console.log('======================')
console.log('Using for loop')
console.log('======================')

for (var index = 0; index < items.length; index++) {
    console.log('Item =', items[index])
}
console.log(`===================================`)

var numbers = [10, 20, 30, 40, 50, ,60]
console.log(numbers)

for (var index = 0; index < numbers.length; index++) {
    console.log('Number =', numbers[index]);
    break;
}

numbers.forEach(function(val, index) {
    console.log(`Number =`, val);
    console.log(`Index =`, index);
})

for(var index of numbers) {
    console.log(index);
    break;
}

for(var index in numbers) {
    console.log('Number =', numbers[index]);
    break;
}