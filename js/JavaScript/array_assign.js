const items = [
    {
        name : 'Ear Ring',
        id : 1,
        price : 5000
    },
    {
        name : 'Kajal',
        id : 2,
        price : 1000
    },
    {
        name : 'Trimmer',
        id : 3,
        price : 3000
    },
    {
        name : 'Hair Gel',
        id : 4,
        price : 170
    }
]
console.log('-----------Before updating price :-----------');
for (let i in items) {
    console.log(`Name :`, items[i].name);
    console.log(`ID :`, items[i].id);
    console.log(`Price :`, items[i].price);
    console.log('\t');
}
items.map(value => {value.price = value.price + 300
                    return value.price
});
console.log('-----------After updating price :-----------');
for (let i of items) {
    console.log(`Name :`, i.name);
    console.log(`ID :`, i.id);
    console.log(`Price :`, i[`price`]);
}
