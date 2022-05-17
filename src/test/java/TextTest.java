// Триллиан в отчаянии схватила его за руку и потянула к двери,
// которую Форд и Зафод пытались открыть, но Артур был, как труп
// -- казалось, надвигающиеся воздухоплавающие грызуны загипнотизировали его.

import org.junit.jupiter.api.*;
import text.Creature;
import text.Person;

import static org.junit.jupiter.api.Assertions.*;

public class TextTest {

    Person ford;
    Person zafod;
    Person artur;

    Creature rat;

    @BeforeEach
    void init() throws Exception {
        ford = new Person("Ford", 100, 190);
        zafod = new Person("Zafod", 200, 170);
        artur = new Person("Artur", 300, 400);

        rat = new Creature("Грузун");
    }

    @Nested
    class PersonConstructorTest {

        @Test
        @DisplayName("check valid constructor")
        void basicTest() throws Exception {
            Person person = new Person("Ford", 100, 190);
            assertEquals(person, ford);
        }

        @Test
        @DisplayName("person constructor test (height)")
        void testWithNegativeHeight() {
            Exception e = assertThrows(Exception.class, () -> new Person("TestE", 100, -100));
            assertEquals("Height must be more than zero!", e.getMessage());
        }

        @Test
        @DisplayName("person constructor test (weight)")
        void testWithNegativeWeight() {
            Exception e = assertThrows(Exception.class, () -> new Person("TestE", -100, 100));
            assertEquals("Weight must be more than zero!", e.getMessage());
        }
    }

    @Nested
    class CreatureTest{

        @Test
        void hypnoTest(){
            rat.hypnotise(ford);
            Assertions.assertEquals("Ford", rat.getHypnotiseOf());
        }
    }
}
