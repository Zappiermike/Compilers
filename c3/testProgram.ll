target triple = "x86_64-pc-linux-gnu"
declare i32 @putchar(i32)
declare i32 @print(i32)
declare i32 @println(i32)

define i32 @main() {
    %t0 = alloca i32 
     store i32 0, i32* %t0
    %t1 = icmp slt i32 3, 4 
    %t2 = zext i1 %t1 to i32
    %t3 = icmp ne i32 %t2, 0
    br i1 %t3, label %label_0, label %label_1
label_0:
    %t4 = call i32 @println(i32 111111)
    br label %label_1
label_1:
    %t5 = icmp slt i32 3, 4 
    %t6 = zext i1 %t5 to i32
   %t7 = icmp ne i32 %t6, 0
    br i1 %t7, label %label_2, label %label_3
label_2:
    %t8 = call i32 @println(i32 222222)
    br label %label_3
label_3:
    %t9 = call i32 @println(i32 333333)
    br label %label_4
label_4:
    br label %label_5
label_5:
    %t10 = load i32, i32* %t0
    %t11 = icmp slt i32 %t10, 10 
    %t12 = zext i1 %t11 to i32
    %t13 = icmp ne i32 %t12, 0
    br i1 %t13, label %label_6, label %label_7
label_6:
    %t14 = load i32, i32* %t0
    %t15 = call i32 @println(i32 %t14)
    %t16 = load i32, i32* %t0
    %t17 = add i32 %t16, 1
     store i32 %t17, i32* %t0
    br label %label_5
label_7:
    %t18 = load i32, i32* %t0
    %t19 = add i32 %t18, 30
    %t20 = call i32 @println(i32 %t19)
    ret i32 0
}
