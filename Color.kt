enum class Color {
    red{
        override fun ColName() = "Красный"
        override fun RgbCod() = "FF0000"
        override fun FruitCol() = "Яблоко"
        override fun OposCol() = "Голубой"
    },
    black{
        override fun ColName() = "Чёрный"
        override fun RgbCod() = "330000"
        override fun FruitCol() = "Баклажан"
        override fun OposCol() = "Белый"
    },
    yellow{
        override fun ColName() = "Жёлтый"
        override fun RgbCod() = "FFFF00"
        override fun FruitCol() = "Банан"
        override fun OposCol() = "Тёмно-Синий"
    },
    purple{
        override fun ColName() = "Фиолетовый"
        override fun RgbCod() = "990099"
        override fun FruitCol() = "Акебия"
        override fun OposCol() = "Зелёный"
    },
    white{
        override fun ColName() = "Белый"
        override fun RgbCod() = "FFFFFF"
        override fun FruitCol() = "Личи"
        override fun OposCol() = "Чёрный"
    },
    cian{
        override fun ColName() = "Голубой"
        override fun RgbCod() = "00FFFF"
        override fun FruitCol() = "Квандонг"
        override fun OposCol() = "Красный"
    },
    green{
        override fun ColName() = "Зелёный"
        override fun RgbCod() = "00FF00"
        override fun FruitCol() = "Арбуз"
        override fun OposCol() = "Розовый"
    };

    abstract fun ColName(): String
    abstract fun RgbCod() :String
    abstract fun FruitCol() :String
    abstract fun OposCol() :String
}