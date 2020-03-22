package ru.job4j.overlap;

public class ProductMonitor implements PriceUpdate{

    /**
     * Массив для хранения цен
     */

    @Override
    public Price[] merge(Price[] currentPrices, Price[] incomingPrices) {
        Price[] updated = new Price[currentPrices.length + incomingPrices.length];
        int indexUP = 0;
        for(int indexIP = 0; indexIP < incomingPrices.length; indexIP++) {
            for(int indexCP = 0; indexCP < currentPrices.length; indexCP++) {
                if(matchFound(currentPrices, indexCP, incomingPrices, indexIP)) {
                        if(isOverlaps(currentPrices, indexCP, incomingPrices, indexIP)) {
                            updated[indexUP++] = currentPrices[indexCP];
                        }
                } else {
                    updated[indexUP++] = currentPrices[indexCP];
                }
            }
        }
        System.out.println("Prices is up to date");
        return updated;
    }

    private boolean matchFound(Price[] currentPrices, int indexCP, Price[] incomingPrices, int indexIP) {
        if (incomingPrices[indexIP].getProduct_code().equals(currentPrices[indexCP].getProduct_code()) &&
                incomingPrices[indexIP].getNumber() == currentPrices[indexCP].getNumber() &&
                incomingPrices[indexIP].getDepart() == currentPrices[indexCP].getDepart()) {
            return true;
        }
        return false;
    }

    private boolean isOverlaps(Price[] currentPrices, int indexCP, Price[] incomingPrices, int indexIP) {
        if(currentPrices[indexCP].getValue() == incomingPrices[indexIP].getValue()) {
            if(currentPrices[indexCP].getBegin().compareTo(incomingPrices[indexIP].getBegin()) > 0) {
                currentPrices[indexCP].setBegin(incomingPrices[indexIP].getBegin());
            }
            if(currentPrices[indexCP].getEnd().compareTo(incomingPrices[indexIP].getEnd()) < 0) {
                currentPrices[indexCP].setEnd(incomingPrices[indexIP].getEnd());
            }
            return true;
        } else {

        }
        return false;
    }

}
