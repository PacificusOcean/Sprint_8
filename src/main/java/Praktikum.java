public class Praktikum {

    public static void main(String[] args) {

        String fullName = "Тимоти Шаламе";
        Account account = new Account(fullName);
        boolean canEmboss = account.checkNameToEmboss();
        System.out.println("Можно ли использовать имя на карте " + canEmboss);

        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }

}