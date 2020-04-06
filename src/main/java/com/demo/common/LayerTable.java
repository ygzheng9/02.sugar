package com.demo.common;


import com.jfinal.plugin.activerecord.Page;
import lombok.Data;

import java.util.List;

/**
 * @author zhengyg
 * @param <T> 分页查询结果 Page<User>
 * 保持和 layUI table 所需的格式，格式参见：https://www.layui.com/doc/modules/table.html#async
 * {
 *   "code": 0,
 *   "msg": "",
 *   "count": 1000,
 *   "data": [{}, {}]
 * }
 */

@Data
public class LayerTable<T> {
    private int code;
    private String msg;
    private int count;
    private List<T> data;

    private LayerTable() {
    }

    static public <T> LayerTable<T> build(Page<T> pages) {
        LayerTable<T> result = new LayerTable<T>();
        result.setCode(0);
        result.setMsg("OK");
        result.setCount(pages.getTotalRow());
        result.setData(pages.getList());

        return result;
    }
}

