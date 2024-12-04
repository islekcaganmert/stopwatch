from datetime import datetime

a = 0
start_time = datetime.now().timestamp()
while a < 100000000:
    a += 1
    print(a)
print(f"Time: {datetime.now().timestamp() - start_time}\n", )
print(f"Speed: {100000000 / (datetime.now().timestamp() - start_time)} process per second\n")
