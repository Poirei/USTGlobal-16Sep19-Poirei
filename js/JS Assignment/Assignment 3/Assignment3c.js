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
console.log(`Using for-of loop : `);
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var iterator of sp_brand) {
    console.log(`Brand :`, iterator);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var iterator of price) {
    console.log(`Price :`, iterator);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var iterator of laptop) {
    console.log(`Laptop.brand :`, iterator.brand,'| Cost :', iterator.cost,
    '| Color :', iterator.color,'| Gaming:', iterator.gaming)
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var iterator of fun) {
    console.log(iterator);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
var day = ['Sunday', 'Monday', 'Tueday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
for (var iterator of date) {
    if (iterator === todayDate.getDate())
        console.log(`Date :`, iterator);
    else if (iterator === todayDate.getDay())
        console.log(`Day :`, day[iterator]);
    else if (iterator === todayDate.getFullYear())
        console.log(`Year :`, iterator);
    else if (iterator === todayDate.getHours())
        console.log(`Hours :`, iterator);
    else if (iterator === todayDate.getMinutes())
        console.log(`Minutes :`, iterator);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var iterator of math) {
    console.log(`Value :`, iterator);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var iterator of num) {
    console.log(`Number :`, iterator);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var iterator of str) {
    console.log(`String :`, iterator);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var iterator of bool) {
    console.log(`Boolean :`, iterator);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var iterator of zigzag) {
    console.log(iterator);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
console.log(`++++++++++++++++++++++++++++++++++++`);
