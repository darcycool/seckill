package org.seckill.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by darcy on 16/5/24.
 */
@Mapper
@Repository
public interface SeckillDao {


    int reduceReserve(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    Seckill querySeckillById(long seckillId);

    List<Seckill> queryAllSeckill(@Param("offset") int offset, @Param("limit") int limit);
}
