import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;

public class TestPageHelper {

	/**
	 * 测试分页工具
	 * <p>
	 * Title: testPageHelper
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	@Test
	public void testPageHelper() throws Exception {
		// 初始化spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/ApplicationContext-*.xml");
		// 获得Mapper的代理对象
		TbItemMapper itemMapper = applicationContext.getBean(TbItemMapper.class);
		// 设置分页信息
		PageHelper.startPage(1, 30);
		// 执行查询
		TbItemExample example = new TbItemExample();
		List<TbItem> list = itemMapper.selectByExample(example);
		// 取分页信息
		PageInfo<TbItem> info = new PageInfo<TbItem>(list);
		System.out.println(info.getTotal());
		System.out.println(info.getPageNum());
		System.out.println(info.getPages());
		System.out.println(info.getPageSize());

	}
}
