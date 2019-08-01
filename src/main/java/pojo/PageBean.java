package pojo;

import java.util.List;

import lombok.Data;

@Data
public class PageBean<T> {

	// 当前页
	private int currentPage;
	// 当前页显示的数据
	private int currentCount;
	// 总条数
	private int totalCount;
	// 总条数
	private int totalPage;
	// 数据
	private List<T> list;
}
