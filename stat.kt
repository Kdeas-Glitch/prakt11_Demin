enum class stat {
    Food{
        override  fun Order_Status() = "Готовиться"
        override fun Order_Price() = "350 руб"
        override fun Order_Time()= "20 минут"
        override fun Order_Adr()= "Стол 5"
    },
    FoodOrd{
        override  fun Order_Status() = "Забран Курьером"
        override fun Order_Price() = "800 руб"
        override fun Order_Time()= "40 минут"
        override fun Order_Adr()= "Сулимова 5"
    },
    Order{
        override  fun Order_Status() = "Едет в ПВЗ"
        override fun Order_Price() = "100 руб"
        override fun Order_Time()= "2 дня"
        override fun Order_Adr()= "Сулимова 15"
    };
    abstract fun Order_Status(): String
    abstract fun Order_Price() :String
    abstract fun Order_Time() :String
    abstract fun Order_Adr() :String
}