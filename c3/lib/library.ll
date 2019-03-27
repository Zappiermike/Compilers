; ModuleID = '/home/michael/eclipse-workspace/c3/src/library.c'
source_filename = "/home/michael/eclipse-workspace/c3/src/library.c"
target datalayout = "e-m:e-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

; Function Attrs: noinline nounwind optnone uwtable
define i32 @print(i32) #0 {
  %2 = alloca i32, align 4
  store i32 %0, i32* %2, align 4
  %3 = load i32, i32* %2, align 4
  %4 = icmp slt i32 %3, 0
  br i1 %4, label %5, label %9

; <label>:5:                                      ; preds = %1
  %6 = call i32 @putchar(i32 45)
  %7 = load i32, i32* %2, align 4
  %8 = sub nsw i32 0, %7
  store i32 %8, i32* %2, align 4
  br label %9

; <label>:9:                                      ; preds = %5, %1
  %10 = load i32, i32* %2, align 4
  %11 = icmp slt i32 %10, 0
  br i1 %11, label %12, label %23

; <label>:12:                                     ; preds = %9
  %13 = call i32 @putchar(i32 50)
  %14 = call i32 @putchar(i32 49)
  %15 = call i32 @putchar(i32 52)
  %16 = call i32 @putchar(i32 55)
  %17 = call i32 @putchar(i32 52)
  %18 = call i32 @putchar(i32 56)
  %19 = call i32 @putchar(i32 51)
  %20 = call i32 @putchar(i32 54)
  %21 = call i32 @putchar(i32 52)
  %22 = call i32 @putchar(i32 56)
  br label %35

; <label>:23:                                     ; preds = %9
  %24 = load i32, i32* %2, align 4
  %25 = icmp sge i32 %24, 10
  br i1 %25, label %26, label %30

; <label>:26:                                     ; preds = %23
  %27 = load i32, i32* %2, align 4
  %28 = sdiv i32 %27, 10
  %29 = call i32 @print(i32 %28)
  br label %30

; <label>:30:                                     ; preds = %26, %23
  %31 = load i32, i32* %2, align 4
  %32 = srem i32 %31, 10
  %33 = add nsw i32 %32, 48
  %34 = call i32 @putchar(i32 %33)
  br label %35

; <label>:35:                                     ; preds = %30, %12
  ret i32 0
}

declare i32 @putchar(i32) #1

; Function Attrs: noinline nounwind optnone uwtable
define i32 @println(i32) #0 {
  %2 = alloca i32, align 4
  store i32 %0, i32* %2, align 4
  %3 = load i32, i32* %2, align 4
  %4 = call i32 @print(i32 %3)
  %5 = call i32 @putchar(i32 10)
  ret i32 0
}

attributes #0 = { noinline nounwind optnone uwtable "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-jump-tables"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }

!llvm.module.flags = !{!0}
!llvm.ident = !{!1}

!0 = !{i32 1, !"wchar_size", i32 4}
!1 = !{!"clang version 6.0.0-1ubuntu2 (tags/RELEASE_600/final)"}
