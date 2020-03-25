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



