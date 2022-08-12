

fun main () {
    val input=input("82 null null null null null 7 55 null 59 4 25 null null 66 null 3 62 55 null 42 5 35 8 null")   
    calcNullValues(input)

}
fun calcNullValues(input: List<Int?>):Array<Int>{
    var countNull=0
    var countNumber=0
    for (i in input.indices){
       print("$i"+" ")
        if (input[i]==null) {countNull+=1
          println(countNull) }
        else {countNumber +=input[i]!!
              println(countNumber)}
    }
    var result :Array<Int> = arrayOf(countNull,countNumber)
    result.forEach { i-> print("$i" +" ") }
    return result
}
fun input(input:String):List<Int?>{

    val inpurArray  = input.split(" ").toList()
    val listInput:MutableList<Int?> = mutableListOf()
    for(i in inpurArray.indices) {

        listInput.add(if(inpurArray[i]=="null") null else inpurArray[i].toInt())
    }
    print(listInput)
   return listInput
}



