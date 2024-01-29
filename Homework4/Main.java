package Homework4;

import java.time.LocalDate;

public class Main {
    // Перечисление с праздниками
    enum Holiday {
        NONE,
        NEW_YEAR,
        INTERNATIONAL_WOMENS_DAY,
        DEFENDERS_OF_THE_FATHERLAND_DAY
    }

    // Метод для поздравлений
    public static void congratulateCustomers(Customer[] customers) {
        Holiday currentHoliday = getHoliday();

        for (Customer customer : customers) {
            switch (customer.getGender()) {
                case MALE:
                    if (currentHoliday == Holiday.DEFENDERS_OF_THE_FATHERLAND_DAY) {
                        System.out.println("Поздравляем мужчину с 23 февраля!");
                    }
                    break;
                case FEMALE:
                    if (currentHoliday == Holiday.INTERNATIONAL_WOMENS_DAY) {
                        System.out.println("Поздравляем женщину с 8 марта!");
                    }
                    break;
                default:
                    if (currentHoliday == Holiday.NEW_YEAR) {
                        System.out.println("Поздравляем с Новым Годом!");
                    }
                    break;
            }
        }
    }

    // Метод для определения текущего праздника
    public static Holiday getHoliday() {
        LocalDate currentDate = LocalDate.now();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();

        if (month == 1 && day == 1) {
            return Holiday.NEW_YEAR;
        } else if (month == 3 && day == 8) {
            return Holiday.INTERNATIONAL_WOMENS_DAY;
        } else if (month == 2 && day == 23) {
            return Holiday.DEFENDERS_OF_THE_FATHERLAND_DAY;
        } else {
            return Holiday.NONE;
        }
    }

    public static void main(String[] args) {
        // Пример создания массива покупателей
        Customer[] customers = new Customer[3];
        customers[0] = new Customer();
        customers[0].setGender(Gender.MALE);
        customers[1] = new Customer();
        customers[1].setGender(Gender.FEMALE);
        customers[2] = new Customer();
        customers[2].setGender(Gender.OTHER);

        congratulateCustomers(customers);
    }
}
