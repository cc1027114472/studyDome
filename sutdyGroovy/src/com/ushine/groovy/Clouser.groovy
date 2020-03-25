package com.ushine.groovy

// 闭包
    def clouser = {
        return  "Hello"
    }
//  所有的闭包都有返回值
    println clouser.call()

def clouser2 = {   -> return "Hello ${it}"}
println clouser2
/*clouser2.call("张三")*/

c = {it}
println c('run')

//def clouser3 = {println  item ++}
//clouser3.call(1)

def clouser3 = {name -> return }

int x = 10
// 用来求指定number 的承接
int fab(int number){
    int result = 1

    1.upto(number,{num -> result *= num})

    return result
}

3.times {
    num -> print num
}

1.upto(5,{
    num-> print num
})
String str =  'abc123'
str.each{
    String temp -> println temp
}
// 第几个字符串是1
println str.find{
        String s -> s.isNumber()
}

def scriptClouser ={
    println "scriptClouser this:" +this //代表闭包定义处的类 最近的类
    println "scriptClouser this:" +owner //代表闭包定义出的类或对象
    println "scriptClouser this:" +delegate //代表任意对象，默认与owner一样
}

scriptClouser.call()

// 都是读的最近的类
class Person{
    def static classClouser ={
        println "scriptClouser this:"+this
        println "scriptClouser this:"+owner
        println "scriptClouser this:"+delegate
    }

    def static say(){
        def classClouser = {
            println "scriptClouser this:" + this
            println "scriptClouser this:" + owner
            println "scriptClouser this:" + delegate
        }
        classClouser.call()
    }

}

// nestClouser 相当于内部类
def nestClouser = {
    def innerClouser = {
        println "innerClouser this:" + this
        println "innerClouser this:" + owner
        println "innerClouser this:" + delegate
    }
    innerClouser.call()
}
nestClouser.call()

String str2 = "the 2 and 5 is 7"
//each
str2.each{
    String temp -> println temp
}
//find 来查找符合条件的第一个
 str2.find{
    String s -> s.isNumber()
}

def list = str2.findAll {
    String s -> s.isNumber()
}
println list.toListString()
//只要有一个
def result = str2.any{
    String s -> s.isNumber()
}
println  result
// 每一个
def result2 = str2.every{
    String s -> s.isNumber()
}
println  result2
// 大写
def list2 = str2.collect{
    it.toUpperCase()
}
println list2.toListString()