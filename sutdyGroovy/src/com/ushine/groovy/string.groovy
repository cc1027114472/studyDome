package com.ushine.groovy


//String str = "123"
//def str = 'a singe string'
def str = '''\
asdfasdf
sdf
'''

def name = "鼓泡"
def str2 = "123: ${name}"
def str3 = "1 add 2 equals ${1 + 2}"

println str2
println str3

def result = hello(str3)
String hello(String message){
    return message
}

// println result

def str4 = "groovy hello"
println str4.center(8,"1")
println str4.padLeft(8,'1')

def str5 = "hello"
println str4 - str5

println str4[0]
// 0 到 几 的字符串
println str4[0..1]
// 字符串反转
println str5.reverse()
//  首字母大写
println str5.capitalize()
