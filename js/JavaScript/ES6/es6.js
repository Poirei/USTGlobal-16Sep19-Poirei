const promise = new Promise((resolve, reject) => {
    if (30 > 10) {
        resolve([{
            name : 'Bill',
            age : 67
        },{
            name : 'Mark',
            age : 40
        },{
            name : 'Elon',
            age : 52
        }])
    } else {
        reject('Failed')
    }
})
const status = promise.then((data) => {
    console.log('Employee data :', data);
}).catch((err) => {
    console.log('Failure message :', err);
})
console.log('==================================');

const promise2 = new Promise((success, failure) => {
    if (20 >= 10) {
        success([{
            name : 'Poirei',
            age : 67
        },{
            name : 'Ngamba',
            age : 40
        },{
            name : 'Singha',
            age : 52
        }])
    } else {
        failure('Failed')
    }
})
const status1 = promise2.then((data) => {
    console.log('Employee data :', data);
}).catch((err) => {
    console.log('Failure message :', err);
})
console.log('===================================');

//Closures

const outerFunction = (val) => {
    let innerFunction = () => {
        return val + 10
    }
    return innerFunction;
}
let innerFunc = outerFunction(40)
let value = innerFunc()
console.log(value);