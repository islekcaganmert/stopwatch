const start_time = Math.floor(Date.now() / 1000);
let a = 0;
do {
    a += 1;
    console.log(a);
} while (a < 100000000);
const end_time = Math.floor(Date.now() / 1000);
const elapsed_time = end_time - start_time;
console.log(`Time: ${elapsed_time}`);
console.log(`Speed: ${100000000 / elapsed_time} process per second`);