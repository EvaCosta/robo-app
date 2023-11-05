import org.junit.Assert
import org.junit.Test
import robo.OperationType
import robo.RobotAdvanced

class RobotAdvancedTest {
    @Test
    fun testRespondWithAddition() {
        val robot = RobotAdvanced()
        val response = robot.respond(OperationType.ADD, 5.0, 3.0)
        Assert.assertEquals("Eu sei! O resultado é: 8.0", response)
    }

    @Test
    fun testRespondWithSubtraction() {
        val robot = RobotAdvanced()
        val response = robot.respond(OperationType.SUBTRACT, 10.0, 4.0)
        Assert.assertEquals("Eu sei! O resultado é: 6.0", response)
    }

    @Test
    fun testRespondWithMultiplication() {
        val robot = RobotAdvanced()
        val response = robot.respond(OperationType.MULTIPLY, 6.0, 2.0)
        Assert.assertEquals("Eu sei! O resultado é: 12.0", response)
    }

    @Test
    fun testRespondWithDivision() {
        val robot = RobotAdvanced()
        val response = robot.respond(OperationType.DIVIDE, 8.0, 2.0)
        Assert.assertEquals("Eu sei! O resultado é: 4.0", response)
    }

    @Test
    fun testRespondWithInvalidOperation() {
        val robot = RobotAdvanced()
        val response = robot.respond(OperationType.ADD, 5.0) // Deve gerar uma exceção
        Assert.assertEquals("Operandos insuficientes para a operação.", response)
    }
}
