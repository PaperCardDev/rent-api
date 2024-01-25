package cn.paper_card.rent.api;

import java.util.UUID;

public record RentInfo(
        UUID uuid,
        long time,
        String comment
) {
}