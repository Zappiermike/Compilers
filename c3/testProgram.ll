target triple = "x86_64-pc-linux-gnu"

declare i32 @putchar(i32)

define i32 @print(i32 %t12) {
    %t0 = alloca i32; parameter n
    store i32%t12, i32* %t0
    %t13 = load i32, i32* %t0
    %t14 = icmp slt i32 %t13, 0 
    %t15 = zext i1 %t14 to i32
    %t16 = icmp ne i32 %t15, 0
    br i1 %t16, label %label_0, label %label_1
label_0:
    %t17 = call i32 @putchar(i32 45)
    %t18 = load i32, i32* %t0
    %t19 = sub i32 0, %t18
     store i32 %t19, i32* %t0
    br label %label_1
label_1:
    %t20 = load i32, i32* %t0
    %t21 = icmp slt i32 %t20, 0 
    %t22 = zext i1 %t21 to i32
   %t23 = icmp ne i32 %t22, 0
    br i1 %t23, label %label_2, label %label_3
label_2:
    %t24 = call i32 @putchar(i32 50)
    %t25 = call i32 @putchar(i32 49)
    %t26 = call i32 @putchar(i32 52)
    %t27 = call i32 @putchar(i32 55)
    %t28 = call i32 @putchar(i32 52)
    %t29 = call i32 @putchar(i32 56)
    %t30 = call i32 @putchar(i32 51)
    %t31 = call i32 @putchar(i32 54)
    %t32 = call i32 @putchar(i32 52)
    %t33 = call i32 @putchar(i32 56)
    br label %label_4
label_3:
    %t34 = load i32, i32* %t0
    %t35 = icmp sge i32 %t34, 10 
    %t36 = zext i1 %t35 to i32
    %t37 = icmp ne i32 %t36, 0
    br i1 %t37, label %label_5, label %label_6
label_5:
    %t39 = load i32, i32* %t0
    %t40 = sdiv i32 %t39, 10
    %t38 = call i32 @print(i32 %t40)
    br label %label_6
label_6:
    %t42 = load i32, i32* %t0
    %t43 = srem i32 %t42, 10
    %t44 = add i32 %t43, 48
    %t41 = call i32 @putchar(i32 %t44)
    br label %label_4
label_4:
    ret i32 0
    ret i32 0
}

define i32 @println(i32 %t45) {
    %t1 = alloca i32; parameter n
    store i32%t45, i32* %t1
    %t47 = load i32, i32* %t1
    %t46 = call i32 @print(i32 %t47)
    %t48 = call i32 @putchar(i32 10)
    ret i32 0
    ret i32 0
}

define i32 @nada() {
    ret i32 7
    ret i32 0
}

define i32 @four(i32 %t49, i32 %t50, i32 %t51, i32 %t52) {
    %t8 = alloca i32; parameter one
    store i32%t49, i32* %t8
    %t9 = alloca i32; parameter two
    store i32%t50, i32* %t9
    %t10 = alloca i32; parameter three
    store i32%t51, i32* %t10
    %t11 = alloca i32; parameter four
    store i32%t52, i32* %t11
    %t53 = load i32, i32* %t8
    %t54 = load i32, i32* %t9
    %t55 = add i32 %t53, %t54
    %t56 = load i32, i32* %t10
    %t57 = add i32 %t55, %t56
    %t58 = load i32, i32* %t11
    %t59 = add i32 %t57, %t58
    ret i32 %t59
    ret i32 0
}

define i32 @uno(i32 %t60) {
    %t3 = alloca i32; parameter one
    store i32%t60, i32* %t3
    %t61 = load i32, i32* %t3
    ret i32 %t61
    ret i32 0
}

define i32 @dos(i32 %t62, i32 %t63) {
    %t6 = alloca i32; parameter one
    store i32%t62, i32* %t6
    %t7 = alloca i32; parameter three
    store i32%t63, i32* %t7
    %t64 = load i32, i32* %t6
    %t65 = load i32, i32* %t7
    %t66 = add i32 %t64, %t65
    ret i32 %t66
    ret i32 0
}

define i32 @main(i32 %t67) {
    %t2 = alloca i32; parameter result
    store i32%t67, i32* %t2
    %t68 = call i32 @println(i32 22222)
    %t70 = call i32 @nada()
    %t69 = call i32 @println(i32 %t70)
    %t72 = call i32 @dos(i32 6, i32 9)
    %t71 = call i32 @println(i32 %t72)
    %t74 = call i32 @four(i32 1, i32 2, i32 3, i32 4)
    %t73 = call i32 @println(i32 %t74)
    ret i32 0
}
