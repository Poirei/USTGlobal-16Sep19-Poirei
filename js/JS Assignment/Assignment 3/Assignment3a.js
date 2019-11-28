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
console.log(`Using for loop : `);
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var index = 0; index < sp_brand.length; index++) {
    console.log('Brand :', sp_brand[index]);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var index = 0; index < price.length; index++) {
    console.log(`Price :`, price[index]);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var index = 0; index < laptop.length; index++) {
    console.log(`Laptop.brand :`, laptop[index].brand,'| Cost :', 
    laptop[index].cost,'| Color :', laptop[index].color,'| Gaming:', laptop[index].gaming);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var index = 0; index < fun.length; index++) {
    console.log(fun[index]);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
var day = ['Sunday', 'Monday', 'Tueday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
for (var index = 0; index < date.length; index++) {
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
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var index = 0; index < math.length; index++) {
    console.log(`Value :`, math[index]);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var index = 0; index < num.length; index++) {
    console.log(`Number :`, num[index]);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var index = 0; index < str.length; index++) {
    console.log(`String :`, str[index]);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var index = 0; index < bool.length; index++) {
    console.log(`Boolean :`, bool[index]);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
for (var index = 0; index < zigzag.length; index++) {
    console.log(zigzag[index]);
}
console.log(`++++++++++++++++++++++++++++++++++++`);
console.log(`++++++++++++++++++++++++++++++++++++`);
