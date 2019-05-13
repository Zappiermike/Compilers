
// Main function to test that our 'result' is being handled correctly
int main(int result){
  result = 15;
	while (result >= 0){
    println(result);
    result = result - 5;
  }
	println('d');
	//putchar('a');

}


// The functions below handle both multi-procedures as well as creating print and println
//   functions outside of the compiler that we pass it in

int print(int n){
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