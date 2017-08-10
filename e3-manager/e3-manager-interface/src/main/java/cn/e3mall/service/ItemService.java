package cn.e3mall.service;

import cn.e3mall.common.pojo.EasyUIDataGridResult;
import cn.e3mall.pojo.TbItem;

public interface ItemService {
	/**
	 * 根据主键查询 返回商品
	 */
	 TbItem getItemById(Long id);
	
	 /**
	  * 分页查询
	  * <p>Title: getItemList</p>
	  * <p>Description: </p>
	  * @return
	  */
	EasyUIDataGridResult getItemList(Integer page,Integer rows);
}
