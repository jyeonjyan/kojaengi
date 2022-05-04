package app.example.kojaengi._04_클래스_객체_인터페이스._팩토리_메소드

class Tesla private constructor(private val carName: String){

    companion object{
        fun makeTesla(name: String): Tesla{
            return Tesla(name)
        }
    }

    override fun toString(): String {
        return "Tesla(carName='$carName')"
    }


}