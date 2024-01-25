package cn.paper_card.rent.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public interface RentApi {
    @Nullable Object onPreLoginCheck(@NotNull Object event);

    @NotNull RentService getRentService();
}
