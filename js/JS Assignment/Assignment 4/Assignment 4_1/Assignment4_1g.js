console.log(`----------unshift-----------`);
console.log(num_arr.unshift(39, 99, 78));
console.log(genre_arr.unshift('SynthWave', 'Retro'));
console.log(bool_arr.unshift(false, true));
console.log(mob_arr.unshift(
    {
        brand : 'Samsung',
        model : 'Galaxy S10',
        price : 89000
    }
));
console.log(arr_arr.unshift(arr3, arr4, [1, 'b', null, ]));
console.log(fun_arr.unshift(() => console.log('Executed.')), fun4(fun3()), );
console.log(arr3.unshift(num_arr, bool_arr));
console.log(arr4.unshift(genre_arr, bool_arr));
console.log(arr5.unshift(num_arr, mob_arr));
console.log(arr6.unshift(arr_arr, mob_arr));
console.log(`++++++++++++++++++++++++++++++++++++++`);

