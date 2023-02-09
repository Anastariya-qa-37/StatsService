## StatsService
# Домашнее задание к занятию «Строки и массивы»
## Задание 1. Статистика (обязательное к выполнению)
Статистика — очень важный компонент любого бизнеса. У вас есть набор данных о продажах конкретного предприятия по месяцам: [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18].

Программисты все заняты, и вам поручили написать небольшой сервис, который умеет по предоставленному ему массиву месячных продаж рассчитывать:

Сумму всех продаж.
Среднюю сумму продаж в месяц.
Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.
Количество месяцев, в которых продажи были ниже среднего (см. п.2).
Количество месяцев, в которых продажи были выше среднего (см. п.2).
Примечание:* в вашем задании нужно найти последний месяц, соответствующий условиям.

Сервис должен представлять собой один класс с шестью методами — по методу на пункт. Входные данные для расчёта сервис должен принимать в параметрах своих методов. Обратите внимание, что написанный класс должен уметь работать с любыми значениями в массиве продаж, а приведённый выше набор — это лишь пример данных для ваших тестов на методы создаваемого класса.

Метод ниже считает номер месяца минимальных продаж. Логика его такова: заводим переменную minMonth для хранения номера ячейки в массиве того месяца, в котором были минимальные продажи среди всех уже просмотренных. Изначально мы никакие ещё не просмотрели, потому запишем туда номер 0. Будем циклом поочерёдно смотреть месяцы продаж: на каждой итерации у нас в sale будет количество продаж в рассматриваемом месяце, в month — номер этого рассматриваемого месяца. Если мы смотрим на месяц, в котором продажи меньше, чем в минимальном из просмотренных ранее, чей номер запомнен в minMonth, то считаем теперь этот рассматриваемый месяц минимальным и присваиваем в minMonth значение month. И так до конца массива продаж, тогда после цикла в minMonth у нас будет лежать номер месяца минимальных продаж. Останется только один момент: мы нумеровали месяцы с нуля, так как в массивах ячейки нумеруются с нуля, потому, отдавая ответ, нам надо прибавить 1.
'
public int minSales(long[] sales) {
  int minMonth = 0;
  int month = 0; // переменная для индекса рассматриваемого месяца в массиве
  for (long sale : sales) {
    // sales[minMonth] - продажи в месяце minMonth
    // sale - продажи в рассматриваемом месяце
    if (sale <= sales[minMonth]) {
      minMonth = month;
    }
    month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
  }
  return minMonth + 1;
}
'
###Вам необходимо

Создать Maven-проект, в котором в package ru.netology.stats будет класс StatsService с необходимыми методами, сами придумайте им говорящие названия.
Написать на каждый метод по одному автотесту, который проверяет правильность работы на тестовых данных.
Убедиться, что ваши автотесты работают и проходят. Для этого пробуйте ронять каждый свой тест и удостоверяйтесь, что он действительно падает.
Итого: отправьте на проверку ссылку на репозиторий GitHub с вашим проектом.

