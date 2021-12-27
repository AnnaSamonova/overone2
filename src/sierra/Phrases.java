package sierra;

public class Phrases {
    // генератор фраз

    public static void main(String[] args) {
        // создаем набор слов
        String[] worldListOne = {"круглосуточный", "динамичный", "отличный", "умный", "взаимный" };
        String[] worldListTwo = {"трудный", "фирменный", "домашний", "центральный" };
        String[] worldListThree = {"процесс", "талант", "подход", "образец", "обзор", "портал " };

        // вычисляем кол-во слов  в кажд списке
        int oneLenght = worldListOne.length;
        int twoLenght = worldListTwo.length;
        int threeLenght = worldListThree.length;

        // генерируем три случайных числа

        int rend1 = (int) (Math.random()*oneLenght);
        int rend2 = (int) (Math.random()*twoLenght);
        int rend3 = (int) (Math.random()*threeLenght);
        // строим фразу

        String phrase = worldListOne [rend1] + " " + worldListTwo[rend2] + " " + worldListThree [rend3] + " ";
        // выводим
        System.out.println("Всё,  что нам нужно - это " + phrase);
    }
}
