package cn.m3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.common.pojo.EasyUIDataGridResult;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;

	// 根据id查询商品 返回json
	@RequestMapping("item/{itemId}")
	@ResponseBody
	public TbItem getItemByID(@PathVariable Long itemId) {
		try {
			TbItem thItem = itemService.getItemById(itemId);
			return thItem;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	// 分页查询
	// 根据id查询商品 返回json
	@RequestMapping("item/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
		try {
			EasyUIDataGridResult list = itemService.getItemList(page, rows);
			return list;
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return null;
	}
}
