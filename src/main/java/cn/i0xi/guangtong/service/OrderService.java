package cn.i0xi.guangtong.service;

import cn.i0xi.guangtong.domain.Order;
import cn.i0xi.guangtong.dto.OrderListDto;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 11429
* @description 针对表【order】的数据库操作Service
* @createDate 2023-07-31 13:24:01
*/
public interface OrderService extends IService<Order> {

    IPage<Order> getOrderList(OrderListDto orderListDto);

}
