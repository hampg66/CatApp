class Cat (private val name: String, var age: Int, var weightIn: Int) {

    var weight = 0
        set(newWeight) {
            if(newWeight >= 5) {
                field = newWeight
            }
        }

    init {
        weight = weightIn
    }

    fun walk() {
        weight--
    }

    fun eat(amount: Int):Boolean {
        val newWeight = weight + amount
        if (newWeight<=20) {
            weight += amount
            return true}
        else{
            return false
        }}

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
