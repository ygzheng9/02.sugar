/**
 * date:2020/04/06
 * author:zhengyg
 * version:1.0
 * description: metis 辅助函数
 */

layui.define(["jquery", "miniPage", "layer"], function (exports) {
    const { $, miniPage, layer } = layui;

    const state = {
        clientid: 0,
    };

    const metis = {
        setState: function (k, v) {
            state[k] = v;
        },

        getState: function (k) {
            return state[k];
        },

        getCheckBoxValues: function (name) {
            //获取checkbox[name='aname']的值
            const arr = [];
            $(`input:checkbox[name='${name}']:checked`).each(function (i) {
                arr.push($(this).val());
            });

            //将数组合并成字符串
            return arr.join(" ");
        },

        // 打开 entry form，如果是新增，则空表格；如果是修改，则显示当前记录
        openEntryForm: function (url, title) {
            miniPage.getHrefContentA(url).done(function (content) {
                const openWH = miniPage.getOpenWidthHeight();

                const index = layer.open({
                    title: title,
                    type: 1,
                    shade: 0.2,
                    maxmin: true,
                    shadeClose: true,
                    area: [openWH[0] + "px", openWH[1] + "px"],
                    offset: [openWH[2] + "px", openWH[3] + "px"],
                    content: content,
                });
                $(window).on("resize", function () {
                    layer.full(index);
                });
            });
        },
    };

    exports("metis", metis);
});
