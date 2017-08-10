package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3mall.common.pojo.EasyUIDataGridResult;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.pojo.TbItemExample.Criteria;
import cn.e3mall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	// 注入 TbItemMapper
	@Autowired()
	private TbItemMapper itemMapper;

	// 根据id查询商品
	public TbItem getItemById(Long id) {
		// 根据主键查询
		// TbItem item = itemMapper.selectByPrimaryKey(id);
		TbItemExample itemExample = new TbItemExample();
		Criteria criteria = itemExample.createCriteria();
		// 设置查询条件
		criteria.andIdEqualTo(id);
		// 返回结果
		List<TbItem> itemList = itemMapper.selectByExample(itemExample);
		if (itemList != null && itemList.size() > 0) {
			return itemList.get(0);
		}
		return null;
	}
	//分页查询
	public EasyUIDataGridResult getItemList(Integer page,Integer rows) {
		//查询所有
		PageHelper.startPage(page, rows);
		TbItemExample itemExample = new TbItemExample();
		List itemList = itemMapper.selectByExample(itemExample);
		
		EasyUIDataGridResult result = new EasyUIDataGridResult();	
		result.setRows(itemList);
		PageInfo info = new PageInfo<>(itemList);
		result.setTotal(info.getTotal());	
		return result;
	}

}
