class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticar {
    override fun bonificacao(): Double {
        return salario * 0.20
    }

    override fun autenticacao(senha: Int): Boolean {
        if(this.senha == senha)
            return true
        return false
    }
}