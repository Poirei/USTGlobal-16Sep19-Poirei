console.log('Object using new keyword.')
        var car = new Object();
        var phone = new Object();
        var bike = new Object();
        var laptop = new Object();
        var watch = new Object();

        car.name = 'Audi'
        car.model = 'R8'
        car.price = 4800000

        phone.name = 'Motorola'
        phone.model = 'One Power'
        phone.price = 16000

        bike.name = 'Ducati'
        bike.model = 'Ghost'
        bike.price = 3200000

        laptop.name = 'ROG'
        laptop.model = 'Strix Scar III'
        laptop.price = 245000

        watch.name = 'Tissot'
        watch.model = 'Smart+'
        watch.price = 20500
        
        console.log(car, phone, bike, laptop, watch)
        console.log('Object without using new keyword.')
        var car = {
            brand : 'Lamborghini',
            color : 'black'
        }
        console.log(car.color)
        var phone = {
            brand : 'Motorola',
            color : 'black'
        }
        var bike = {
            brand : 'Ducati',
            color : 'Red',
            price : 4500000
        }
        var laptop = {
            brand : 'ROG',
            color : 'Silver',
            gaming : true,
            release_date : undefined
        }
        var watch = {
            brand : 'Samsung',
            color : 'Titanium',
            battery : null,
        }
        console.log(phone, car, bike, laptop, watch)
        console.log('Array using new Keyword.')
        var id = new Array('rose','sunflower')
        var name = new Array(4),
        var boolean = new Array(4)
        var contact = new Array(4)
        var email = new Array(4)
        id[0] = 15; id[2] = 34
        console.log(id)
        console.log('Array without using new keyword.')
        var id = [102, 103, 104, 108]; 
        var name = ['Poirei', 'Singha', 'Ryzen'];
        var boolean = [true, false]; 
        var contact = [9791301081, 7013070619]
        var email = ['poirei4@gmail.com', 'poirei4@hotmail.com']
        var arr = [id, name, boolean, contact, email]
        for (let i = 0; i < arr.length; i++) {
            for (let j = 0; j < arr[i].length; j++) {
                console.log(arr[i][j])
            }
        }
        console.log('=========================================================')
        var a = 10
        var str = '10'
        if (a !== str) {
            console.log('Equal')
        }else {
            console.log('Not equal') 
        }
        var num = 20;
        console.log(typeof num);
        console.log(typeof 'Poirei')
        console.log(typeof true)
        console.log(typeof null)
        console.log(typeof undefined)