target triple = "x86_64-pc-linux-gnu"
declare i32 @putchar(i32)
declare i32 @print(i32)
declare i32 @println(i32)

define i32 @main() {
   %t0 = zext i1 icmp slt (i32 7, i32 4) to i32 
    %t1 = call i32 @println(i32 %t0)
   %t2 = zext i1 icmp sgt (i32 3, i32 6) to i32 
    %t3 = call i32 @println(i32 %t2)
   %t4 = zext i1 icmp eq (i32 1, i32 0) to i32 
    %t5 = call i32 @println(i32 %t4)
   %t6 = zext i1 icmp sle (i32 8, i32 6) to i32 
    %t7 = call i32 @println(i32 %t6)
   %t8 = zext i1 icmp sge (i32 4, i32 6) to i32 
    %t9 = call i32 @println(i32 %t8)
   %t10 = zext i1 icmp ne (i32 7, i32 7) to i32 
    %t11 = call i32 @println(i32 %t10)
    ret i32 0
}
