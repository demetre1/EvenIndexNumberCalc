fun main (){

    println (evenNumberCounter(arrayOf(1,2,3,4,5,6,7)))

}








fun evenNumberCounter (x:Array<Int>): Int {
    var sum = 0;
    var counter = 0;
    var sahualo = 0;
    for( num in x.indices){

        if(num % 2 == 0){
            sum += x[num]
            counter ++

        }
    }
    sahualo = sum / counter
    return  sahualo;



}