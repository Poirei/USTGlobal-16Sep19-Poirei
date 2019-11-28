//Named Functions

function add(num1, num2) {
    console.log('Sum =', num1 + num2)
}
add(10, 20, 40)
function add(num1, num2, num3) {
    console.log('Sum =', num1 + num2 + num3)
}
add(10, 20, 30)

//Function Expression/ Anonymous Functions

var sub = function (num1, num2) {
    return num1 - num2;
}
console.log('Difference :', sub(10, 20))

//IIFE / SIF
console.log('Hello')
;(function (num1, num2) {
    console.log('Value :', num1 + num2);
})(10, 20)

//Fat Arrow Functions

var product = (num1, num2) => console.log(num1 * num2)
product(10, 20)

// Examples

// greet('Dinga')
var greet = function(str) {
    console.log('Hello', str)
}
greet('Dinga')

// wave()
var wave = str => console.log('You waved to Dinga')
wave()
console.log("-------------------------------------------");

// Var Hoisting :

console.log(hoist)
var hoist

console.log(a)
var a = 10;
console.log(a)

var fun = () => {
    console.log(a)
    var a = 20;
    console.log(a)
}
fun()