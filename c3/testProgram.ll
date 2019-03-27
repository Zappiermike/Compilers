target triple = "x86_64-pc-linux-gnu"
declare i32 @putchar(i32)
declare i32 @print(i32)
declare i32 @println(i32)

define i32 @main() {
    %t0 = alloca i32 
    store i32 3, i32* %t0
    %t1 = alloca i32 
    store i32 4, i32* %t1
    %t2 = load i32, i32* %t1
    %t3 = call i32 @println(i32 %t2)
    %t4 = load i32, i32* %t0
    %t5 = call i32 @println(i32 %t4)
    ret i32 0
}
