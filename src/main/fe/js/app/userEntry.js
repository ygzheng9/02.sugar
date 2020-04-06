layui.use(['form', 'layer', 'table', 'jquery', 'metis'], function () {
    const { form, layer, table, $, metis } = layui;

    /**
     * 初始化表单，要加上，不然刷新部分组件可能会不加载
     */
    form.render();

    // 当前弹出层，防止ID被覆盖
    const parentIndex = layer.index;

    //监听提交
    form.on('submit(saveBtn2)', function (data) {
        data.field.roles = metis.getCheckBoxValues('roles');

        console.log(data);

        return false;
    });

    form.on('submit(saveBtn)', function (data) {
        data.field.roles = data.field.roles = metis.getCheckBoxValues('roles');

        $.post("/userCreateOrUpdate", {param: JSON.stringify(data.field)}).then(function(res) {
            if (res.state === 'ok') {
                const index = layer.alert('保存成功', {
                    title: '操作成功'
                }, function () {
                    table.reload('currentTableId');
                    // 关闭弹出层
                    layer.close(index);
                    layer.close(parentIndex);
                });
            } else {
                const index = layer.alert('保存失败，请稍后重试', {
                    title: '操作失败'
                }, function () {
                    // 关闭弹出层
                    layer.close(index);
                });
            }
        });

        return false;
    });
});


