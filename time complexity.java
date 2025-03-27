// time complexity is a length of the input   like 
// n toys = n sec 
//n+ 1 = n+1sec
  //tools to show time complexity
             //asymptotic notations
// big o =upper bound and worstcase scenerio ( check every step until wefind the answer {last tk })
 // omega = best case (found the answer in first step)
 // theta = avg case ( found in the middle)
 
class main{

public static void printItems(int n){
    for(int i = 0; i < n; i++) {
        System.out.println(i);
    }
}

public static void main(String[] args) {
    printItems(10);
}
}
  // o(n) 