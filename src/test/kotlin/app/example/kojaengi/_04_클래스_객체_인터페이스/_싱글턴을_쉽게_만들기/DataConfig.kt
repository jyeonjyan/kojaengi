package app.example.kojaengi._04_클래스_객체_인터페이스._싱글턴을_쉽게_만들기

interface DataConfig {
    val dataVendor: String
    val configSerialNum: String
    val priority: Int

    object DataConfigComparator : Comparator<DataConfig> {
        override fun compare(o1: DataConfig?, o2: DataConfig?): Int {
            if (o1 != null) {
                if (o2 != null) {
                    return if (o1.priority < o2.priority) 1 else -1
                }
            }
            return 0
        }
    }

}