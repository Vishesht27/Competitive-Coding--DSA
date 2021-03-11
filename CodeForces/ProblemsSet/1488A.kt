fun count(x:Int):Int = if(x==0)0 else x%10+count(x/10);
fun main(){
    var t = readLine()!!.toInt();
    while(t-->0) {
    val(x,y)=readLine()!!.split(" ").map{it.toInt()}
        val times = y/x;
        var total = y%x;
        total+=count(times);
        println(total)
    }
    }
