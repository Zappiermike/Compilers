int putchar(int c);

int print(int n){
  if(n < 0){
    putchar('-');
    n = -n;
  }
  if(n < 0){ // must have been -2^31, which negates to itself
    putchar('2');
    putchar('1');
    putchar('4');
    putchar('7');
    putchar('4');
    putchar('8');
    putchar('3');
    putchar('6');
    putchar('4');
    putchar('8');
  } else {
    if(n >= 10){
      print(n/10);
    }
    putchar(n%10 + '0');
  }
  return 0;
}

int println(int n){
  print(n);
  putchar('\n');
  return 0;
}
