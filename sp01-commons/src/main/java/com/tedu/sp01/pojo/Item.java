package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	//測試版本歷史
	//商品編號
	private Integer id;
	//商品名稱
	private String name;
	private Integer number;
}
