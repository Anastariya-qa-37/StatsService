public class StatsService {

    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            sumMonth += sale;

        }
        return sumMonth;
    }

    public double avergSales(long[] sales) {
        double avergSum = 0;
        double sumMonth = 0;

        sumMonth = sumSales(sales);
        avergSum = sumMonth / sales.length;

        return avergSum;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int index = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = index;
            }
            index = index + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int index = 0; // переменная для индекса рассматриваемого месяца в массиве

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = index;
            }
            index = index + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int lessThanAvergSales(long[] sales) {
        int lessAvergMonth = 0;
        double avergSum = avergSales(sales);

        for (long sale : sales) {
            if (sale <= avergSum) {
                lessAvergMonth++;
            }
        }
        return lessAvergMonth;
    }

    public int aboveAvergSales(long[] sales) {
        int aboveAvergMonth = 0;
        double avergSum = avergSales(sales);

        for (long sale : sales) {
            if (sale >= avergSum) {
                aboveAvergMonth++;
            }
        }
        return aboveAvergMonth;
    }

}
