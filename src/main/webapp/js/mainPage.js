$(function(){
	
	//打开注册弹框单击事件
	$("#mainPage_registWindown").click(registWindown);
	//关闭注册弹框单击事件
	$("#mainPage_cancelRegist").click(cancelRegist);
	
	
	//打开登录弹框单击事件
	$("#mainPage_loginWindown").click(showLogin);
	//关闭登录弹框单击事件
	$("#mainPage_cancelLogin").click(cancelLogin);
	
	//注册按钮
	$("#mainPage_regist").click(regist);
	
	//登录按钮
	$("#mainPage_login").click(login);
	
})


function regist(){
	
	//清除提示信息内容
	$("#warning_1 span").html("");
	$("#warning_2 span").html("");
	$("#warning_3 span").html("");
	
	//获取输入框的值
	var name=$("#mainPage_name").val().trim();
	var nick=$("#mainPage_nickname").val().trim();
	var password=$("#mainPage_password").val().trim();
	var final_password=$("#mainPage_conpassword").val().trim();
	
	debugger;
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
	}else if(password.length < 6){
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
					//获取到用户的所有信息
					var user=result.data;
					//关闭弹窗
					
					//返回登录页面
//					$("#back").click();
					//设置用户名输入域数据
//					$("#count").val(user.name);
					//密码输入域获得焦点
//					$("#password").focus();
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
 * 打开注册窗口
 */	
function registWindown(){
	$("#mainPage_registModal").show();
}

/**
 * 关闭注册窗口
 */	
function cancelRegist(){
	$("#mainPage_registModal").hide();
}

/**
 * 打开登录窗口
 */	
function showLogin(){
	$("#mainPage_loginModal").show();
}

/**
 * 关闭登录窗口
 */	
function cancelLogin(){
	$("#mainPage_loginModal").hide();
}