$(function () {
    $("#loginSubmit").bind("click",function () {
        var userName = $('#userName').val().trim();
        var passWord = $('#passWord').val().trim();
        var data = {
            loginAct:userName,
            loginPwd:passWord
        };
        $.ajax({
            //请求方式
            type : "POST",
            //请求的媒体类型
            contentType: "application/json;charset=UTF-8",
            //请求地址
            url : "user/login/",
            //数据，json字符串
            data : JSON.stringify(data),
            //请求成功
            success : function(result) {
                window.location.href = "workbench/index";
                console.log(result);
            },
            //请求失败，包含具体的错误信息
            error : function(e){
                console.log(e.status);
                console.log(e.responseText);
            }
        });
    });
})

