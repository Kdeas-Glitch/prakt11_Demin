import java.time.Month

enum class DayWeek() {
monday{
    override fun dayname() = "Понедельник"
    override fun daycount() = "1"
    override fun Weekend()= "До выходных 5 дней"
    override fun Month() = "Январь"
},
    thusday{
        override fun dayname() = "Вторник"
        override fun daycount() = "2"
        override fun Weekend()= "До выходных 4 дня"
        override fun Month() = "Февраль"
    },
    wednessday{
        override fun dayname() = "Среда"
        override fun daycount() = "3"
        override fun Weekend()= "До выходных 3 дня"
        override fun Month() = "Март"
    },
    thursday{
        override fun dayname() = "Четверг"
        override fun daycount() = "4"
        override fun Weekend()= "До выходных 2 дня"
        override fun Month() = "Апрель"
    },
    friday{
        override fun dayname() = "Пятница"
        override fun daycount() = "5"
        override fun Weekend()= "До выходных 1 день"
        override fun Month() = "Май"
    },
    saturday{
        override fun dayname() = "Субота"
        override fun daycount() = "6"
        override fun Weekend()= "Первый выходной день"
        override fun Month() = "Июнь"
    },
    sunday{
        override fun dayname() = "Воскресенье"
        override fun daycount() = "7"
        override fun Weekend()= "Второй выходной день"
        override fun Month() = "Июль"
    };

    abstract fun dayname(): String
    abstract fun daycount() :String
    abstract fun Weekend() :String
    abstract fun Month():String
}