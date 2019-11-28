console.log(`----------filter-----------`);
console.log(num_arr.filter(val => val > 40));
console.log(genre_arr.filter(val => val > `King`));
console.log(bool_arr.filter(val => val > 0));
console.log(mob_arr.filter(val => val.price > 45000));
console.log(arr_arr.filter(val => val.length > 4));
console.log(fun_arr.filter(val => val > 10));
console.log(arr3.filter(val => val.length > 10));
console.log(arr4.filter(val => val.length > 10));
console.log(arr5.filter(val => {
    if (val === null) {
        return
    }else {
        return val.length > 10
    }
    }));
console.log(arr6.filter(val => {
    if (val === null) {
        return   
    } else {
        return val.length > 10
    }
    }));


