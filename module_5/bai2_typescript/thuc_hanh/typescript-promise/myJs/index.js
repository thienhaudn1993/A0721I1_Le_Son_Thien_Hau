let money = 10000;
// arrow function
const buyAcar = (car) => {
    return new Promise(((resolve, reject) => {
        setTimeout(() => {
            if (money >= 10000) {
                resolve("can buy " + car);
            }
            else {
                reject("Do not enough money");
            }
        }, 100);
    }));
};
money = 1000001;
const promise = buyAcar("Vinfast").then(value => {
    console.log(value);
}, error => {
    console.log(error);
});
