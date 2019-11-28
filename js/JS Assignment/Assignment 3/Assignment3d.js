var sp_brand = [`Motorola`, `Apple`, `Samsung`,, {key : 10}, null, undefined]
// console.log(sp_brand);
var price = [16000, 65000, 20990,, null]
// console.log(price);
price[5] = 10000
// console.log(price);
var laptop = [
    {
        brand : 'ROG',
        cost : 149000,
        color : 'Black',
        gaming : true
    },
    {
        brand : 'hp',
        cost : 56000,
        color : 'Blue',
        gaming : false
    },
    {
        brand : 'Aorus',
        cost : 89000,
        color : 'Green',
        gaming : true
    },
    {
        brand : 'Razer',
        cost : 265000,
        color : 'Silver',
        gaming : true
    }
]
var fun1 = () => {
    console.log(`First function executed.`);
}
var fun2 = () => {
    console.log(`Second function executed.`);
}
var fun3 = () => {
    console.log(`Third function executed.`);
}
var fun4 = () => {
    console.log(`Fourth function executed.`);
}
var fun = [fun1(), fun2(), fun3(), fun4()]
var todayDate = new Date()
// console.log(todayDate);
var date = [todayDate.getDate(), todayDate.getDay(), todayDate.getFullYear(), todayDate.getHours(), todayDate.getMinutes()]
var math = [Math.ceil(45.5), Math.floor(46.5), Math.floor(39.9), Math.PI]
var num = [23, 'String', null, true, false, undefined, 39.8, price]
var str = ['Poirei', 'Gautam', 'Assass!N', 'RyzenKpns', todayDate, date]
var bool = [true, true, false, 'Yo', 'Drake', 24, num]
var a = () => {
    setTimeout(() => {
        console.log("a executed.");
        b()
    }, 4000);
}
var b = () => {
    console.log('b executed.');
}
var zigzag = [a, , b]
console.log(`---------Using forEach function :---------`);
console.log(`+++++++++++++++++++++++++++`);
sp_brand.forEach(function(val, index) {
    console.log(`Brand :`, val);
})
console.log(`+++++++++++++++++++++++++++`);
price.forEach(function(val, index) {
    console.log(`Price :`, val);
})
console.log(`+++++++++++++++++++++++++++`);
laptop.forEach(function(val, index) {
    console.log(`Laptop.brand :`, val.brand,`| Cost :`, val.cost,`| Color :`, val.cost,`| Gaming :`, val.gaming);
})
console.log(`+++++++++++++++++++++++++++`);
fun.forEach(function(val, index) {
    console.log(val);
})
console.log(`+++++++++++++++++++++++++++`);
date.forEach(function(val, index) {
    switch (index) {
        case 0:
            console.log(`Date :`, date[index]);
            break;
        case 1:
            console.log(`Day :`, day[date[index]]);
            break;
        case 2:
            console.log(`Year :`, date[index]);
            break;
        case 3:
            console.log(`Hours :`, date[index]);
            break;
        case 4:
            console.log(`Minutes :`, date[index]);
            break;
        default:
            break;
    }
})
console.log(`+++++++++++++++++++++++++++`);
math.forEach(function(val, index) {
    console.log(`Value :`, val);
})
console.log(`+++++++++++++++++++++++++++`);
num.forEach(function(val, index) {
    console.log(val);
})
console.log(`+++++++++++++++++++++++++++`);
str.forEach(function(val, index) {
    console.log(val);
})
console.log(`+++++++++++++++++++++++++++`);
bool.forEach(function(val, index) {
    console.log(val);
})
console.log(`+++++++++++++++++++++++++++`);
zigzag.forEach(function(val, index) {
    console.log(val());
})