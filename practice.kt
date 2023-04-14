fun main(){

    // var firstName: String? ="Aman"
    // var lastName: String? =null

    // println(firstName?.uppercase())
    // lastName?.let{print("lastname exists")}
     
    // val name="dipti"

    // when(name){
    //     "aman"->{
    //         print("we got aman")
    //     }
    //     "sarvesh"->{
    //         print("we got sarvesh")
    //     }
    //     "dipti"->{
    //         print("we got dipti")
    //     }
    // }

    // var names=arrayOf("aman","dipti","sarvesh","Nikita")

    // for(name in names){
    //     println(name) 
    // }
     
    // for(i in 100..110){
    //     println(i)
    // }

    // var num=10

    // if(num in 5..10){
    //     print("yes it is in range")
    // }

    // val names=listOf("aman","dipti","sarvesh","Nikita",1,2,3)

    // for(name in names){
    //     println(name) 
    // }
    //  println(names[3]) 
    
//      val output=operations(plus={a:Int,b:Int -> a+b})
//      println(output)

// val p1=Person("aman",21)

// val p2=Person("dipti",22)

// println(p1.name)
// println(p1.age)
// println(p2.name)
// println(p2.age)


var list=listOf(1,2,3,4,5)

val newList=list.filter({
    it%2==0
})

for(num in newList){
    println(num)
}

 }


class Person(_name:String,_age:Int){
    val name:String
    val age:Int

    init{
        name=_name
        age=_age
    }
}

// fun operations(a: Int=10,b: Int=16,plus:(Int,Int)->Int):Int{
//     return plus (a,b)
// }
