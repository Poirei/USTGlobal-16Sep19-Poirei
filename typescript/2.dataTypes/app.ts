let user : string = 'Poirei'
console.log(user, typeof user);

let phoneNo = 7013070619
console.log(phoneNo, typeof phoneNo);

let age : number
age = 24
console.log( age, typeof age);

let email
email = 'poirei4@gmail.com'
email = 4
console.log(typeof email);

let fun = () : void => {
    console.log(typeof 4);
}
fun()

function fun1() : void {
    console.log('fun1() executed');
}
fun1()

console.log('===================================');

class Person {
    constructor(public name : string, public age : number) {
    }
}
console.log(new Person('Mike', 24));

class Student extends Person {
    constructor(name : string, age : number, public rollNo : number) {
        super(name, age)
    }
}
console.log(new Student('Dustin', 27, 114));