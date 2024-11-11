import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Description;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    @Test
    @DisplayName("Valid name")
    @Description("Должно быть true для корректного имени")
    public void testValidName() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue("Должно быть true для корректного имени", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Too short")
    @Description("Короткое имя")
    public void testNameTooShort() {
        Account account = new Account("Тим");
        assertFalse("Должно быть false для имени менее 3 символов", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Too long")
    @Description("Очень длинное имя")
    public void testNameTooLong() {
        Account account = new Account("Тимоти Шаламе Мартин");
        assertFalse("Должно быть false для имени более 19 символов", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("No space")
    @Description("Отсутствует пробел")
    public void testNoSpace() {
        Account account = new Account("ТимотиШаламе");
        assertFalse("Должно быть false для имени без пробелов", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Multiple spaces")
    @Description("Лишний пробел")
    public void testMultipleSpaces() {
        Account account = new Account("Тимоти  Шаламе");
        assertFalse("Должно быть false для имени с несколькими пробелами", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Space at start")
    @Description("Пробел в начале имени")
    public void testSpaceAtStart() {
        Account account = new Account(" Тимоти Шаламе");
        assertFalse("Должно быть false для имени с пробелом в начале", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Space at end")
    @Description("Пробел в конце имени")
    public void testSpaceAtEnd() {
        Account account = new Account("Тимоти Шаламе ");
        assertFalse("Должно быть false для имени с пробелом в конце", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Numb in name")
    @Description("Цифра в имени")
    public void testNumbAtName() {
        Account account = new Account("Тимоти1 Шаламе");
        assertFalse("Должно быть false для имени с цифрами", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Special characters in name")
    @Description("Спецсимвол в имени")
    public void testCharAtName() {
        Account account = new Account("Тимоти Ш@ламе");
        assertFalse("Должно быть false для имени со спецсимволом", account.checkNameToEmboss());
    }

}
