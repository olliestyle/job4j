package ru.job4j.overlap;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PriceUpdater implements PriceUpdate {

    @Override
    public List<Price> merge(List<Price> currentPrices, List<Price> newPrices) {
        List<Price> updated = new ArrayList<>();
        for (Price currentPrice: currentPrices) {
            for (Price newPrice: newPrices) {
                if (isMatchFound(currentPrice, newPrice)) {
                    if (isNotOverlaps(currentPrice, newPrice)) {
                        if (!updated.contains(currentPrice)) {
                            updated.add(currentPrice);
                        }
                        updated.add(newPrice);
                    } else {
                        List<Price> toAdd = overlaps(currentPrice, newPrice);
                        updated.addAll(toAdd);
                    }
                }
            }
        }
        return updated;
    }

    private boolean isMatchFound(Price currentPrice, Price newPrice) {
        if (newPrice.getProductCode().equals(currentPrice.getProductCode())
                && newPrice.getNumber() == currentPrice.getNumber()
               && newPrice.getDepart() == currentPrice.getDepart()) {
            return true;
        }
        return false;
    }

    private boolean isNotOverlaps(Price currentPrice, Price newPrice) {
        if (currentPrice.getBegin().compareTo(newPrice.getBegin()) > 0 && currentPrice.getBegin().compareTo(newPrice.getEnd()) > 0
                || currentPrice.getEnd().compareTo(newPrice.getBegin()) < 0 && currentPrice.getEnd().compareTo(newPrice.getEnd()) < 0) {
            return true;
        }
        return false;
    }

    private List<Price> overlaps(Price currentPrice, Price newPrice) {
        List<Price> toAdd = new ArrayList<>();
        if (currentPrice.getValue() == newPrice.getValue()) {
            if (currentPrice.getBegin().compareTo(newPrice.getBegin()) > 0) {
                currentPrice.setBegin(newPrice.getBegin());
            }
            if (currentPrice.getEnd().compareTo(newPrice.getEnd()) < 0) {
                currentPrice.setEnd(newPrice.getEnd());
            }
            toAdd.add(currentPrice);
            return toAdd;
        } else {
            if (currentPrice.getBegin().compareTo(newPrice.getBegin()) > 0
                    && currentPrice.getBegin().compareTo(newPrice.getEnd()) < 0
              && currentPrice.getEnd().compareTo(newPrice.getEnd()) > 0) {
                currentPrice.setBegin(newPrice.getEnd());
                toAdd.add(newPrice);
                toAdd.add(currentPrice);
                return toAdd;
            } else if (currentPrice.getBegin().compareTo(newPrice.getBegin()) < 0
                     && currentPrice.getEnd().compareTo(newPrice.getBegin()) > 0
                     && currentPrice.getEnd().compareTo(newPrice.getEnd()) < 0) {
                        currentPrice.setEnd(newPrice.getBegin());
                        toAdd.add(currentPrice);
                        toAdd.add(newPrice);
            } else if (currentPrice.getBegin().compareTo(newPrice.getBegin()) > 0
                    && currentPrice.getEnd().compareTo(newPrice.getEnd()) < 0) {
                toAdd.add(newPrice);
                return toAdd;
            } else {
                LocalDateTime temp = currentPrice.getEnd();
                currentPrice.setEnd(newPrice.getBegin());
//                Price tempPrice = (Price) currentPrice.clone();
                Price tempPrice = new Price(currentPrice);
                tempPrice.equals(currentPrice);
                toAdd.add(tempPrice);
                toAdd.add(newPrice);
                currentPrice.setBegin(newPrice.getEnd());
                currentPrice.setEnd(temp);
                toAdd.add(currentPrice);
                return toAdd;

            }
        }
        return toAdd;
    }

}
