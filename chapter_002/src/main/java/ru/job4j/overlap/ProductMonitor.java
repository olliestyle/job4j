package ru.job4j.overlap;

public class ProductMonitor implements PriceUpdate {

    /**
     * Массив для хранения цен
     */

    @Override
    public Price[] merge(Price[] currentPrices, Price[] incomingPrices) {
        Price[] mergePrice = currentPrices;
        for(int indexIP = 0; indexIP < incomingPrices.length; indexIP++) {
            for(int indexCP = 0; indexCP < currentPrices.length; indexCP++) {
                if(incomingPrices[indexIP].getProduct_code().equals(currentPrices[indexCP].getProduct_code()) &&
                   incomingPrices[indexIP].getNumber() == currentPrices[indexCP].getNumber() &&
                   incomingPrices[indexIP].getDepart() == currentPrices[indexCP].getDepart()) {
                        if(incomingPrices[indexIP].getEnd().compareTo(currentPrices[indexCP].getEnd()) > 0) {
                            mergePrice[indexCP].setEnd(incomingPrices[indexIP].getEnd());
                        }
                }
            }
        }
        return mergePrice;
    }

}
