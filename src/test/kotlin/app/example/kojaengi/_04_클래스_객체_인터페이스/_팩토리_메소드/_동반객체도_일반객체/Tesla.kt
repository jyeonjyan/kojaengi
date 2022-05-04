package app.example.kojaengi._04_클래스_객체_인터페이스._팩토리_메소드._동반객체도_일반객체

open class Tesla private constructor() {

    companion object TeslaFactory : CarCareService{

        fun orderTeslaModel3(name: String) : TeslaModel3{
            return TeslaModel3(name)
        }

        fun orderTeslaModelX(name: String) : TeslaModelX{
            return TeslaModelX(name)
        }

        override fun getWarrantyPeriod() {
            println("tesla basically provide 3 years warranty")
        }
    }
}

class TeslaModel3(private val name: String){

    override fun toString(): String {
        return "TeslaModel3(name='$name')"
    }
}

class TeslaModelX(private val name: String){

    override fun toString(): String {
        return "TeslaModelX(name='$name')"
    }
}

interface CarCareService {

    fun getWarrantyPeriod()
}