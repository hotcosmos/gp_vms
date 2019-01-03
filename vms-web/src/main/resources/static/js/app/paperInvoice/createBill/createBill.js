$(function () {
    var $createBillTableForm = $(".createBill-table-form");
    var settings = {
        url: ctx + "paperInvoice/createBill/getCreateBillList",
        pageSize: 10,
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                username: $userTableForm.find("input[name='username']").val().trim(),
                ssex: $userTableForm.find("select[name='ssex']").val(),
                status: $userTableForm.find("select[name='status']").val()
            };
        },
        columns: [{
            checkbox: true
        }, {
            field: 'userId',
            visible: false
        }, {
            field: 'username',
            title: '用户名'
        }, {
            field: 'theme',
            title: '主题',
            formatter: function (value, row, index) {
                return '<span style="width: 2rem;display: block;height: 1rem;" class="bg-' + value + '"></span>';
            }
        }, {
            field: 'avatar',
            title: '头像',
            formatter: function (value, row, index) {
                return '<img style="width: 2.6rem;border-radius: 50%;" src="' + ctx + 'img/avatar/' + value + '" >';
            }
        }, {
            field: 'deptName',
            title: '部门'
        }, {
            field: 'email',
            title: '邮箱'
        }, {
            field: 'mobile',
            title: '手机'
        }, {
            field: 'ssex',
            title: '性别',
            formatter: function (value, row, index) {
                if (value === '0') return '男';
                else if (value === '1') return '女';
                else return '保密';
            }
        }, {
            field: 'crateTime',
            title: '创建时间'
        }, {
            field: 'status',
            title: '状态',
            formatter: function (value, row, index) {
                if (value === '1') return '<span class="badge badge-success">有效</span>';
                if (value === '0') return '<span class="badge badge-warning">锁定</span>';
            }
        }

        ]
    };

    $MB.initTable('createBillTable', settings);
});

function search() {
    $MB.refreshTable('createBillTable');
}

function refresh() {
    $(".createBill-table-form")[0].reset();
    $MB.refreshTable('createBillTable');
}

function exportExcel() {
    $.post(ctx + "paperInvoice/createBill/exportExcel", $(".createBill-table-form").serialize(), function (r) {
        if (r.code === 0) {
            window.location.href = "file/download?fileName=" + r.msg + "&delete=" + true;
        } else {
            $MB.n_warning(r.msg);
        }
    });
}

function exportCsv() {
    $.post(ctx + "paperInvoice/createBill/exportCsv", $(".createBill-table-form").serialize(), function (r) {
        if (r.code === 0) {
            window.location.href = "file/download?fileName=" + r.msg + "&delete=" + true;
        } else {
            $MB.n_warning(r.msg);
        }
    });
}