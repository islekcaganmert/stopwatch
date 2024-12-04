import Foundation

let startTime = Date().timeIntervalSince1970
var a: Int64 = 0
repeat {
    a += 1
    print(a)
} while a < 100000000
let endTime = Date().timeIntervalSince1970
let timeElapsed = endTime - startTime
print("Time: \(timeElapsed * 1000) ms")
print("Speed: \(100000000 / timeElapsed) processes per second")