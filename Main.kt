fun main() {
    val produto1 = Produto("Arroz", "Alimentos", 20.0, 50)
    val produto2 = Produto("Sabão", "Limpeza", 5.0, 100)
    val produto3 = Produto("Leite", "Bebidas", 6.0, 200)

    produto1.aplicarDesconto(10.0)
    println("Preço com desconto: ${produto1.preco}")

    produto2.adicionarEstoque(20)
    println("Novo estoque de ${produto2.nome}: ${produto2.estoque}")

    val produtos = listOf(produto1, produto2, produto3)
    for (produto in produtos) {
        println("Nome: ${produto.nome}, Categoria: ${produto.categoria}, Preço: ${produto.preco}, Estoque: ${produto.estoque}")
        
    }
    val item1 = Item("Arroz", "Alimentos", 20.0, 50)
    val item2 = Item("Sabão", "Limpeza", 5.0, 100)
    val item3 = Item("Leite", "Bebidas", 6.0, 200)
    val item4 = Item("Açúcar", "Alimentos", 10.0, 80)
    val item5 = Item("Detergente", "Limpeza", 3.0, 150)
    val item6 = Item("Cerveja", "Bebidas", 15.0, 300)

    item1.aplicarDesconto(10.0)
    item2.adicionarEstoque(20)

    val itens = listOf(item1, item2, item3, item4, item5, item6)

    for (item in itens) {
        println("Nome: ${item.nome}, Categoria: ${item.categoria}, Preço: ${item.preco}, Estoque: ${item.estoque}")
    }
    println(ex1())
    println(ex2())
    println(ex3(2, 4))
    println(ex4(100, 10))
    println(ex4(1,7))
}

// 1

fun ex1() {
    val n = 10
    for (i in 0 until n) {
        println("Índice: ${i}")
    }
}

// 2

fun ex2() {
    val n = 10;
    for (i in 0 until n) {
        if (i % 2 != 0) {
            println("Índices ímpares: ${i}")
        }
    }
}

// 3

fun ex3(a: Int, b: Int): Int {
    return if (a % 2 == 0 && b % 2 == 0) {
        a + b
    } else {
        a * b
    }
}

// 4

fun ex4(a: Int, b: Int): Int {
    if (a in 10..99) {
        return a + b
    } else if (a in 100..999) {
        return a / b
    } else if (a in 1000..99999) {
        return a - b
    } else if (a in 1..9) {
        return a * b
    } else {
        return 0
    }
}
