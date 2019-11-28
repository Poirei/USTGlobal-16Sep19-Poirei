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
console.log(`Using for-in loop :`);
for (var i in sp_brand) {
    console.log(`Brand :`, sp_brand[i]);
}
console.log(`+++++++++++++++++++++++++++`);
for (var i in price) {
    console.log(`Price :`, price[i]);
}
console.log(`+++++++++++++++++++++++++++`);
for (var i in laptop) {
    console.log(`Laptop.brand :`, laptop[i].brand,`| Cost :`, laptop[i].cost,`| Color :`, laptop[i].color,`| Gaming :`, laptop[i].gaming);
}
console.log(`+++++++++++++++++++++++++++`);
for (var i in fun) {
    console.log(fun[i]);
}
console.log(`+++++++++++++++++++++++++++`);
var day = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
for (var i in date) {
    if (i == 0)
        console.log(`Date :`, date[i]);
    else if (i == 1)
        console.log(`Day :`, day[date[i]]);
    else if (i == 2)
        console.log(`Year :`, date[i]);
    else if (i == 3)
        console.log(`Hours :`, date[i]);
    else if (i == 4)
        console.log(`Minutes :`, date[i]);
}
console.log(`+++++++++++++++++++++++++++`);
for (var i in math) {
    console.log(`Value :`, math[i]);
}
console.log(`+++++++++++++++++++++++++++`);
for (var i in num) {
    console.log(`Number :`, num[i]);
}
console.log(`+++++++++++++++++++++++++++`);
for (var i in str) {
    console.log(`String :`, str[i]);
}
console.log(`+++++++++++++++++++++++++++`);
for (var i in bool) {
    console.log(`Boolean :`, bool[i]);
}
console.log(`+++++++++++++++++++++++++++`);
for (var i in zigzag) {
    console.log(zigzag[i]);
}
console.log(`+++++++++++++++++++++++++++`);
console.log(`+++++++++++++++++++++++++++`);
