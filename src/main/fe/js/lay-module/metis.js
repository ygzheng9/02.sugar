/**
 * date:2020/04/06
 * author:zhengyg
 * version:1.0
 * description: metis 辅助函数
 */


layui.define(["jquery"], function (exports) {
    const { $ } = layui;

    const metis = {
        getCheckBoxValues: function (name) {
            //获取checkbox[name='aname']的值
            const arr = [];
            $(`input:checkbox[name='${name}']:checked`).each(function(i){
                arr.push($(this).val());
            });

            //将数组合并成字符串
            return arr.join(" ");
        },
    };

    exports("metis", metis);
});
