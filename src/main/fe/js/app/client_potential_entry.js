layui.use(["form", "layer", "table", "jquery", "metis"], function () {
    const { form, layer, table, $, metis } = layui;

    const prefix = "/page/sales/client";

    const clientid = $("#clientid").val();

    /**
     * 初始化表单，要加上，不然刷新部分组件可能会不加载
     */
    form.render();

    // 当前弹出层，防止ID被覆盖
    const parentIndex = layer.index;

    form.on("submit(saveBtn)", function (data) {
        $.post(`${prefix}/potentialCreateOrUpdate`, {
            param: JSON.stringify(data.field),
        }).then(function (res) {
            if (res.state === "ok") {
                const index = layer.msg(
                    "保存成功",
                    {
                        time: 300,
                    },
                    function () {
                        // 刷新页面
                        $.get(
                            `${prefix}/potentialShow?clientid=${clientid}`
                        ).then(function (html) {
                            $("#potentialShowId").html(html);

                            // 关闭弹出层
                            layer.close(index);
                            layer.close(parentIndex);
                        });
                    }
                );
            } else {
                const index = layer.alert(
                    "保存失败，请稍后重试",
                    {
                        title: "操作失败",
                    },
                    function () {
                        // 关闭弹出层
                        layer.close(index);
                    }
                );
            }
        });

        return false;
    });
});
