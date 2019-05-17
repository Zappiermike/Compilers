
//Testing declarations. Need putchar, println, and print in order to see our outputs
int putchar(int c);

//
int print(int n) {
   if(n < 0){
     putchar('-');
     n = -n;
   }
  if(n < 0){
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

int nada(){
  return 2;
}

// Duplicate function of nada to check the compiler. 
// Will throw error of duplicate function names as 
// well as matching arguments


// int nada(){
//   return 0;
// }


int dos(int one, int three){
  return one + three;
}

// Duplicate function of dos to check the compiler. 
// Will throw error of duplicate names

// int dos(int one, int three, int four){
//   return one + three;
// }

int four (int one, int two, int three, int four){
  return one + two + three + four;
}

int main(int result){
  println(8888);
  println(nada());
  println(dos(9,11));
  println(four(1,2,8,9));
}
