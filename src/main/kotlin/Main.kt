import robo.MarcianoPremiumRobot
import robo.UserAction
import robo.OperationType
import robo.OperationFactory

fun extractOperands(input: String): DoubleArray {
    // Extrair os operandos numéricos da entrada
    val operands = input.split(Regex("\\s+")).mapNotNull { it.toDoubleOrNull() }.toDoubleArray()
    return operands
}

fun identifyOperationType(input: String): OperationType? {
    return when {
        "some" in input -> OperationType.ADD
        "subtraia" in input -> OperationType.SUBTRACT
        "multiplique" in input -> OperationType.MULTIPLY
        "divida" in input -> OperationType.DIVIDE
        else -> null
    }
}

fun main(){
    execute()
}

fun execute() {
    val userAction = object : UserAction {
        override fun performAction() {
            println("Definição de programador: A pessoa que resolve um problema que você nem sabe que tem , de uma forma que você não entende!")
        }
    }
    val robot = MarcianoPremiumRobot(userAction)
    var input: String

    while (true) {
        print("Digite uma ação para o robô (ou 'FIM' para encerrar): ")
        input = readLine() ?: ""

        if (input.equals("FIM", ignoreCase = true)) {
            println("Até logo!")
            break
        }

        val result = when {
            input.equals("agir", ignoreCase = true) -> {
                println("É pra já!")
                userAction.performAction()
                ""
            }
            identifyOperationType(input) != null -> {
                val operationType = identifyOperationType(input)!!
                val operands = extractOperands(input)
                if (operands.size >= 2) {
                    val resposta = robot.respond(operationType, *operands)
                    resposta
                } else {
                    "Operandos insuficientes para a operação."
                }
            }
            else -> {
                val resposta = robot.respond(input)
                resposta
            }
        }
        println(result)
    }
}