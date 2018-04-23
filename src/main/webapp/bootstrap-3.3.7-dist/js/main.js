$(document).ready(function () {
    alert("加载了");
    var table = $('#table3');

    table.bootstrapTable('destroy');

    table.bootstrapTable({
        url: "test2.do",
        method: 'POST',
        sidePagination: "server",
        contentType: "application/x-www-form-urlencoded",
        queryParams: function (params) {
            params.limit = this.pageSize;
            params.offset = this.pageNumber;
            params.order = "customer_id desc";
            return params;
        },
        pageNumber: 0,// 首页页码
        pageSize: 20,// 页面数据条数
        striped: true,
        pagination: true,
        pageList: [10, 20, 50, 100],
        showToggle:true,
        showRefresh:true,
        showColumn:true,
        sortable:true,
        idField:"customer_id",
        columns:[
            {checkbox: true,align: 'center'},
            {field: 'address',title: 'address'},
            {field: 'customer_name',title: 'customer_name'},
            {field: 'contact_name',title: 'contact_name'},
            {field: 'phone',title: 'phone'},
            {field: 'customer_id',title: 'customer_id'},
            {field: 'province',title: 'province'},
            {field: 'city',title: 'city'},
            {field: 'sale_employee_id',title: 'sale_employee_id'},
            {field: 'credit_limit',title: 'credit_limit'}
            ],
        toolbar: '#toolbar',
        onLoadSuccess: function () {
            //加载成功时执行
            console.log("加载成功!");
        }, onLoadError: function () {
            //加载失败时执行
            // layer.msg("加载失败!", {icon: 2, time: 2000});
        }, formatLoadingMessage: function () {
            //正在加载
            return "请稍等，正在加载中...";
        }, formatNoMatches: function () {
            //没有匹配的结果
            return '无符合条件的记录';
        }
    });

});
