target triple = "x86_64-pc-linux-gnu"
declare i32 @putchar(i32)
declare i32 @print(i32)
declare i32 @println(i32)

define i32 @main() {
    %t0 = icmp slt i32 5, 4 
    %t1 = zext i1 %t0 to i32
   %t2 = icmp ne i32 %t1, 0
    br i1 %t2, label %label_0, label %label_1
label_0:
    %t3 = call i32 @println(i32 222222)
    br label %label_2
label_1:
    %t4 = call i32 @println(i32 333333)
    br label %label_2
label_2:
    ret i32 0}
