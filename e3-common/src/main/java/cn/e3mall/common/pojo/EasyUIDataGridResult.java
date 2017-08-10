package cn.e3mall.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 分页
 * <p>
 * Title: EasyUIDataGridResult
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company: www.itcast.cn
 * </p>
 * 
 * @version 1.0
 */
public class EasyUIDataGridResult implements Serializable {

	private static final long serialVersionUID = 2042280482739974978L;
	
	private long total;
	private List rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

}
