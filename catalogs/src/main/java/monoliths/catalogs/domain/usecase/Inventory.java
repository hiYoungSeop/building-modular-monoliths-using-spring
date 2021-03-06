package monoliths.catalogs.domain.usecase;

import monoliths.catalogs.domain.entity.Sku;
import monoliths.context.beans.Published;

import java.util.UUID;

@Published
public interface Inventory {

    Sku getSku(UUID skuId);

    long getStockFor(Sku sku);

    void verifyStockAvailabilityFor(Sku sku, long amount);

    void incomingFor(Sku sku, long stockAmount);

    void outgoingFor(Sku sku, long stockAmount);

}
