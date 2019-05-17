target triple = "x86_64-pc-linux-gnu"

declare i32 @putchar(i32)

define i32 @print(i32 %t9) {
    %t0 = alloca i32; parameter n
    store i32%t9, i32* %t0
    %t10 = load i32, i32* %t0
    %t11 = icmp slt i32 %t10, 0 
    %t12 = zext i1 %t11 to i32
    %t13 = icmp ne i32 %t12, 0
    br i1 %t13, label %label_0, label %label_1
label_0:
    %t14 = call i32 @putchar(i32 45)
    %t15 = load i32, i32* %t0
    %t16 = sub i32 0, %t15
     store i32 %t16, i32* %t0
    br label %label_1
label_1:
    %t17 = load i32, i32* %t0
    %t18 = icmp slt i32 %t17, 0 
    %t19 = zext i1 %t18 to i32
   %t20 = icmp ne i32 %t19, 0
    br i1 %t20, label %label_2, label %label_3
label_2:
    %t21 = call i32 @putchar(i32 50)
    %t22 = call i32 @putchar(i32 49)
    %t23 = call i32 @putchar(i32 52)
    %t24 = call i32 @putchar(i32 55)
    %t25 = call i32 @putchar(i32 52)
    %t26 = call i32 @putchar(i32 56)
    %t27 = call i32 @putchar(i32 51)
    %t28 = call i32 @putchar(i32 54)
    %t29 = call i32 @putchar(i32 52)
    %t30 = call i32 @putchar(i32 56)
    br label %label_4
label_3:
    %t31 = load i32, i32* %t0
    %t32 = icmp sge i32 %t31, 10 
    %t33 = zext i1 %t32 to i32
    %t34 = icmp ne i32 %t33, 0
    br i1 %t34, label %label_5, label %label_6
label_5:
    %t36 = load i32, i32* %t0
    %t37 = sdiv i32 %t36, 10
    %t35 = call i32 @print(i32 %t37)
    br label %label_6
label_6:
    %t39 = load i32, i32* %t0
    %t40 = srem i32 %t39, 10
    %t41 = add i32 %t40, 48
    %t38 = call i32 @putchar(i32 %t41)
    br label %label_4
label_4:
    ret i32 0
    ret i32 0
}

define i32 @println(i32 %t42) {
    %t1 = alloca i32; parameter n
    store i32%t42, i32* %t1
    %t44 = load i32, i32* %t1
    %t43 = call i32 @print(i32 %t44)
    %t45 = call i32 @putchar(i32 10)
    ret i32 0
    ret i32 0
}

define i32 @nada() {
    ret i32 2
    ret i32 0
}

define i32 @four(i32 %t46, i32 %t47, i32 %t48, i32 %t49) {
    %t4 = alloca i32; parameter one
    store i32%t46, i32* %t4
    %t5 = alloca i32; parameter two
    store i32%t47, i32* %t5
    %t6 = alloca i32; parameter three
    store i32%t48, i32* %t6
    %t7 = alloca i32; parameter four
    store i32%t49, i32* %t7
    %t50 = load i32, i32* %t4
    %t51 = load i32, i32* %t5
    %t52 = add i32 %t50, %t51
    %t53 = load i32, i32* %t6
    %t54 = add i32 %t52, %t53
    %t55 = load i32, i32* %t7
    %t56 = add i32 %t54, %t55
    ret i32 %t56
    ret i32 0
}

define i32 @dos(i32 %t57, i32 %t58) {
    %t2 = alloca i32; parameter one
    store i32%t57, i32* %t2
    %t3 = alloca i32; parameter three
    store i32%t58, i32* %t3
    %t59 = load i32, i32* %t2
    %t60 = load i32, i32* %t3
    %t61 = add i32 %t59, %t60
    ret i32 %t61
    ret i32 0
}

define i32 @main(i32 %t62) {
    %t8 = alloca i32; parameter result
    store i32%t62, i32* %t8
    %t63 = call i32 @println(i32 22222)
    %t65 = call i32 @nada()
    %t64 = call i32 @println(i32 %t65)
    %t67 = call i32 @dos(i32 6, i32 9)
    %t66 = call i32 @println(i32 %t67)
    %t69 = call i32 @four(i32 1, i32 2, i32 3, i32 4)
    %t68 = call i32 @println(i32 %t69)
    ret i32 0
}
