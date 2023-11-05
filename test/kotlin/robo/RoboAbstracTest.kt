import org.junit.Assert
import org.junit.Test
import robo.RobotAbstract

class RobotAbstractTest {
    @Test
    fun testRespondWithEmptyInput() {
        val robot = RobotAbstract()
        val response = robot.respond("")
        Assert.assertEquals("Não me incomode", response)
    }

    @Test
    fun testRespondWithInputContainingEu() {
        val robot = RobotAbstract()
        val response = robot.respond("Eu tenho uma pergunta")
        Assert.assertEquals("A responsabilidade é sua.", response)
    }

    @Test
    fun testRespondWithQuestionInput() {
        val robot = RobotAbstract()
        val response = robot.respond("Você pode me ajudar?")
        Assert.assertEquals("Certamente", response)
    }

    @Test
    fun testRespondWithUppercaseWordInput() {
        val robot = RobotAbstract()
        val response = robot.respond("PRECISO DE AJUDA")
        Assert.assertEquals("Opa! Calma aí!", response)
    }

    @Test
    fun testRespondWithDefaultInput() {
        val robot = RobotAbstract()
        val response = robot.respond("Isso é um teste?")
        Assert.assertEquals("Tudo bem como quiser", response)
    }
}
    