$(function(){
	//点击右上角登陆按钮，弹出登陆面板
	$("#mainPage_index").click(showWindown);
	
	//绑定登录单击事件
	$("#mainPage_login").click(loginAction);
	//绑定注册单击事件
	$("#mainPage_regist").click(registAction);
	
	//取消按钮
	$("#mainPage_cancel").click(cancelWindown);
	
})

/**
 * 点击右上角登陆按钮，弹出登陆面板
 */
function showWindown(){
	debugger;
	$('#mainPage_modal').show();
}

//取消按钮
function cancelWindown(){
	$('#mainPage_modal').hide();
}

/**
 * 登陆
 */
function loginAction(){
	debugger;
	//alert("绑定成功!");
	//清空提示信息
	$("#count_span").html("");
	$("#password_span").html("");
	//获取参数
	var name =$("#count").val().trim();
	var password=$("#password").val().trim();
	//alert(name+","+password);
	//参数数据格式校验
	var ok=true;
	if(name==""){
		$("#count_span").html("用户名为空");
		ok=false;
	}
	if(password==""){
		$("#password_span").html("密码为空");
		ok=false;
	}
	if(ok){ //通过格式校验
		debugger;
		//发送ajax请求
		$.ajax({
			url:path+"/user/login.do",
			type:"post",
			dataType:"json",
			data:{"account":name,"pswd":password},
			success:function(result){
				if(result.state==0){//成功
					var user=result.data;
					addCookie("userId",user.id,2);
					window.location.href="activity.html";
				}else if(result.state==2){//用户名错误
					$("#count_span").html(result.message);
				}else if(result.state==3){//密码错误
					$("#password_span").html(result.message);
				}
			},
			error:function(){
				alert("登录失败");
			}
		});
	}
}
/**
 * 注册，跳去另一个
 */		
function registAction(){
	debugger;
	$("#mainPage_loginIndex").hide();
	$("#mainPage_zc").show();
			//清除提示信息内容
			$("#warning_1 span").html("");
			$("#warning_2 span").html("");
			$("#warning_3 span").html("");
			//获取参数
			var name
				=$("#regist_username").val().trim();
			var nick
				=$("#nickname").val().trim();
			var password
				=$("#regist_password").val().trim();
			var final_password
				=$("#final_password").val().trim();
			//校验格式
			var ok=true;
			//检测用户名
			if(name==""){
				ok=false;
				$("#warning_1 span").html("用户名为空");
				$("#warning_1").show();
			}
			//检测密码
			if(password==""){
				ok=false;
				$("#warning_2 span").html("密码为空");
				$("#warning_2").show();
			}else if(password.length<6){
				ok=false;
				$("#warning_2 span").html("密码长度小于6位");
				$("#warning_2").show();
			}
			//检测确认密码
			if(final_password!=password){
				ok=false;
				$("#warning_3 span").html("输入密码不一致");
				$("#warning_3").show();
			}
			if(ok){
				$.ajax({
					url:path+"/user/regist.do",
					type:"post",
					data:{
						"account":name,
						"user_name":nick,
						"pswd":password
					},
					dataType:"json",
					
					success:function(result){
						debugger;
						if(result.state==0){
							var user=result.data;
							//返回登录页面
							$("#back").click();
							//设置用户名输入域数据
							$("#count").val(user.name);
							//密码输入域获得焦点
							$("#password").focus();
						}else if(result.state==2){
							$("#warning_1 span").html(result.message);
							$("#warning_1").show();
						}
					},
					error:function(data){
						debugger;
						alert("注册失败");
					}
				});
			}
		}