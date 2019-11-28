var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var user = 'Poirei';
console.log(user, typeof user);
var phoneNo = 7013070619;
console.log(phoneNo, typeof phoneNo);
var age;
age = 24;
console.log(age, typeof age);
var email;
email = 'poirei4@gmail.com';
email = 4;
console.log(typeof email);
var fun = function () {
    console.log(typeof 4);
};
fun();
function fun1() {
    console.log('fun1() executed');
}
console.log('===================================');
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
console.log(new Person('Mike', 24));
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(name, age, rollNo) {
        var _this = _super.call(this, name, age) || this;
        _this.rollNo = rollNo;
        return _this;
    }
    return Student;
}(Person));
console.log(new Student('Dustin', 27, 114));
