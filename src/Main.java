public class Main {
    public static void main(String[] args) {
        int startingScore = 200; //начальный счет
        int replenishmentAmount = 300; // сумма пополнения
        int bonus = 1; // количество бонусов за каждые 100 рублей
        int bonusMiles = 0;// количество бонусов, которые получит клиент, за пополнение меньше, чем на 1000 рублей

        if (replenishmentAmount > 1000) {
            bonusMiles = replenishmentAmount * bonus / 100;// если сумма пополнения больше 1000, бонус будет рассчитан по формуле  bonusMiles = replenishmentAmount * bonus / 100
        }
        int totalAmount = startingScore + replenishmentAmount + bonusMiles;// итоговая сумма
        System.out.println("Количество бонусных рублей: " + bonusMiles + " руб.");
        System.out.println("Итоговая сумма: " + totalAmount + " руб.");
    }
}