class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if(valor > 0)
            this.saldo += valor
    }

    fun sacar(valor: Double) {
        if(valor <= saldo )
            saldo -=valor
    }

    fun transferir(conta: Conta, valor: Double): Boolean {
        if(valor > 0) {
            conta.deposita(valor)
            return true
        }
        return false
    }


}