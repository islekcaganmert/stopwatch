use std::time::{SystemTime, UNIX_EPOCH};

fn main() {
    let mut a: u64 = 0;
    let start_time = SystemTime::now().duration_since(UNIX_EPOCH).unwrap().as_secs();
    while a < 100_000_000 {
        a += 1;
        println!("{}", a);
    }
    let end_time = SystemTime::now().duration_since(UNIX_EPOCH).unwrap().as_secs();
    let elapsed_time = end_time - start_time;
    println!("Time: {}", elapsed_time);
    println!("Speed: {} process per second", 100_000_000 / elapsed_time);
}