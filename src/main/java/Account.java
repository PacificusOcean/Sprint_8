public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

    /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        // Проверка, что имя не равно null
        if (name == null) {
            return false;
        }

        // Проверка длины имени
        if (name.length() < 3 || name.length() > 19) {
            return false;
        }

        // Проверка наличия пробела и его позиции
        if (!name.contains(" ") || name.contains("  ") || name.indexOf(' ') == 0 || name.lastIndexOf(' ') == name.length() - 1) {
            return false;
        }

        // Регулярное выражение соответствует строкам, содержащим только буквы и пробелы
        if (!name.matches("[-zA-Zа-яА-ЯЁё\\s]+")) {
            return false;
        }


        // Если все условия выполнены, возвращаем true
        return true;
    }
}