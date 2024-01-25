package cn.paper_card.rent.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface RentService {

    // 添加记录
    void addInfo(@NotNull RentInfo info) throws Exception;

    // 查询最近的一条记录
    @Nullable RentInfo queryLatest(@NotNull UUID uuid) throws Exception;

}
