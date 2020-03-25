package com.ushine.groovy

names = ["1","2","3"]
for (String name : names){
    println name
}

for (name in names){
    println name
}

/*for (i  in 1..10){
    println i
}*/

1.upto(3){
    println it
}

/*3.downto(1){
    print it
}*/
// 步长 是 2
1.step(7,2){
    print it
}

String s = "1232"

n = new Random().nextInt(101)
println n
switch (n){

    case [98,99,100]:
        println "good"
        break
    case 90..97:
        println "nice"
        break
    case {it>0 & it<60}:
        println "too bad"
        break
        default: println "error"

}
